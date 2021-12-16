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
    @Body
    @NameInMap("LifecycleConfiguration")
    private LifecycleConfiguration lifecycleConfiguration;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private PutBucketLifecycleRequest(Builder builder) {
        super(builder);
        this.lifecycleConfiguration = builder.lifecycleConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketLifecycleRequest create() {
        return builder().build();
    }

    /**
     * @return lifecycleConfiguration
     */
    public LifecycleConfiguration getLifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private LifecycleConfiguration lifecycleConfiguration; 
        private String bucket; 

        /**
         * <p>LifecycleConfiguration.</p>
         */
        public Builder lifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
            this.putBodyParameter("LifecycleConfiguration", lifecycleConfiguration);
            this.lifecycleConfiguration = lifecycleConfiguration;
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

        public PutBucketLifecycleRequest build() {
            return new PutBucketLifecycleRequest(this);
        } 

    } 

}
