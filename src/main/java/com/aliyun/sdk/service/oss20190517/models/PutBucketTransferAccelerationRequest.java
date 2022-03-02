// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketTransferAccelerationRequest} extends {@link RequestModel}
 *
 * <p>PutBucketTransferAccelerationRequest</p>
 */
public class PutBucketTransferAccelerationRequest extends Request {
    @Body
    @NameInMap("TransferAccelerationConfiguration")
    @Validation(required = true)
    private TransferAccelerationConfiguration transferAccelerationConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketTransferAccelerationRequest(Builder builder) {
        super(builder);
        this.transferAccelerationConfiguration = builder.transferAccelerationConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketTransferAccelerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return transferAccelerationConfiguration
     */
    public TransferAccelerationConfiguration getTransferAccelerationConfiguration() {
        return this.transferAccelerationConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketTransferAccelerationRequest, Builder> {
        private TransferAccelerationConfiguration transferAccelerationConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketTransferAccelerationRequest request) {
            super(request);
            this.transferAccelerationConfiguration = request.transferAccelerationConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * TransferAccelerationConfiguration.
         */
        public Builder transferAccelerationConfiguration(TransferAccelerationConfiguration transferAccelerationConfiguration) {
            this.putBodyParameter("TransferAccelerationConfiguration", transferAccelerationConfiguration);
            this.transferAccelerationConfiguration = transferAccelerationConfiguration;
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
        public PutBucketTransferAccelerationRequest build() {
            return new PutBucketTransferAccelerationRequest(this);
        } 

    } 

}
