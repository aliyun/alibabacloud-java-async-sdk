// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
    @Validation(required = true)
    private String bucket;

    @Header
    @NameInMap("x-oss-acl")
    private String acl;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getAcl() {
        return this.acl;
    }

    public static final class Builder extends Request.Builder<PutBucketRequest, Builder> {
        private CreateBucketConfiguration createBucketConfiguration; 
        private String bucket; 
        private String acl; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketRequest request) {
            super(request);
            this.createBucketConfiguration = request.createBucketConfiguration;
            this.bucket = request.bucket;
            this.acl = request.acl;
        } 

        /**
         * CreateBucketConfiguration.
         */
        public Builder createBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) {
            this.putBodyParameter("CreateBucketConfiguration", createBucketConfiguration);
            this.createBucketConfiguration = createBucketConfiguration;
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
        public PutBucketRequest build() {
            return new PutBucketRequest(this);
        } 

    } 

}
