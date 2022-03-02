// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketAclRequest} extends {@link RequestModel}
 *
 * <p>PutBucketAclRequest</p>
 */
public class PutBucketAclRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Header
    @NameInMap("x-oss-acl")
    @Validation(required = true)
    private String acl;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getAcl() {
        return this.acl;
    }

    public static final class Builder extends Request.Builder<PutBucketAclRequest, Builder> {
        private String bucket; 
        private String acl; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketAclRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.acl = request.acl;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * x-oss-acl.
         */
        public Builder acl(String acl) {
            this.putHeaderParameter("x-oss-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * x-oss-acl.
         */
        public Builder acl(BucketACL acl) {
            this.putHeaderParameter("x-oss-acl", acl.getValue());
            this.acl = acl.getValue();
            return this;
        }

        @Override
        public PutBucketAclRequest build() {
            return new PutBucketAclRequest(this);
        } 

    } 

}
