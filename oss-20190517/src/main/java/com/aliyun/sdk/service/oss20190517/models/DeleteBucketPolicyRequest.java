// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteBucketPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketPolicyRequest</p>
 */
public class DeleteBucketPolicyRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private DeleteBucketPolicyRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBucketPolicyRequest, Builder> {
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBucketPolicyRequest request) {
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
        public DeleteBucketPolicyRequest build() {
            return new DeleteBucketPolicyRequest(this);
        } 

    } 

}
