// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketVersioningRequest} extends {@link RequestModel}
 *
 * <p>GetBucketVersioningRequest</p>
 */
public class GetBucketVersioningRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;


    private GetBucketVersioningRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketVersioningRequest create() {
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

        public GetBucketVersioningRequest build() {
            return new GetBucketVersioningRequest(this);
        } 

    } 

}
