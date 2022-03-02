// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListBucketInventoryRequest} extends {@link RequestModel}
 *
 * <p>ListBucketInventoryRequest</p>
 */
public class ListBucketInventoryRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
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

    public static final class Builder extends Request.Builder<ListBucketInventoryRequest, Builder> {
        private String bucket; 
        private String continuationToken; 

        private Builder() {
            super();
        } 

        private Builder(ListBucketInventoryRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.continuationToken = request.continuationToken;
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

        @Override
        public ListBucketInventoryRequest build() {
            return new ListBucketInventoryRequest(this);
        } 

    } 

}
