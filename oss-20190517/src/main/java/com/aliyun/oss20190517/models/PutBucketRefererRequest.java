// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketRefererRequest} extends {@link RequestModel}
 *
 * <p>PutBucketRefererRequest</p>
 */
public class PutBucketRefererRequest extends Request {
    @Body
    @NameInMap("RefererConfiguration")
    private RefererConfiguration refererConfiguration;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private PutBucketRefererRequest(Builder builder) {
        super(builder);
        this.refererConfiguration = builder.refererConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRefererRequest create() {
        return builder().build();
    }

    /**
     * @return refererConfiguration
     */
    public RefererConfiguration getRefererConfiguration() {
        return this.refererConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private RefererConfiguration refererConfiguration; 
        private String bucket; 

        /**
         * <p>RefererConfiguration.</p>
         */
        public Builder refererConfiguration(RefererConfiguration refererConfiguration) {
            this.putBodyParameter("RefererConfiguration", refererConfiguration);
            this.refererConfiguration = refererConfiguration;
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

        public PutBucketRefererRequest build() {
            return new PutBucketRefererRequest(this);
        } 

    } 

}
