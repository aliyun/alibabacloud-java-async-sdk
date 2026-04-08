// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiCacheConfig} extends {@link TeaModel}
 *
 * <p>AiCacheConfig</p>
 */
public class AiCacheConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cacheKeyStrategy")
    private String cacheKeyStrategy;

    @com.aliyun.core.annotation.NameInMap("cacheMode")
    private String cacheMode;

    @com.aliyun.core.annotation.NameInMap("cacheTTL")
    private Integer cacheTTL;

    @com.aliyun.core.annotation.NameInMap("embeddingConfig")
    private EmbeddingConfig embeddingConfig;

    @com.aliyun.core.annotation.NameInMap("pluginStatus")
    private AiPluginStatus pluginStatus;

    @com.aliyun.core.annotation.NameInMap("redisConfig")
    private AiPolicyRedisConfig redisConfig;

    @com.aliyun.core.annotation.NameInMap("vectorConfig")
    private VectorConfig vectorConfig;

    private AiCacheConfig(Builder builder) {
        this.cacheKeyStrategy = builder.cacheKeyStrategy;
        this.cacheMode = builder.cacheMode;
        this.cacheTTL = builder.cacheTTL;
        this.embeddingConfig = builder.embeddingConfig;
        this.pluginStatus = builder.pluginStatus;
        this.redisConfig = builder.redisConfig;
        this.vectorConfig = builder.vectorConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiCacheConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheKeyStrategy
     */
    public String getCacheKeyStrategy() {
        return this.cacheKeyStrategy;
    }

    /**
     * @return cacheMode
     */
    public String getCacheMode() {
        return this.cacheMode;
    }

    /**
     * @return cacheTTL
     */
    public Integer getCacheTTL() {
        return this.cacheTTL;
    }

    /**
     * @return embeddingConfig
     */
    public EmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    /**
     * @return pluginStatus
     */
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    /**
     * @return redisConfig
     */
    public AiPolicyRedisConfig getRedisConfig() {
        return this.redisConfig;
    }

    /**
     * @return vectorConfig
     */
    public VectorConfig getVectorConfig() {
        return this.vectorConfig;
    }

    public static final class Builder {
        private String cacheKeyStrategy; 
        private String cacheMode; 
        private Integer cacheTTL; 
        private EmbeddingConfig embeddingConfig; 
        private AiPluginStatus pluginStatus; 
        private AiPolicyRedisConfig redisConfig; 
        private VectorConfig vectorConfig; 

        private Builder() {
        } 

        private Builder(AiCacheConfig model) {
            this.cacheKeyStrategy = model.cacheKeyStrategy;
            this.cacheMode = model.cacheMode;
            this.cacheTTL = model.cacheTTL;
            this.embeddingConfig = model.embeddingConfig;
            this.pluginStatus = model.pluginStatus;
            this.redisConfig = model.redisConfig;
            this.vectorConfig = model.vectorConfig;
        } 

        /**
         * cacheKeyStrategy.
         */
        public Builder cacheKeyStrategy(String cacheKeyStrategy) {
            this.cacheKeyStrategy = cacheKeyStrategy;
            return this;
        }

        /**
         * cacheMode.
         */
        public Builder cacheMode(String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }

        /**
         * cacheTTL.
         */
        public Builder cacheTTL(Integer cacheTTL) {
            this.cacheTTL = cacheTTL;
            return this;
        }

        /**
         * embeddingConfig.
         */
        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }

        /**
         * pluginStatus.
         */
        public Builder pluginStatus(AiPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }

        /**
         * redisConfig.
         */
        public Builder redisConfig(AiPolicyRedisConfig redisConfig) {
            this.redisConfig = redisConfig;
            return this;
        }

        /**
         * vectorConfig.
         */
        public Builder vectorConfig(VectorConfig vectorConfig) {
            this.vectorConfig = vectorConfig;
            return this;
        }

        public AiCacheConfig build() {
            return new AiCacheConfig(this);
        } 

    } 

    /**
     * 
     * {@link AiCacheConfig} extends {@link TeaModel}
     *
     * <p>AiCacheConfig</p>
     */
    public static class EmbeddingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private EmbeddingConfig(Builder builder) {
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeout = builder.timeout;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingConfig create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String modelName; 
            private String serviceId; 
            private Integer timeout; 
            private String type; 

            private Builder() {
            } 

            private Builder(EmbeddingConfig model) {
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeout = model.timeout;
                this.type = model.type;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EmbeddingConfig build() {
                return new EmbeddingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiCacheConfig} extends {@link TeaModel}
     *
     * <p>AiCacheConfig</p>
     */
    public static class VectorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("collectionId")
        private String collectionId;

        @com.aliyun.core.annotation.NameInMap("serviceHost")
        private String serviceHost;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private VectorConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.collectionId = builder.collectionId;
            this.serviceHost = builder.serviceHost;
            this.threshold = builder.threshold;
            this.timeout = builder.timeout;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorConfig create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return collectionId
         */
        public String getCollectionId() {
            return this.collectionId;
        }

        /**
         * @return serviceHost
         */
        public String getServiceHost() {
            return this.serviceHost;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String apiKey; 
            private String collectionId; 
            private String serviceHost; 
            private Float threshold; 
            private Integer timeout; 
            private String type; 

            private Builder() {
            } 

            private Builder(VectorConfig model) {
                this.apiKey = model.apiKey;
                this.collectionId = model.collectionId;
                this.serviceHost = model.serviceHost;
                this.threshold = model.threshold;
                this.timeout = model.timeout;
                this.type = model.type;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * collectionId.
             */
            public Builder collectionId(String collectionId) {
                this.collectionId = collectionId;
                return this;
            }

            /**
             * serviceHost.
             */
            public Builder serviceHost(String serviceHost) {
                this.serviceHost = serviceHost;
                return this;
            }

            /**
             * threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VectorConfig build() {
                return new VectorConfig(this);
            } 

        } 

    }
}
