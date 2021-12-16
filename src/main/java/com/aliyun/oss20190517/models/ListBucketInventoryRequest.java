// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListBucketInventoryRequest} extends {@link RequestModel}
 *
 * <p>ListBucketInventoryRequest</p>
 */
public class ListBucketInventoryRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("continuation-token")
    private String continuationToken;


    private ListBucketInventoryRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.continuationToken = builder.continuationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketInventoryRequest create() {
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

    public static final class Builder extends Request.Builder<Builder> {
        private String bucket; 
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
         * <p>continuation-token.</p>
         */
        public Builder continuationToken(String continuationToken) {
            this.putQueryParameter("continuation-token", continuationToken);
            this.continuationToken = continuationToken;
            return this;
        }

        public ListBucketInventoryRequest build() {
            return new ListBucketInventoryRequest(this);
        } 

    } 

}
