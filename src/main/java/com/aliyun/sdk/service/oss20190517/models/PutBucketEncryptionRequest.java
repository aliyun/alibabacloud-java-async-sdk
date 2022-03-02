// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketEncryptionRequest} extends {@link RequestModel}
 *
 * <p>PutBucketEncryptionRequest</p>
 */
public class PutBucketEncryptionRequest extends Request {
    @Body
    @NameInMap("ServerSideEncryptionRule")
    @Validation(required = true)
    private ServerSideEncryptionRule serverSideEncryptionRule;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketEncryptionRequest(Builder builder) {
        super(builder);
        this.serverSideEncryptionRule = builder.serverSideEncryptionRule;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketEncryptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serverSideEncryptionRule
     */
    public ServerSideEncryptionRule getServerSideEncryptionRule() {
        return this.serverSideEncryptionRule;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketEncryptionRequest, Builder> {
        private ServerSideEncryptionRule serverSideEncryptionRule; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketEncryptionRequest request) {
            super(request);
            this.serverSideEncryptionRule = request.serverSideEncryptionRule;
            this.bucket = request.bucket;
        } 

        /**
         * ServerSideEncryptionRule.
         */
        public Builder serverSideEncryptionRule(ServerSideEncryptionRule serverSideEncryptionRule) {
            this.putBodyParameter("ServerSideEncryptionRule", serverSideEncryptionRule);
            this.serverSideEncryptionRule = serverSideEncryptionRule;
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
        public PutBucketEncryptionRequest build() {
            return new PutBucketEncryptionRequest(this);
        } 

    } 

}
