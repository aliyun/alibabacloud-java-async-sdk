// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutBucketAclRequest} extends {@link RequestModel}
 *
 * <p>PutBucketAclRequest</p>
 */
public class PutBucketAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketAcl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketAcl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    private PutBucketAclRequest(Builder builder) {
        super(builder);
        this.bucketAcl = builder.bucketAcl;
        this.bucketName = builder.bucketName;
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
     * @return bucketAcl
     */
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    public static final class Builder extends Request.Builder<PutBucketAclRequest, Builder> {
        private String bucketAcl; 
        private String bucketName; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketAclRequest request) {
            super(request);
            this.bucketAcl = request.bucketAcl;
            this.bucketName = request.bucketName;
        } 

        /**
         * The access control list (ACL) of the bucket.
         * <p>
         * 
         * *   **public-read-write**
         * *   **public-read**
         * *   **private** (default)
         */
        public Builder bucketAcl(String bucketAcl) {
            this.putQueryParameter("BucketAcl", bucketAcl);
            this.bucketAcl = bucketAcl;
            return this;
        }

        /**
         * The name of the bucket.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        @Override
        public PutBucketAclRequest build() {
            return new PutBucketAclRequest(this);
        } 

    } 

}
