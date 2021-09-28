// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketVersioningRequest} extends {@link RequestModel}
 *
 * <p>PutBucketVersioningRequest</p>
 */
public class PutBucketVersioningRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("versioningConfiguration")
    private VersioningConfiguration versioningConfiguration;


    private PutBucketVersioningRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.versioningConfiguration = builder.versioningConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketVersioningRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return versioningConfiguration
     */
    public VersioningConfiguration versioningConfiguration() {
        return this.versioningConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketVersioningRequest.Builder> {
        private String bucket; 
        private VersioningConfiguration versioningConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>versioningConfiguration.</p>
         */
        public Builder versioningConfiguration(VersioningConfiguration versioningConfiguration) {
            this.putBodyParameter("versioningConfiguration", versioningConfiguration);
            this.versioningConfiguration = versioningConfiguration;
            return this;
        }

        public PutBucketVersioningRequest build() {
            return new PutBucketVersioningRequest(this);
        } 

    } 

}
