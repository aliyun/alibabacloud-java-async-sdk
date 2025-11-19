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
 * {@link ProxyConfig} extends {@link TeaModel}
 *
 * <p>ProxyConfig</p>
 */
public class ProxyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("policies")
    private Policies policies;

    private ProxyConfig(Builder builder) {
        this.endpoints = builder.endpoints;
        this.policies = builder.policies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProxyConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return policies
     */
    public Policies getPolicies() {
        return this.policies;
    }

    public static final class Builder {
        private java.util.List<Endpoints> endpoints; 
        private Policies policies; 

        private Builder() {
        } 

        private Builder(ProxyConfig model) {
            this.endpoints = model.endpoints;
            this.policies = model.policies;
        } 

        /**
         * endpoints.
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * policies.
         */
        public Builder policies(Policies policies) {
            this.policies = policies;
            return this;
        }

        public ProxyConfig build() {
            return new ProxyConfig(this);
        } 

    } 

    /**
     * 
     * {@link ProxyConfig} extends {@link TeaModel}
     *
     * <p>ProxyConfig</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("modelNames")
        private java.util.List<String> modelNames;

        @com.aliyun.core.annotation.NameInMap("modelServiceName")
        private String modelServiceName;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private Endpoints(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.modelNames = builder.modelNames;
            this.modelServiceName = builder.modelServiceName;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return modelNames
         */
        public java.util.List<String> getModelNames() {
            return this.modelNames;
        }

        /**
         * @return modelServiceName
         */
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String baseUrl; 
            private java.util.List<String> modelNames; 
            private String modelServiceName; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.baseUrl = model.baseUrl;
                this.modelNames = model.modelNames;
                this.modelServiceName = model.modelServiceName;
                this.weight = model.weight;
            } 

            /**
             * baseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * modelNames.
             */
            public Builder modelNames(java.util.List<String> modelNames) {
                this.modelNames = modelNames;
                return this;
            }

            /**
             * modelServiceName.
             */
            public Builder modelServiceName(String modelServiceName) {
                this.modelServiceName = modelServiceName;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProxyConfig} extends {@link TeaModel}
     *
     * <p>ProxyConfig</p>
     */
    public static class Fallbacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelServiceName")
        private String modelServiceName;

        private Fallbacks(Builder builder) {
            this.modelName = builder.modelName;
            this.modelServiceName = builder.modelServiceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fallbacks create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelServiceName
         */
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        public static final class Builder {
            private String modelName; 
            private String modelServiceName; 

            private Builder() {
            } 

            private Builder(Fallbacks model) {
                this.modelName = model.modelName;
                this.modelServiceName = model.modelServiceName;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * modelServiceName.
             */
            public Builder modelServiceName(String modelServiceName) {
                this.modelServiceName = modelServiceName;
                return this;
            }

            public Fallbacks build() {
                return new Fallbacks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ProxyConfig} extends {@link TeaModel}
     *
     * <p>ProxyConfig</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cache")
        private Boolean cache;

        @com.aliyun.core.annotation.NameInMap("concurrencyLimit")
        private Integer concurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("fallbacks")
        private java.util.List<Fallbacks> fallbacks;

        @com.aliyun.core.annotation.NameInMap("numRetries")
        private Integer numRetries;

        @com.aliyun.core.annotation.NameInMap("requestTimeout")
        private Integer requestTimeout;

        private Policies(Builder builder) {
            this.cache = builder.cache;
            this.concurrencyLimit = builder.concurrencyLimit;
            this.fallbacks = builder.fallbacks;
            this.numRetries = builder.numRetries;
            this.requestTimeout = builder.requestTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return cache
         */
        public Boolean getCache() {
            return this.cache;
        }

        /**
         * @return concurrencyLimit
         */
        public Integer getConcurrencyLimit() {
            return this.concurrencyLimit;
        }

        /**
         * @return fallbacks
         */
        public java.util.List<Fallbacks> getFallbacks() {
            return this.fallbacks;
        }

        /**
         * @return numRetries
         */
        public Integer getNumRetries() {
            return this.numRetries;
        }

        /**
         * @return requestTimeout
         */
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public static final class Builder {
            private Boolean cache; 
            private Integer concurrencyLimit; 
            private java.util.List<Fallbacks> fallbacks; 
            private Integer numRetries; 
            private Integer requestTimeout; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.cache = model.cache;
                this.concurrencyLimit = model.concurrencyLimit;
                this.fallbacks = model.fallbacks;
                this.numRetries = model.numRetries;
                this.requestTimeout = model.requestTimeout;
            } 

            /**
             * cache.
             */
            public Builder cache(Boolean cache) {
                this.cache = cache;
                return this;
            }

            /**
             * concurrencyLimit.
             */
            public Builder concurrencyLimit(Integer concurrencyLimit) {
                this.concurrencyLimit = concurrencyLimit;
                return this;
            }

            /**
             * fallbacks.
             */
            public Builder fallbacks(java.util.List<Fallbacks> fallbacks) {
                this.fallbacks = fallbacks;
                return this;
            }

            /**
             * numRetries.
             */
            public Builder numRetries(Integer numRetries) {
                this.numRetries = numRetries;
                return this;
            }

            /**
             * requestTimeout.
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
