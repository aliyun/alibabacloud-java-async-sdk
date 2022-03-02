// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketPolicyRequest} extends {@link RequestModel}
 *
 * <p>PutBucketPolicyRequest</p>
 */
public class PutBucketPolicyRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private String policy;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketPolicyRequest(Builder builder) {
        super(builder);
        this.policy = builder.policy;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketPolicyRequest, Builder> {
        private String policy; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketPolicyRequest request) {
            super(request);
            this.policy = request.policy;
            this.bucket = request.bucket;
        } 

        /**
         * body.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("body", policy);
            this.policy = policy;
            return this;
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
        public PutBucketPolicyRequest build() {
            return new PutBucketPolicyRequest(this);
        } 

    } 

}
