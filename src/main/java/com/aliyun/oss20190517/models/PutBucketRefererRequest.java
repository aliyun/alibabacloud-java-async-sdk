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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("refererConfiguration")
    private RefererConfiguration refererConfiguration;


    private PutBucketRefererRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.refererConfiguration = builder.refererConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketRefererRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return refererConfiguration
     */
    public RefererConfiguration refererConfiguration() {
        return this.refererConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketRefererRequest.Builder> {
        private String bucket; 
        private RefererConfiguration refererConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>refererConfiguration.</p>
         */
        public Builder refererConfiguration(RefererConfiguration refererConfiguration) {
            this.putBodyParameter("refererConfiguration", refererConfiguration);
            this.refererConfiguration = refererConfiguration;
            return this;
        }

        public PutBucketRefererRequest build() {
            return new PutBucketRefererRequest(this);
        } 

    } 

}
