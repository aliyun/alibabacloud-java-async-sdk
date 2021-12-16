// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketEncryptionRequest} extends {@link RequestModel}
 *
 * <p>PutBucketEncryptionRequest</p>
 */
public class PutBucketEncryptionRequest extends Request {
    @Body
    @NameInMap("ServerSideEncryptionRule")
    private ServerSideEncryptionRule serverSideEncryptionRule;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private ServerSideEncryptionRule serverSideEncryptionRule; 
        private String bucket; 

        /**
         * <p>ServerSideEncryptionRule.</p>
         */
        public Builder serverSideEncryptionRule(ServerSideEncryptionRule serverSideEncryptionRule) {
            this.putBodyParameter("ServerSideEncryptionRule", serverSideEncryptionRule);
            this.serverSideEncryptionRule = serverSideEncryptionRule;
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

        public PutBucketEncryptionRequest build() {
            return new PutBucketEncryptionRequest(this);
        } 

    } 

}
