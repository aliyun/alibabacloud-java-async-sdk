// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketAclRequest} extends {@link RequestModel}
 *
 * <p>PutBucketAclRequest</p>
 */
public class PutBucketAclRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Header
    @NameInMap("x-oss-acl")
    private BucketACL acl;


    private PutBucketAclRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.acl = builder.acl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketAclRequest create() {
        return builder().build();
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
        private String bucket; 
        private BucketACL acl; 

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

        public PutBucketAclRequest build() {
            return new PutBucketAclRequest(this);
        } 

    } 

}
