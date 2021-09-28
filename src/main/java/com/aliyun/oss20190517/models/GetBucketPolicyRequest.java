// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetBucketPolicyRequest</p>
 */
public class GetBucketPolicyRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;


    private GetBucketPolicyRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketPolicyRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<GetBucketPolicyRequest.Builder> {
        private String bucket; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public GetBucketPolicyRequest build() {
            return new GetBucketPolicyRequest(this);
        } 

    } 

}
