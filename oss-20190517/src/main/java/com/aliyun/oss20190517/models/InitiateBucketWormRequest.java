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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("initiateWormConfiguration")
    private InitiateWormConfiguration initiateWormConfiguration;


    private InitiateBucketWormRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.initiateWormConfiguration = builder.initiateWormConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiateBucketWormRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return initiateWormConfiguration
     */
    public InitiateWormConfiguration initiateWormConfiguration() {
        return this.initiateWormConfiguration;
    }

    public static final class Builder extends Request.Builder<InitiateBucketWormRequest.Builder> {
        private String bucket; 
        private InitiateWormConfiguration initiateWormConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>initiateWormConfiguration.</p>
         */
        public Builder initiateWormConfiguration(InitiateWormConfiguration initiateWormConfiguration) {
            this.putBodyParameter("initiateWormConfiguration", initiateWormConfiguration);
            this.initiateWormConfiguration = initiateWormConfiguration;
            return this;
        }

        public InitiateBucketWormRequest build() {
            return new InitiateBucketWormRequest(this);
        } 

    } 

}
