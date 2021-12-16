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
    @Body
    @NameInMap("RequestPaymentConfiguration")
    private RequestPaymentConfiguration requestPaymentConfiguration;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private RequestPaymentConfiguration requestPaymentConfiguration; 
        private String bucket; 

        /**
         * <p>RequestPaymentConfiguration.</p>
         */
        public Builder requestPaymentConfiguration(RequestPaymentConfiguration requestPaymentConfiguration) {
            this.putBodyParameter("RequestPaymentConfiguration", requestPaymentConfiguration);
            this.requestPaymentConfiguration = requestPaymentConfiguration;
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

        public PutBucketRequestPaymentRequest build() {
            return new PutBucketRequestPaymentRequest(this);
        } 

    } 

}
