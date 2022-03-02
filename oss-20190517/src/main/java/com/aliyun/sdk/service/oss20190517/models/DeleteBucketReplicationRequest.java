// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteBucketReplicationRequest} extends {@link RequestModel}
 *
 * <p>DeleteBucketReplicationRequest</p>
 */
public class DeleteBucketReplicationRequest extends Request {
    @Body
    @NameInMap("ReplicationRules")
    @Validation(required = true)
    private ReplicationRules body;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteBucketReplicationRequest, Builder> {
        private ReplicationRules body; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBucketReplicationRequest request) {
            super(request);
            this.body = request.body;
            this.bucket = request.bucket;
        } 

        /**
         * ReplicationRules.
         */
        public Builder body(ReplicationRules body) {
            this.putBodyParameter("ReplicationRules", body);
            this.body = body;
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
        public DeleteBucketReplicationRequest build() {
            return new DeleteBucketReplicationRequest(this);
        } 

    } 

}
