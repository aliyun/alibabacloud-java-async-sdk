// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ExtendBucketWormRequest} extends {@link RequestModel}
 *
 * <p>ExtendBucketWormRequest</p>
 */
public class ExtendBucketWormRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("extendWormConfiguration")
    private ExtendWormConfiguration extendWormConfiguration;

    @Query
    @NameInMap("wormId")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String bucket; 
        private ExtendWormConfiguration extendWormConfiguration; 
        private String wormId; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>extendWormConfiguration.</p>
         */
        public Builder extendWormConfiguration(ExtendWormConfiguration extendWormConfiguration) {
            this.putBodyParameter("extendWormConfiguration", extendWormConfiguration);
            this.extendWormConfiguration = extendWormConfiguration;
            return this;
        }

        /**
         * <p>wormId.</p>
         */
        public Builder wormId(String wormId) {
            this.putQueryParameter("wormId", wormId);
            this.wormId = wormId;
            return this;
        }

        public ExtendBucketWormRequest build() {
            return new ExtendBucketWormRequest(this);
        } 

    } 

}
