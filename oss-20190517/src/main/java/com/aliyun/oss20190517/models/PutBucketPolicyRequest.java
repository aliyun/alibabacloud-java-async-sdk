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
    @Body
    @NameInMap("body")
    private String policy;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String policy; 
        private String bucket; 

        /**
         * <p>body.</p>
         */
        public Builder policy(String policy) {
            this.putBodyParameter("body", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public PutBucketPolicyRequest build() {
            return new PutBucketPolicyRequest(this);
        } 

    } 

}
