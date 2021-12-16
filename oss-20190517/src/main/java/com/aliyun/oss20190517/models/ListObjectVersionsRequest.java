// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListObjectVersionsRequest</p>
 */
public class ListObjectVersionsRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("delimiter")
    private String delimiter;

    @Query
    @NameInMap("encoding-type")
    private EncodeType encodingType;

    @Query
    @NameInMap("key-marker")
    private String keyMarker;

    @Query
    @NameInMap("max-keys")
    private Long maxKeys;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("version-id-marker")
    private String versionIdMarker;


    private ListObjectVersionsRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.keyMarker = builder.keyMarker;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
        this.versionIdMarker = builder.versionIdMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectVersionsRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
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
    public EncodeType getEncodingType() {
        return this.encodingType;
    }

    /**
     * @return keyMarker
     */
    public String getKeyMarker() {
        return this.keyMarker;
    }

    /**
     * @return maxKeys
     */
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return versionIdMarker
     */
    public String getVersionIdMarker() {
        return this.versionIdMarker;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String bucket; 
        private String delimiter; 
        private EncodeType encodingType; 
        private String keyMarker; 
        private Long maxKeys; 
        private String prefix; 
        private String versionIdMarker; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The character used to group objects by name</p>
         */
        public Builder delimiter(String delimiter) {
            this.putQueryParameter("delimiter", delimiter);
            this.delimiter = delimiter;
            return this;
        }

        /**
         * <p>The encoding type of the object name in the response</p>
         */
        public Builder encodingType(EncodeType encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * <p>The name of the object from which the list operation begins</p>
         */
        public Builder keyMarker(String keyMarker) {
            this.putQueryParameter("key-marker", keyMarker);
            this.keyMarker = keyMarker;
            return this;
        }

        /**
         * <p>The maximum number of objects to return</p>
         */
        public Builder maxKeys(Long maxKeys) {
            this.putQueryParameter("max-keys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>The prefix that the returned object names must contain</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The version id of the object from which the list operation begins</p>
         */
        public Builder versionIdMarker(String versionIdMarker) {
            this.putQueryParameter("version-id-marker", versionIdMarker);
            this.versionIdMarker = versionIdMarker;
            return this;
        }

        public ListObjectVersionsRequest build() {
            return new ListObjectVersionsRequest(this);
        } 

    } 

}
