// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketReplicationLocationRequest} extends {@link RequestModel}
 *
 * <p>GetBucketReplicationLocationRequest</p>
 */
public class GetBucketReplicationLocationRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;


    private GetBucketReplicationLocationRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationLocationRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String bucket; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public GetBucketReplicationLocationRequest build() {
            return new GetBucketReplicationLocationRequest(this);
        } 

    } 

}
