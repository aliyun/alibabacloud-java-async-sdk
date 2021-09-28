// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketLoggingRequest} extends {@link RequestModel}
 *
 * <p>PutBucketLoggingRequest</p>
 */
public class PutBucketLoggingRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("bucketLoggingStatus")
    private BucketLoggingStatus bucketLoggingStatus;


    private PutBucketLoggingRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.bucketLoggingStatus = builder.bucketLoggingStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketLoggingRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return bucketLoggingStatus
     */
    public BucketLoggingStatus bucketLoggingStatus() {
        return this.bucketLoggingStatus;
    }

    public static final class Builder extends Request.Builder<PutBucketLoggingRequest.Builder> {
        private String bucket; 
        private BucketLoggingStatus bucketLoggingStatus; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>bucketLoggingStatus.</p>
         */
        public Builder bucketLoggingStatus(BucketLoggingStatus bucketLoggingStatus) {
            this.putBodyParameter("bucketLoggingStatus", bucketLoggingStatus);
            this.bucketLoggingStatus = bucketLoggingStatus;
            return this;
        }

        public PutBucketLoggingRequest build() {
            return new PutBucketLoggingRequest(this);
        } 

    } 

}
