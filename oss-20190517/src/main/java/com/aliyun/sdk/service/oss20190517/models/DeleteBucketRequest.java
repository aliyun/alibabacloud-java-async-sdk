// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteBucketRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketRequest</p>
 */
public class DeleteBucketRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private DeleteBucketRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBucketRequest, Builder> {
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBucketRequest request) {
            super(request);
            this.bucket = request.bucket;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        @Override
        public DeleteBucketRequest build() {
            return new DeleteBucketRequest(this);
        } 

    } 

}
