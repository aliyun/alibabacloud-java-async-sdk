// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ExtendBucketWormRequest} extends {@link RequestModel}
 *
 * <p>ExtendBucketWormRequest</p>
 */
public class ExtendBucketWormRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Body
    @NameInMap("extendWormConfiguration")
    @Validation(required = true)
    private ExtendWormConfiguration extendWormConfiguration;

    @Query
    @NameInMap("wormId")
    @Validation(required = true)
    private String wormId;

    private ExtendBucketWormRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.extendWormConfiguration = builder.extendWormConfiguration;
        this.wormId = builder.wormId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtendBucketWormRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return extendWormConfiguration
     */
    public ExtendWormConfiguration getExtendWormConfiguration() {
        return this.extendWormConfiguration;
    }

    /**
     * @return wormId
     */
    public String getWormId() {
        return this.wormId;
    }

    public static final class Builder extends Request.Builder<ExtendBucketWormRequest, Builder> {
        private String bucket; 
        private ExtendWormConfiguration extendWormConfiguration; 
        private String wormId; 

        private Builder() {
            super();
        } 

        private Builder(ExtendBucketWormRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.extendWormConfiguration = request.extendWormConfiguration;
            this.wormId = request.wormId;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * extendWormConfiguration.
         */
        public Builder extendWormConfiguration(ExtendWormConfiguration extendWormConfiguration) {
            this.putBodyParameter("extendWormConfiguration", extendWormConfiguration);
            this.extendWormConfiguration = extendWormConfiguration;
            return this;
        }

        /**
         * wormId.
         */
        public Builder wormId(String wormId) {
            this.putQueryParameter("wormId", wormId);
            this.wormId = wormId;
            return this;
        }

        @Override
        public ExtendBucketWormRequest build() {
            return new ExtendBucketWormRequest(this);
        } 

    } 

}
