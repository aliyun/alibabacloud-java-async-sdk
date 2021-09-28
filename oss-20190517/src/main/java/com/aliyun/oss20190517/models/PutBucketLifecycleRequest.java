// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketLifecycleRequest} extends {@link RequestModel}
 *
 * <p>PutBucketLifecycleRequest</p>
 */
public class PutBucketLifecycleRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("LifecycleConfiguration")
    private LifecycleConfiguration lifecycleConfiguration;


    private PutBucketLifecycleRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.lifecycleConfiguration = builder.lifecycleConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketLifecycleRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return lifecycleConfiguration
     */
    public LifecycleConfiguration lifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketLifecycleRequest.Builder> {
        private String bucket; 
        private LifecycleConfiguration lifecycleConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>LifecycleConfiguration.</p>
         */
        public Builder lifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
            this.putBodyParameter("LifecycleConfiguration", lifecycleConfiguration);
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }

        public PutBucketLifecycleRequest build() {
            return new PutBucketLifecycleRequest(this);
        } 

    } 

}
