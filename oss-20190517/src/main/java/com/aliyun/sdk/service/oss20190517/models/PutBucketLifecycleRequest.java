// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketLifecycleRequest} extends {@link RequestModel}
 *
 * <p>PutBucketLifecycleRequest</p>
 */
public class PutBucketLifecycleRequest extends Request {
    @Body
    @NameInMap("LifecycleConfiguration")
    @Validation(required = true)
    private LifecycleConfiguration lifecycleConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<PutBucketLifecycleRequest, Builder> {
        private LifecycleConfiguration lifecycleConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketLifecycleRequest request) {
            super(request);
            this.lifecycleConfiguration = request.lifecycleConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * LifecycleConfiguration.
         */
        public Builder lifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
            this.putBodyParameter("LifecycleConfiguration", lifecycleConfiguration);
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        @Override
        public PutBucketLifecycleRequest build() {
            return new PutBucketLifecycleRequest(this);
        } 

    } 

}
