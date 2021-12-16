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
    @Body
    @NameInMap("CORSConfiguration")
    private CORSConfiguration cORSConfiguration;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private PutBucketCorsRequest(Builder builder) {
        super(builder);
        this.cORSConfiguration = builder.cORSConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketCorsRequest create() {
        return builder().build();
    }

    /**
     * @return cORSConfiguration
     */
    public CORSConfiguration getCORSConfiguration() {
        return this.cORSConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private CORSConfiguration cORSConfiguration; 
        private String bucket; 

        /**
         * <p>CORSConfiguration.</p>
         */
        public Builder cORSConfiguration(CORSConfiguration cORSConfiguration) {
            this.putBodyParameter("CORSConfiguration", cORSConfiguration);
            this.cORSConfiguration = cORSConfiguration;
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

        public PutBucketCorsRequest build() {
            return new PutBucketCorsRequest(this);
        } 

    } 

}
