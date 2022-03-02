// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketRequestPaymentRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRequestPaymentRequest</p>
 */
public class PutBucketRequestPaymentRequest extends Request {
    @Body
    @NameInMap("RequestPaymentConfiguration")
    @Validation(required = true)
    private RequestPaymentConfiguration requestPaymentConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketRequestPaymentRequest(Builder builder) {
        super(builder);
        this.requestPaymentConfiguration = builder.requestPaymentConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRequestPaymentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPaymentConfiguration
     */
    public RequestPaymentConfiguration getRequestPaymentConfiguration() {
        return this.requestPaymentConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketRequestPaymentRequest, Builder> {
        private RequestPaymentConfiguration requestPaymentConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketRequestPaymentRequest request) {
            super(request);
            this.requestPaymentConfiguration = request.requestPaymentConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * RequestPaymentConfiguration.
         */
        public Builder requestPaymentConfiguration(RequestPaymentConfiguration requestPaymentConfiguration) {
            this.putBodyParameter("RequestPaymentConfiguration", requestPaymentConfiguration);
            this.requestPaymentConfiguration = requestPaymentConfiguration;
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
        public PutBucketRequestPaymentRequest build() {
            return new PutBucketRequestPaymentRequest(this);
        } 

    } 

}
