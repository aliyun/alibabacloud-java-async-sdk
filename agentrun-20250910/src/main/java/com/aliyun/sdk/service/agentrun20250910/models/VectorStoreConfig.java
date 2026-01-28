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

    @com.aliyun.core.annotation.NameInMap("mysqlConfig")
    private MysqlConfig mysqlConfig;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private VectorStoreConfig(Builder builder) {
        this.config = builder.config;
        this.mysqlConfig = builder.mysqlConfig;
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
     * @return mysqlConfig
     */
    public MysqlConfig getMysqlConfig() {
        return this.mysqlConfig;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder {
        private Config config; 
        private MysqlConfig mysqlConfig; 
        private String provider; 

        private Builder() {
        } 

        private Builder(VectorStoreConfig model) {
            this.config = model.config;
            this.mysqlConfig = model.mysqlConfig;
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
         * mysqlConfig.
         */
        public Builder mysqlConfig(MysqlConfig mysqlConfig) {
            this.mysqlConfig = mysqlConfig;
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
    /**
     * 
     * {@link VectorStoreConfig} extends {@link TeaModel}
     *
     * <p>VectorStoreConfig</p>
     */
    public static class MysqlConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("collectionName")
        private String collectionName;

        @com.aliyun.core.annotation.NameInMap("credentialName")
        private String credentialName;

        @com.aliyun.core.annotation.NameInMap("dbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("user")
        private String user;

        @com.aliyun.core.annotation.NameInMap("vectorDimension")
        private Integer vectorDimension;

        private MysqlConfig(Builder builder) {
            this.collectionName = builder.collectionName;
            this.credentialName = builder.credentialName;
            this.dbName = builder.dbName;
            this.host = builder.host;
            this.port = builder.port;
            this.user = builder.user;
            this.vectorDimension = builder.vectorDimension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MysqlConfig create() {
            return builder().build();
        }

        /**
         * @return collectionName
         */
        public String getCollectionName() {
            return this.collectionName;
        }

        /**
         * @return credentialName
         */
        public String getCredentialName() {
            return this.credentialName;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return vectorDimension
         */
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

        public static final class Builder {
            private String collectionName; 
            private String credentialName; 
            private String dbName; 
            private String host; 
            private Integer port; 
            private String user; 
            private Integer vectorDimension; 

            private Builder() {
            } 

            private Builder(MysqlConfig model) {
                this.collectionName = model.collectionName;
                this.credentialName = model.credentialName;
                this.dbName = model.dbName;
                this.host = model.host;
                this.port = model.port;
                this.user = model.user;
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
             * credentialName.
             */
            public Builder credentialName(String credentialName) {
                this.credentialName = credentialName;
                return this;
            }

            /**
             * dbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * user.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * vectorDimension.
             */
            public Builder vectorDimension(Integer vectorDimension) {
                this.vectorDimension = vectorDimension;
                return this;
            }

            public MysqlConfig build() {
                return new MysqlConfig(this);
            } 

        } 

    }
}
