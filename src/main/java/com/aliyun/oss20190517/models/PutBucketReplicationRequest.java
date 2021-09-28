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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("replicationConfiguration")
    private ReplicationConfiguration replicationConfiguration;


    private PutBucketReplicationRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.replicationConfiguration = builder.replicationConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketReplicationRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return replicationConfiguration
     */
    public ReplicationConfiguration replicationConfiguration() {
        return this.replicationConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketReplicationRequest.Builder> {
        private String bucket; 
        private ReplicationConfiguration replicationConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>replicationConfiguration.</p>
         */
        public Builder replicationConfiguration(ReplicationConfiguration replicationConfiguration) {
            this.putBodyParameter("replicationConfiguration", replicationConfiguration);
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        public PutBucketReplicationRequest build() {
            return new PutBucketReplicationRequest(this);
        } 

    } 

}
