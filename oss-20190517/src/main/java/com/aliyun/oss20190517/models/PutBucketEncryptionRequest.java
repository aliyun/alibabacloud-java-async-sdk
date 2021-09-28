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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("serverSideEncryptionRule")
    private ServerSideEncryptionRule serverSideEncryptionRule;


    private PutBucketEncryptionRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.serverSideEncryptionRule = builder.serverSideEncryptionRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketEncryptionRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return serverSideEncryptionRule
     */
    public ServerSideEncryptionRule serverSideEncryptionRule() {
        return this.serverSideEncryptionRule;
    }

    public static final class Builder extends Request.Builder<PutBucketEncryptionRequest.Builder> {
        private String bucket; 
        private ServerSideEncryptionRule serverSideEncryptionRule; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>serverSideEncryptionRule.</p>
         */
        public Builder serverSideEncryptionRule(ServerSideEncryptionRule serverSideEncryptionRule) {
            this.putBodyParameter("serverSideEncryptionRule", serverSideEncryptionRule);
            this.serverSideEncryptionRule = serverSideEncryptionRule;
            return this;
        }

        public PutBucketEncryptionRequest build() {
            return new PutBucketEncryptionRequest(this);
        } 

    } 

}
