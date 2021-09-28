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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("TransferAccelerationConfiguration")
    private TransferAccelerationConfiguration transferAccelerationConfiguration;


    private PutBucketTransferAccelerationRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.transferAccelerationConfiguration = builder.transferAccelerationConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketTransferAccelerationRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return transferAccelerationConfiguration
     */
    public TransferAccelerationConfiguration transferAccelerationConfiguration() {
        return this.transferAccelerationConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketTransferAccelerationRequest.Builder> {
        private String bucket; 
        private TransferAccelerationConfiguration transferAccelerationConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>TransferAccelerationConfiguration.</p>
         */
        public Builder transferAccelerationConfiguration(TransferAccelerationConfiguration transferAccelerationConfiguration) {
            this.putBodyParameter("TransferAccelerationConfiguration", transferAccelerationConfiguration);
            this.transferAccelerationConfiguration = transferAccelerationConfiguration;
            return this;
        }

        public PutBucketTransferAccelerationRequest build() {
            return new PutBucketTransferAccelerationRequest(this);
        } 

    } 

}
