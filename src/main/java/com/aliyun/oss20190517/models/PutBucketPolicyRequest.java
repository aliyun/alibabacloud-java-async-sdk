// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketPolicyRequest} extends {@link RequestModel}
 *
 * <p>PutBucketPolicyRequest</p>
 */
public class PutBucketPolicyRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("body")
    private String policy;


    private PutBucketPolicyRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketPolicyRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return policy
     */
    public String policy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<PutBucketPolicyRequest.Builder> {
        private String bucket; 
        private String policy; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder policy(String policy) {
            this.putBodyParameter("body", policy);
            this.policy = policy;
            return this;
        }

        public PutBucketPolicyRequest build() {
            return new PutBucketPolicyRequest(this);
        } 

    } 

}
