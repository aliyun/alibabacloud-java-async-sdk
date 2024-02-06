// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @NameInMap("EncodingType")
    private String encodingType;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("MaxKeys")
    private Long maxKeys;

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
        this.encodingType = builder.encodingType;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
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
     * @return startAfter
     */
    public String getStartAfter() {
        return this.startAfter;
    }

    public static final class Builder extends Request.Builder<ListObjectsRequest, Builder> {
        private String bucketName; 
        private String continuationToken; 
        private String encodingType; 
        private String marker; 
        private Long maxKeys; 
        private String prefix; 
        private String startAfter; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectsRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.continuationToken = request.continuationToken;
            this.encodingType = request.encodingType;
            this.marker = request.marker;
            this.maxKeys = request.maxKeys;
            this.prefix = request.prefix;
            this.startAfter = request.startAfter;
        } 

        /**
         * The name of the bucket.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The token used in this list operation. If the number of objects exceeds the value of MaxKeys, the NextContinuationToken is included in the response as the token for the next list operation.
         */
        public Builder continuationToken(String continuationToken) {
            this.putQueryParameter("ContinuationToken", continuationToken);
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * The encoding type of the object names in the response. Only URL encoding is supported.
         */
        public Builder encodingType(String encodingType) {
            this.putQueryParameter("EncodingType", encodingType);
            this.encodingType = encodingType;
            return this;
        }

        /**
         * The position from which the list operation starts. The name of the object after which the list operation starts. If this parameter is specified, objects whose names are alphabetically greater than the value of Marker are returned. The Marker parameter is used to list the returned objects by page, and its value must be less than 1,024 bytes in length.
         * <p>
         * 
         * Even if the value specified for Marker does not exist in the list during a conditional query, the list starts from the object whose name is alphabetically greater than the value of Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The maximum number of objects to return.
         * <p>
         * 
         * Valid values: 0 to 1000. Default value: 100.
         */
        public Builder maxKeys(Long maxKeys) {
            this.putQueryParameter("MaxKeys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * The prefix that must be included in the names of objects you want to list. If you specify a prefix to query objects, the returned object names contain the prefix.
         * <p>
         * 
         * The value of the parameter must be less than 1,000 bytes in length.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * The position from which the list operation starts. The name of the object after which the list operation starts. If this parameter is specified, objects whose names are alphabetically greater than the value of StartAfter are returned. The StartAfter parameter is used to list the returned objects by page, and its value must be less than 1,000 bytes in length.
         * <p>
         * 
         * Even if the value specified for StartAfter does not exist in the list during a conditional query, the list starts from the object whose name is alphabetically greater than the value of StartAfter.
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
