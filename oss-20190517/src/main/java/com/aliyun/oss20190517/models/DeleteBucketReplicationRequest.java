// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteBucketReplicationRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketReplicationRequest</p>
 */
public class DeleteBucketReplicationRequest extends Request {
    @Body
    @NameInMap("body")
    private ReplicationRules body;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private DeleteBucketReplicationRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBucketReplicationRequest create() {
        return builder().build();
    }

    /**
     * @return body
     */
    public ReplicationRules getBody() {
        return this.body;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private ReplicationRules body; 
        private String bucket; 

        /**
         * <p>body.</p>
         */
        public Builder body(ReplicationRules body) {
            this.putBodyParameter("body", body);
            this.body = body;
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

        public DeleteBucketReplicationRequest build() {
            return new DeleteBucketReplicationRequest(this);
        } 

    } 

}
