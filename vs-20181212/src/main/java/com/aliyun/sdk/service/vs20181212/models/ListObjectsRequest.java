// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListObjectsRequest} extends {@link RequestModel}
 *
 * <p>ListObjectsRequest</p>
 */
public class ListObjectsRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("ContinuationToken")
    private String continuationToken;

    @Query
    @NameInMap("Delimiter")
    private String delimiter;

    @Query
    @NameInMap("EncodingType")
    private String encodingType;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Prefix")
    private String prefix;

    @Query
    @NameInMap("StartAfter")
    private String startAfter;

    private ListObjectsRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.continuationToken = builder.continuationToken;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.ownerId = builder.ownerId;
        this.prefix = builder.prefix;
        this.startAfter = builder.startAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<ListObjectsRequest, Builder> {
        private String bucketName; 
        private String continuationToken; 
        private String delimiter; 
        private String encodingType; 
        private String marker; 
        private Integer maxKeys; 
        private Long ownerId; 
        private String prefix; 
        private String startAfter; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectsRequest response) {
            super(response);
            this.bucketName = response.bucketName;
            this.continuationToken = response.continuationToken;
            this.delimiter = response.delimiter;
            this.encodingType = response.encodingType;
            this.marker = response.marker;
            this.maxKeys = response.maxKeys;
            this.ownerId = response.ownerId;
            this.prefix = response.prefix;
            this.startAfter = response.startAfter;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * ContinuationToken.
         */
        public Builder continuationToken(String continuationToken) {
            this.putQueryParameter("ContinuationToken", continuationToken);
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * Delimiter.
         */
        public Builder delimiter(String delimiter) {
            this.putQueryParameter("Delimiter", delimiter);
            this.delimiter = delimiter;
            return this;
        }

        /**
         * EncodingType.
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("EncodingType", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * MaxKeys.
         */
        public Builder maxKeys(Integer maxKeys) {
            this.putQueryParameter("MaxKeys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * StartAfter.
         */
        public Builder startAfter(String startAfter) {
            this.putQueryParameter("StartAfter", startAfter);
            this.startAfter = startAfter;
            return this;
        }

        @Override
        public ListObjectsRequest build() {
            return new ListObjectsRequest(this);
        } 

    } 

}
