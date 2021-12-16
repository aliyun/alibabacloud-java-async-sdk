// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketReplicationRequest} extends {@link RequestModel}
 *
 * <p>PutBucketReplicationRequest</p>
 */
public class PutBucketReplicationRequest extends Request {
    @Body
    @NameInMap("ReplicationConfiguration")
    private ReplicationConfiguration replicationConfiguration;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private ReplicationConfiguration replicationConfiguration; 
        private String bucket; 

        /**
         * <p>ReplicationConfiguration.</p>
         */
        public Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration) {
            this.putBodyParameter("ReplicationConfiguration", replicationConfiguration);
            this.replicationConfiguration = replicationConfiguration;
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

        public PutBucketReplicationRequest build() {
            return new PutBucketReplicationRequest(this);
        } 

    } 

}
