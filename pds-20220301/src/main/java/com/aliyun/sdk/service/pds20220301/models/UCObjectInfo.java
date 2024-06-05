// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UCObjectInfo} extends {@link TeaModel}
 *
 * <p>UCObjectInfo</p>
 */
public class UCObjectInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("md5")
    private String md5;

    @com.aliyun.core.annotation.NameInMap("object_key")
    private String objectKey;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("sha1")
    private String sha1;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private UCObjectInfo(Builder builder) {
        this.bucket = builder.bucket;
        this.md5 = builder.md5;
        this.objectKey = builder.objectKey;
        this.region = builder.region;
        this.sha1 = builder.sha1;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UCObjectInfo create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return sha1
     */
    public String getSha1() {
        return this.sha1;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private String bucket; 
        private String md5; 
        private String objectKey; 
        private String region; 
        private String sha1; 
        private Long size; 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * md5.
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        /**
         * object_key.
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * sha1.
         */
        public Builder sha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public UCObjectInfo build() {
            return new UCObjectInfo(this);
        } 

    } 

}
