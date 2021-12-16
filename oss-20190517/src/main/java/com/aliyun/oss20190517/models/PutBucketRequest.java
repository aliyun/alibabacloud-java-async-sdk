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
    @Body
    @NameInMap("CreateBucketConfiguration")
    private CreateBucketConfiguration createBucketConfiguration;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Header
    @NameInMap("x-oss-acl")
    private BucketACL acl;


    private PutBucketRequest(Builder builder) {
        super(builder);
        this.createBucketConfiguration = builder.createBucketConfiguration;
        this.bucket = builder.bucket;
        this.acl = builder.acl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRequest create() {
        return builder().build();
    }

    /**
     * @return createBucketConfiguration
     */
    public CreateBucketConfiguration getCreateBucketConfiguration() {
        return this.createBucketConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return acl
     */
    public BucketACL getAcl() {
        return this.acl;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private CreateBucketConfiguration createBucketConfiguration; 
        private String bucket; 
        private BucketACL acl; 

        /**
         * <p>CreateBucketConfiguration.</p>
         */
        public Builder createBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
            this.putBodyParameter("CreateBucketConfiguration", createBucketConfiguration);
            this.createBucketConfiguration = createBucketConfiguration;
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

        /**
         * <p>x-oss-acl.</p>
         */
        public Builder acl(BucketACL acl) {
            this.putHeaderParameter("x-oss-acl", acl);
            this.acl = acl;
            return this;
        }

        public PutBucketRequest build() {
            return new PutBucketRequest(this);
        } 

    } 

}
