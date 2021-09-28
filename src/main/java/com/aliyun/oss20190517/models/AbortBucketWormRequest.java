// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AbortBucketWormRequest} extends {@link RequestModel}
 *
 * <p>AbortBucketWormRequest</p>
 */
public class AbortBucketWormRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;


    private AbortBucketWormRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortBucketWormRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<AbortBucketWormRequest.Builder> {
        private String bucket; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public AbortBucketWormRequest build() {
            return new AbortBucketWormRequest(this);
        } 

    } 

}
