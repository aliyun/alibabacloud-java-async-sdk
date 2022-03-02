// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListObjectVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListObjectVersionsRequest</p>
 */
public class ListObjectVersionsRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("delimiter")
    private String delimiter;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getEncodingType() {
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

    public static final class Builder extends Request.Builder<ListObjectVersionsRequest, Builder> {
        private String bucket; 
        private String delimiter; 
        private String encodingType; 
        private String keyMarker; 
        private Long maxKeys; 
        private String prefix; 
        private String versionIdMarker; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectVersionsRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.delimiter = request.delimiter;
            this.encodingType = request.encodingType;
            this.keyMarker = request.keyMarker;
            this.maxKeys = request.maxKeys;
            this.prefix = request.prefix;
            this.versionIdMarker = request.versionIdMarker;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * The character used to group objects by name
         */
        public Builder delimiter(String delimiter) {
            this.putQueryParameter("delimiter", delimiter);
            this.delimiter = delimiter;
            return this;
        }

        /**
         * The encoding type of the object name in the response
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("encoding-type", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * The encoding type of the object name in the response
         */
        public Builder encodingType(EncodeType encodingType) {
            this.putQueryParameter("encoding-type", encodingType.getValue());
            this.encodingType = encodingType.getValue();
            return this;
        }

        /**
         * The name of the object from which the list operation begins
         */
        public Builder keyMarker(String keyMarker) {
            this.putQueryParameter("key-marker", keyMarker);
            this.keyMarker = keyMarker;
            return this;
        }

        /**
         * The maximum number of objects to return
         */
        public Builder maxKeys(Long maxKeys) {
            this.putQueryParameter("max-keys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * The prefix that the returned object names must contain
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * The version id of the object from which the list operation begins
         */
        public Builder versionIdMarker(String versionIdMarker) {
            this.putQueryParameter("version-id-marker", versionIdMarker);
            this.versionIdMarker = versionIdMarker;
            return this;
        }

        @Override
        public ListObjectVersionsRequest build() {
            return new ListObjectVersionsRequest(this);
        } 

    } 

}
