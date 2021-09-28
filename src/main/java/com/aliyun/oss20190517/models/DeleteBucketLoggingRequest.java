// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteBucketLoggingRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketLoggingRequest</p>
 */
public class DeleteBucketLoggingRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;


    private DeleteBucketLoggingRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketLoggingRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<DeleteBucketLoggingRequest.Builder> {
        private String bucket; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public DeleteBucketLoggingRequest build() {
            return new DeleteBucketLoggingRequest(this);
        } 

    } 

}
