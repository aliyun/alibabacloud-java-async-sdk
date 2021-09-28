// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketRequestPaymentRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRequestPaymentRequest</p>
 */
public class PutBucketRequestPaymentRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("requestPaymentConfiguration")
    private RequestPaymentConfiguration requestPaymentConfiguration;


    private PutBucketRequestPaymentRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.requestPaymentConfiguration = builder.requestPaymentConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRequestPaymentRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return requestPaymentConfiguration
     */
    public RequestPaymentConfiguration requestPaymentConfiguration() {
        return this.requestPaymentConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketRequestPaymentRequest.Builder> {
        private String bucket; 
        private RequestPaymentConfiguration requestPaymentConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>requestPaymentConfiguration.</p>
         */
        public Builder requestPaymentConfiguration(RequestPaymentConfiguration requestPaymentConfiguration) {
            this.putBodyParameter("requestPaymentConfiguration", requestPaymentConfiguration);
            this.requestPaymentConfiguration = requestPaymentConfiguration;
            return this;
        }

        public PutBucketRequestPaymentRequest build() {
            return new PutBucketRequestPaymentRequest(this);
        } 

    } 

}
