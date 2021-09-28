// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRequest</p>
 */
public class PutBucketRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Header
    @NameInMap("x-oss-acl")
    private BucketACL acl;

    @Body
    @NameInMap("createBucketConfiguration")
    private CreateBucketConfiguration createBucketConfiguration;


    private PutBucketRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.acl = builder.acl;
        this.createBucketConfiguration = builder.createBucketConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return acl
     */
    public BucketACL acl() {
        return this.acl;
    }

    /**
     * @return createBucketConfiguration
     */
    public CreateBucketConfiguration createBucketConfiguration() {
        return this.createBucketConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketRequest.Builder> {
        private String bucket; 
        private BucketACL acl; 
        private CreateBucketConfiguration createBucketConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>x-oss-acl.</p>
         */
        public Builder acl(BucketACL acl) {
            this.putHeaderParameter("x-oss-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>createBucketConfiguration.</p>
         */
        public Builder createBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
            this.putBodyParameter("createBucketConfiguration", createBucketConfiguration);
            this.createBucketConfiguration = createBucketConfiguration;
            return this;
        }

        public PutBucketRequest build() {
            return new PutBucketRequest(this);
        } 

    } 

}
