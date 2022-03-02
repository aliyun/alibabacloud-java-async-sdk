// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketRequestPaymentRequest} extends {@link RequestModel}
 *
 * <p>GetBucketRequestPaymentRequest</p>
 */
public class GetBucketRequestPaymentRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private GetBucketRequestPaymentRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketRequestPaymentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<GetBucketRequestPaymentRequest, Builder> {
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(GetBucketRequestPaymentRequest request) {
            super(request);
            this.bucket = request.bucket;
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
        public GetBucketRequestPaymentRequest build() {
            return new GetBucketRequestPaymentRequest(this);
        } 

    } 

}
