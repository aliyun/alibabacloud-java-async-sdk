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
    @Body
    @NameInMap("VersioningConfiguration")
    private VersioningConfiguration versioningConfiguration;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private VersioningConfiguration versioningConfiguration; 
        private String bucket; 

        /**
         * <p>VersioningConfiguration.</p>
         */
        public Builder versioningConfiguration(VersioningConfiguration versioningConfiguration) {
            this.putBodyParameter("VersioningConfiguration", versioningConfiguration);
            this.versioningConfiguration = versioningConfiguration;
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

        public PutBucketVersioningRequest build() {
            return new PutBucketVersioningRequest(this);
        } 

    } 

}
