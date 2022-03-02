// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketRefererRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRefererRequest</p>
 */
public class PutBucketRefererRequest extends Request {
    @Body
    @NameInMap("RefererConfiguration")
    @Validation(required = true)
    private RefererConfiguration refererConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketRefererRequest(Builder builder) {
        super(builder);
        this.refererConfiguration = builder.refererConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRefererRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return refererConfiguration
     */
    public RefererConfiguration getRefererConfiguration() {
        return this.refererConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketRefererRequest, Builder> {
        private RefererConfiguration refererConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketRefererRequest request) {
            super(request);
            this.refererConfiguration = request.refererConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * RefererConfiguration.
         */
        public Builder refererConfiguration(RefererConfiguration refererConfiguration) {
            this.putBodyParameter("RefererConfiguration", refererConfiguration);
            this.refererConfiguration = refererConfiguration;
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
        public PutBucketRefererRequest build() {
            return new PutBucketRefererRequest(this);
        } 

    } 

}
