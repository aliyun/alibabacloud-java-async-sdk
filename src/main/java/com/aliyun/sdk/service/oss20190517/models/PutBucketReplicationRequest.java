// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketReplicationRequest} extends {@link RequestModel}
 *
 * <p>PutBucketReplicationRequest</p>
 */
public class PutBucketReplicationRequest extends Request {
    @Body
    @NameInMap("ReplicationConfiguration")
    @Validation(required = true)
    private ReplicationConfiguration replicationConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketReplicationRequest(Builder builder) {
        super(builder);
        this.replicationConfiguration = builder.replicationConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketReplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return replicationConfiguration
     */
    public ReplicationConfiguration getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketReplicationRequest, Builder> {
        private ReplicationConfiguration replicationConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketReplicationRequest request) {
            super(request);
            this.replicationConfiguration = request.replicationConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * ReplicationConfiguration.
         */
        public Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration) {
            this.putBodyParameter("ReplicationConfiguration", replicationConfiguration);
            this.replicationConfiguration = replicationConfiguration;
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
        public PutBucketReplicationRequest build() {
            return new PutBucketReplicationRequest(this);
        } 

    } 

}
