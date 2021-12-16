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
    @Body
    @NameInMap("BucketLoggingStatus")
    private BucketLoggingStatus bucketLoggingStatus;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private PutBucketLoggingRequest(Builder builder) {
        super(builder);
        this.bucketLoggingStatus = builder.bucketLoggingStatus;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketLoggingRequest create() {
        return builder().build();
    }

    /**
     * @return bucketLoggingStatus
     */
    public BucketLoggingStatus getBucketLoggingStatus() {
        return this.bucketLoggingStatus;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private BucketLoggingStatus bucketLoggingStatus; 
        private String bucket; 

        /**
         * <p>BucketLoggingStatus.</p>
         */
        public Builder bucketLoggingStatus(BucketLoggingStatus bucketLoggingStatus) {
            this.putBodyParameter("BucketLoggingStatus", bucketLoggingStatus);
            this.bucketLoggingStatus = bucketLoggingStatus;
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

        public PutBucketLoggingRequest build() {
            return new PutBucketLoggingRequest(this);
        } 

    } 

}
