// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonStorage} extends {@link TeaModel}
 *
 * <p>CommonStorage</p>
 */
public class CommonStorage extends TeaModel {
    @NameInMap("Bucket")
    private String bucket;

    @NameInMap("Object")
    private String object;

    @NameInMap("Region")
    private String region;

    @NameInMap("SignUrl")
    private String signUrl;

    @NameInMap("Sts")
    private CommonSTS sts;

    private CommonStorage(Builder builder) {
        this.bucket = builder.bucket;
        this.object = builder.object;
        this.region = builder.region;
        this.signUrl = builder.signUrl;
        this.sts = builder.sts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonStorage create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return signUrl
     */
    public String getSignUrl() {
        return this.signUrl;
    }

    /**
     * @return sts
     */
    public CommonSTS getSts() {
        return this.sts;
    }

    public static final class Builder {
        private String bucket; 
        private String object; 
        private String region; 
        private String signUrl; 
        private CommonSTS sts; 

        /**
         * OSS bucket
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * OSS object path
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * 阿里云Region，比如 cn-shanghai
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * OSS的签名URL
         */
        public Builder signUrl(String signUrl) {
            this.signUrl = signUrl;
            return this;
        }

        /**
         * Security Token Service
         */
        public Builder sts(CommonSTS sts) {
            this.sts = sts;
            return this;
        }

        public CommonStorage build() {
            return new CommonStorage(this);
        } 

    } 

}
