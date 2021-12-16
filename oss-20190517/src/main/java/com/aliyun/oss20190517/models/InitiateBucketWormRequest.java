// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InitiateBucketWormRequest} extends {@link RequestModel}
 *
 * <p>InitiateBucketWormRequest</p>
 */
public class InitiateBucketWormRequest extends Request {
    @Body
    @NameInMap("InitiateWormConfiguration")
    private InitiateWormConfiguration initiateWormConfiguration;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private InitiateBucketWormRequest(Builder builder) {
        super(builder);
        this.initiateWormConfiguration = builder.initiateWormConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateBucketWormRequest create() {
        return builder().build();
    }

    /**
     * @return initiateWormConfiguration
     */
    public InitiateWormConfiguration getInitiateWormConfiguration() {
        return this.initiateWormConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private InitiateWormConfiguration initiateWormConfiguration; 
        private String bucket; 

        /**
         * <p>InitiateWormConfiguration.</p>
         */
        public Builder initiateWormConfiguration(InitiateWormConfiguration initiateWormConfiguration) {
            this.putBodyParameter("InitiateWormConfiguration", initiateWormConfiguration);
            this.initiateWormConfiguration = initiateWormConfiguration;
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

        public InitiateBucketWormRequest build() {
            return new InitiateBucketWormRequest(this);
        } 

    } 

}
