// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketVersioningRequest} extends {@link RequestModel}
 *
 * <p>PutBucketVersioningRequest</p>
 */
public class PutBucketVersioningRequest extends Request {
    @Body
    @NameInMap("VersioningConfiguration")
    @Validation(required = true)
    private VersioningConfiguration versioningConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketVersioningRequest(Builder builder) {
        super(builder);
        this.versioningConfiguration = builder.versioningConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketVersioningRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return versioningConfiguration
     */
    public VersioningConfiguration getVersioningConfiguration() {
        return this.versioningConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketVersioningRequest, Builder> {
        private VersioningConfiguration versioningConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketVersioningRequest request) {
            super(request);
            this.versioningConfiguration = request.versioningConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * VersioningConfiguration.
         */
        public Builder versioningConfiguration(VersioningConfiguration versioningConfiguration) {
            this.putBodyParameter("VersioningConfiguration", versioningConfiguration);
            this.versioningConfiguration = versioningConfiguration;
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
        public PutBucketVersioningRequest build() {
            return new PutBucketVersioningRequest(this);
        } 

    } 

}
