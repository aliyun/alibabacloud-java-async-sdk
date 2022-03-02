// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListObjectsV2Request} extends {@link RequestModel}
 *
 * <p>ListObjectsV2Request</p>
 */
public class ListObjectsV2Request extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("continuation-token")
    private String continuationToken;

    @Query
    @NameInMap("delimiter")
    private String delimiter;

    @Query
    @NameInMap("encoding-type")
    private String encodingType;

    @Query
    @NameInMap("fetch-owner")
    private Boolean fetchOwner;

    @Query
    @NameInMap("max-keys")
    private Long maxKeys;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("start-after")
    private String startAfter;

    private ListObjectsV2Request(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.continuationToken = builder.continuationToken;
        this.delimiter = builder.delimiter;
        this.encodingType = builder.encodingType;
        this.fetchOwner = builder.fetchOwner;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
        this.startAfter = builder.startAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectsV2Request create() {
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
     * @return fetchOwner
     */
    public Boolean getFetchOwner() {
        return this.fetchOwner;
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

    public static final class Builder extends Request.Builder<ListObjectsV2Request, Builder> {
        private String bucket; 
        private String continuationToken; 
        private String delimiter; 
        private String encodingType; 
        private Boolean fetchOwner; 
        private Long maxKeys; 
        private String prefix; 
        private String startAfter; 

        private Builder() {
            super();
        } 

        private Builder(ListObjectsV2Request request) {
            super(request);
            this.bucket = request.bucket;
            this.continuationToken = request.continuationToken;
            this.delimiter = request.delimiter;
            this.encodingType = request.encodingType;
            this.fetchOwner = request.fetchOwner;
            this.maxKeys = request.maxKeys;
            this.prefix = request.prefix;
            this.startAfter = request.startAfter;
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
         * continuation-token.
         */
        public Builder continuationToken(String continuationToken) {
            this.putQueryParameter("continuation-token", continuationToken);
            this.continuationToken = continuationToken;
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
         * fetch-owner.
         */
        public Builder fetchOwner(Boolean fetchOwner) {
            this.putQueryParameter("fetch-owner", fetchOwner);
            this.fetchOwner = fetchOwner;
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
         * start-after.
         */
        public Builder startAfter(String startAfter) {
            this.putQueryParameter("start-after", startAfter);
            this.startAfter = startAfter;
            return this;
        }

        @Override
        public ListObjectsV2Request build() {
            return new ListObjectsV2Request(this);
        } 

    } 

}
