// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InitiateBucketWormRequest} extends {@link RequestModel}
 *
 * <p>InitiateBucketWormRequest</p>
 */
public class InitiateBucketWormRequest extends Request {
    @Body
    @NameInMap("InitiateWormConfiguration")
    @Validation(required = true)
    private InitiateWormConfiguration initiateWormConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<InitiateBucketWormRequest, Builder> {
        private InitiateWormConfiguration initiateWormConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(InitiateBucketWormRequest request) {
            super(request);
            this.initiateWormConfiguration = request.initiateWormConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * InitiateWormConfiguration.
         */
        public Builder initiateWormConfiguration(InitiateWormConfiguration initiateWormConfiguration) {
            this.putBodyParameter("InitiateWormConfiguration", initiateWormConfiguration);
            this.initiateWormConfiguration = initiateWormConfiguration;
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
        public InitiateBucketWormRequest build() {
            return new InitiateBucketWormRequest(this);
        } 

    } 

}
