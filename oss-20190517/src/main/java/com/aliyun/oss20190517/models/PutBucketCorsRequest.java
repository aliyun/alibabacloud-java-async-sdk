// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketCorsRequest} extends {@link RequestModel}
 *
 * <p>PutBucketCorsRequest</p>
 */
public class PutBucketCorsRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("CORSConfiguration")
    private CORSConfiguration cORSConfiguration;


    private PutBucketCorsRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.cORSConfiguration = builder.cORSConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketCorsRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return cORSConfiguration
     */
    public CORSConfiguration cORSConfiguration() {
        return this.cORSConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketCorsRequest.Builder> {
        private String bucket; 
        private CORSConfiguration cORSConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>CORSConfiguration.</p>
         */
        public Builder cORSConfiguration(CORSConfiguration cORSConfiguration) {
            this.putBodyParameter("CORSConfiguration", cORSConfiguration);
            this.cORSConfiguration = cORSConfiguration;
            return this;
        }

        public PutBucketCorsRequest build() {
            return new PutBucketCorsRequest(this);
        } 

    } 

}
