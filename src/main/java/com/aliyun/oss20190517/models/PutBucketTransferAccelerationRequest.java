// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketTransferAccelerationRequest} extends {@link RequestModel}
 *
 * <p>PutBucketTransferAccelerationRequest</p>
 */
public class PutBucketTransferAccelerationRequest extends Request {
    @Body
    @NameInMap("TransferAccelerationConfiguration")
    private TransferAccelerationConfiguration transferAccelerationConfiguration;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private TransferAccelerationConfiguration transferAccelerationConfiguration; 
        private String bucket; 

        /**
         * <p>TransferAccelerationConfiguration.</p>
         */
        public Builder transferAccelerationConfiguration(TransferAccelerationConfiguration transferAccelerationConfiguration) {
            this.putBodyParameter("TransferAccelerationConfiguration", transferAccelerationConfiguration);
            this.transferAccelerationConfiguration = transferAccelerationConfiguration;
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

        public PutBucketTransferAccelerationRequest build() {
            return new PutBucketTransferAccelerationRequest(this);
        } 

    } 

}
