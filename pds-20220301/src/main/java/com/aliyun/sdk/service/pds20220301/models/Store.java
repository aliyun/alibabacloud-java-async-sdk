// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Store} extends {@link TeaModel}
 *
 * <p>Store</p>
 */
public class Store extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("base_path")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("ownership")
    private String ownership;

    @com.aliyun.core.annotation.NameInMap("role_arn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("store_id")
    private String storeId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private Store(Builder builder) {
        this.basePath = builder.basePath;
        this.bucket = builder.bucket;
        this.endpoint = builder.endpoint;
        this.location = builder.location;
        this.ownership = builder.ownership;
        this.roleArn = builder.roleArn;
        this.storeId = builder.storeId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Store create() {
        return builder().build();
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return ownership
     */
    public String getOwnership() {
        return this.ownership;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String basePath; 
        private String bucket; 
        private String endpoint; 
        private String location; 
        private String ownership; 
        private String roleArn; 
        private String storeId; 
        private String type; 

        /**
         * base_path.
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * ownership.
         */
        public Builder ownership(String ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * role_arn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * store_id.
         */
        public Builder storeId(String storeId) {
            this.storeId = storeId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Store build() {
            return new Store(this);
        } 

    } 

}
