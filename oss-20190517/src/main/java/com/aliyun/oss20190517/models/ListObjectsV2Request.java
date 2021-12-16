// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListObjectsV2Request} extends {@link RequestModel}
 *
 * <p>ListObjectsV2Request</p>
 */
public class ListObjectsV2Request extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("continuation-token")
    private String continuationToken;

    @Query
    @NameInMap("delimiter")
    private String delimiter;

    @Query
    @NameInMap("encoding-type")
    private EncodeType encodingType;

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
    public EncodeType getEncodingType() {
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

    public static final class Builder extends Request.Builder<Builder> {
        private String bucket; 
        private String continuationToken; 
        private String delimiter; 
        private EncodeType encodingType; 
        private Boolean fetchOwner; 
        private Long maxKeys; 
        private String prefix; 
        private String startAfter; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>continuation-token.</p>
         */
        public Builder continuationToken(String continuationToken) {
            this.putQueryParameter("continuation-token", continuationToken);
            this.continuationToken = continuationToken;
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
         * <p>fetch-owner.</p>
         */
        public Builder fetchOwner(Boolean fetchOwner) {
            this.putQueryParameter("fetch-owner", fetchOwner);
            this.fetchOwner = fetchOwner;
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
         * <p>start-after.</p>
         */
        public Builder startAfter(String startAfter) {
            this.putQueryParameter("start-after", startAfter);
            this.startAfter = startAfter;
            return this;
        }

        public ListObjectsV2Request build() {
            return new ListObjectsV2Request(this);
        } 

    } 

}
