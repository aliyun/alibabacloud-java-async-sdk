// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VectorStoreConfig} extends {@link TeaModel}
 *
 * <p>VectorStoreConfig</p>
 */
public class VectorStoreConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private VectorStoreConfig(Builder builder) {
        this.config = builder.config;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VectorStoreConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder {
        private Config config; 
        private String provider; 

        private Builder() {
        } 

        private Builder(VectorStoreConfig model) {
            this.config = model.config;
            this.provider = model.provider;
        } 

        /**
         * config.
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        public VectorStoreConfig build() {
            return new VectorStoreConfig(this);
        } 

    } 

    /**
     * 
     * {@link VectorStoreConfig} extends {@link TeaModel}
     *
     * <p>VectorStoreConfig</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("collectionName")
        private String collectionName;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("vectorDimension")
        private Integer vectorDimension;

        private Config(Builder builder) {
            this.collectionName = builder.collectionName;
            this.endpoint = builder.endpoint;
            this.instanceName = builder.instanceName;
            this.vectorDimension = builder.vectorDimension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return collectionName
         */
        public String getCollectionName() {
            return this.collectionName;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return vectorDimension
         */
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

        public static final class Builder {
            private String collectionName; 
            private String endpoint; 
            private String instanceName; 
            private Integer vectorDimension; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.collectionName = model.collectionName;
                this.endpoint = model.endpoint;
                this.instanceName = model.instanceName;
                this.vectorDimension = model.vectorDimension;
            } 

            /**
             * collectionName.
             */
            public Builder collectionName(String collectionName) {
                this.collectionName = collectionName;
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
             * instanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * vectorDimension.
             */
            public Builder vectorDimension(Integer vectorDimension) {
                this.vectorDimension = vectorDimension;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
