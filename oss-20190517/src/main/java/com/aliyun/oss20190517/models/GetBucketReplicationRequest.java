// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketReplicationRequest} extends {@link RequestModel}
 *
 * <p>GetBucketReplicationRequest</p>
 */
public class GetBucketReplicationRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;


    private GetBucketReplicationRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<GetBucketReplicationRequest.Builder> {
        private String bucket; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public GetBucketReplicationRequest build() {
            return new GetBucketReplicationRequest(this);
        } 

    } 

}
