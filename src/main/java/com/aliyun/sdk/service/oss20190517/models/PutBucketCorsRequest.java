// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketCorsRequest} extends {@link RequestModel}
 *
 * <p>PutBucketCorsRequest</p>
 */
public class PutBucketCorsRequest extends Request {
    @Body
    @NameInMap("CORSConfiguration")
    @Validation(required = true)
    private CORSConfiguration cORSConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketCorsRequest(Builder builder) {
        super(builder);
        this.cORSConfiguration = builder.cORSConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketCorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cORSConfiguration
     */
    public CORSConfiguration getCORSConfiguration() {
        return this.cORSConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketCorsRequest, Builder> {
        private CORSConfiguration cORSConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketCorsRequest request) {
            super(request);
            this.cORSConfiguration = request.cORSConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * CORSConfiguration.
         */
        public Builder cORSConfiguration(CORSConfiguration cORSConfiguration) {
            this.putBodyParameter("CORSConfiguration", cORSConfiguration);
            this.cORSConfiguration = cORSConfiguration;
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
        public PutBucketCorsRequest build() {
            return new PutBucketCorsRequest(this);
        } 

    } 

}
