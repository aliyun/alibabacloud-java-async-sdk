// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketLoggingRequest} extends {@link RequestModel}
 *
 * <p>PutBucketLoggingRequest</p>
 */
public class PutBucketLoggingRequest extends Request {
    @Body
    @NameInMap("BucketLoggingStatus")
    @Validation(required = true)
    private BucketLoggingStatus bucketLoggingStatus;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<PutBucketLoggingRequest, Builder> {
        private BucketLoggingStatus bucketLoggingStatus; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketLoggingRequest request) {
            super(request);
            this.bucketLoggingStatus = request.bucketLoggingStatus;
            this.bucket = request.bucket;
        } 

        /**
         * BucketLoggingStatus.
         */
        public Builder bucketLoggingStatus(BucketLoggingStatus bucketLoggingStatus) {
            this.putBodyParameter("BucketLoggingStatus", bucketLoggingStatus);
            this.bucketLoggingStatus = bucketLoggingStatus;
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
        public PutBucketLoggingRequest build() {
            return new PutBucketLoggingRequest(this);
        } 

    } 

}
