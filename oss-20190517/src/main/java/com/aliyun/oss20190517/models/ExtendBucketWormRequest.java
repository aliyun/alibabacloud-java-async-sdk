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

    @Query
    @NameInMap("wormId")
    private String wormId;

    @Body
    @NameInMap("extendWormConfiguration")
    private ExtendWormConfiguration extendWormConfiguration;


    private ExtendBucketWormRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.wormId = builder.wormId;
        this.extendWormConfiguration = builder.extendWormConfiguration;
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
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return wormId
     */
    public String wormId() {
        return this.wormId;
    }

    /**
     * @return extendWormConfiguration
     */
    public ExtendWormConfiguration extendWormConfiguration() {
        return this.extendWormConfiguration;
    }

    public static final class Builder extends Request.Builder<ExtendBucketWormRequest.Builder> {
        private String bucket; 
        private String wormId; 
        private ExtendWormConfiguration extendWormConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
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

        /**
         * <p>extendWormConfiguration.</p>
         */
        public Builder extendWormConfiguration(ExtendWormConfiguration extendWormConfiguration) {
            this.putBodyParameter("extendWormConfiguration", extendWormConfiguration);
            this.extendWormConfiguration = extendWormConfiguration;
            return this;
        }

        public ExtendBucketWormRequest build() {
            return new ExtendBucketWormRequest(this);
        } 

    } 

}
