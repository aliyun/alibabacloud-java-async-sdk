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
    @NameInMap("delimiter")
    private String delimiter;

    @Query
    @NameInMap("max-keys")
    private Long maxKeys;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("encoding-type")
    private EncodeType encodingType;

    @Query
    @NameInMap("fetch-owner")
    private Boolean fetchOwner;

    @Query
    @NameInMap("start-after")
    private String startAfter;

    @Query
    @NameInMap("continuation-token")
    private String continuationToken;


    private ListObjectsV2Request(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.delimiter = builder.delimiter;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
        this.encodingType = builder.encodingType;
        this.fetchOwner = builder.fetchOwner;
        this.startAfter = builder.startAfter;
        this.continuationToken = builder.continuationToken;
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
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return delimiter
     */
    public String delimiter() {
        return this.delimiter;
    }

    /**
     * @return maxKeys
     */
    public Long maxKeys() {
        return this.maxKeys;
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * @return encodingType
     */
    public EncodeType encodingType() {
        return this.encodingType;
    }

    /**
     * @return fetchOwner
     */
    public Boolean fetchOwner() {
        return this.fetchOwner;
    }

    /**
     * @return startAfter
     */
    public String startAfter() {
        return this.startAfter;
    }

    /**
     * @return continuationToken
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    public static final class Builder extends Request.Builder<ListObjectsV2Request.Builder> {
        private String bucket; 
        private String delimiter; 
        private Long maxKeys; 
        private String prefix; 
        private EncodeType encodingType; 
        private Boolean fetchOwner; 
        private String startAfter; 
        private String continuationToken; 

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
         * <p>start-after.</p>
         */
        public Builder startAfter(String startAfter) {
            this.putQueryParameter("start-after", startAfter);
            this.startAfter = startAfter;
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

        public ListObjectsV2Request build() {
            return new ListObjectsV2Request(this);
        } 

    } 

}
