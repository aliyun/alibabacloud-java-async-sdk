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
    public static class AiGuardrailConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("blockOnContentModeration")
        private Boolean blockOnContentModeration;

        @com.aliyun.core.annotation.NameInMap("blockOnMaliciousUrl")
        private Boolean blockOnMaliciousUrl;

        @com.aliyun.core.annotation.NameInMap("blockOnModelHallucination")
        private Boolean blockOnModelHallucination;

        @com.aliyun.core.annotation.NameInMap("blockOnPromptAttack")
        private Boolean blockOnPromptAttack;

        @com.aliyun.core.annotation.NameInMap("blockOnSensitiveData")
        private Boolean blockOnSensitiveData;

        @com.aliyun.core.annotation.NameInMap("checkRequest")
        private Boolean checkRequest;

        @com.aliyun.core.annotation.NameInMap("checkResponse")
        private Boolean checkResponse;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("maxTextLength")
        private Integer maxTextLength;

        private AiGuardrailConfig(Builder builder) {
            this.blockOnContentModeration = builder.blockOnContentModeration;
            this.blockOnMaliciousUrl = builder.blockOnMaliciousUrl;
            this.blockOnModelHallucination = builder.blockOnModelHallucination;
            this.blockOnPromptAttack = builder.blockOnPromptAttack;
            this.blockOnSensitiveData = builder.blockOnSensitiveData;
            this.checkRequest = builder.checkRequest;
            this.checkResponse = builder.checkResponse;
            this.level = builder.level;
            this.maxTextLength = builder.maxTextLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiGuardrailConfig create() {
            return builder().build();
        }

        /**
         * @return blockOnContentModeration
         */
        public Boolean getBlockOnContentModeration() {
            return this.blockOnContentModeration;
        }

        /**
         * @return blockOnMaliciousUrl
         */
        public Boolean getBlockOnMaliciousUrl() {
            return this.blockOnMaliciousUrl;
        }

        /**
         * @return blockOnModelHallucination
         */
        public Boolean getBlockOnModelHallucination() {
            return this.blockOnModelHallucination;
        }

        /**
         * @return blockOnPromptAttack
         */
        public Boolean getBlockOnPromptAttack() {
            return this.blockOnPromptAttack;
        }

        /**
         * @return blockOnSensitiveData
         */
        public Boolean getBlockOnSensitiveData() {
            return this.blockOnSensitiveData;
        }

        /**
         * @return checkRequest
         */
        public Boolean getCheckRequest() {
            return this.checkRequest;
        }

        /**
         * @return checkResponse
         */
        public Boolean getCheckResponse() {
            return this.checkResponse;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maxTextLength
         */
        public Integer getMaxTextLength() {
            return this.maxTextLength;
        }

        public static final class Builder {
            private Boolean blockOnContentModeration; 
            private Boolean blockOnMaliciousUrl; 
            private Boolean blockOnModelHallucination; 
            private Boolean blockOnPromptAttack; 
            private Boolean blockOnSensitiveData; 
            private Boolean checkRequest; 
            private Boolean checkResponse; 
            private String level; 
            private Integer maxTextLength; 

            private Builder() {
            } 

            private Builder(AiGuardrailConfig model) {
                this.blockOnContentModeration = model.blockOnContentModeration;
                this.blockOnMaliciousUrl = model.blockOnMaliciousUrl;
                this.blockOnModelHallucination = model.blockOnModelHallucination;
                this.blockOnPromptAttack = model.blockOnPromptAttack;
                this.blockOnSensitiveData = model.blockOnSensitiveData;
                this.checkRequest = model.checkRequest;
                this.checkResponse = model.checkResponse;
                this.level = model.level;
                this.maxTextLength = model.maxTextLength;
            } 

            /**
             * blockOnContentModeration.
             */
            public Builder blockOnContentModeration(Boolean blockOnContentModeration) {
                this.blockOnContentModeration = blockOnContentModeration;
                return this;
            }

            /**
             * blockOnMaliciousUrl.
             */
            public Builder blockOnMaliciousUrl(Boolean blockOnMaliciousUrl) {
                this.blockOnMaliciousUrl = blockOnMaliciousUrl;
                return this;
            }

            /**
             * blockOnModelHallucination.
             */
            public Builder blockOnModelHallucination(Boolean blockOnModelHallucination) {
                this.blockOnModelHallucination = blockOnModelHallucination;
                return this;
            }

            /**
             * blockOnPromptAttack.
             */
            public Builder blockOnPromptAttack(Boolean blockOnPromptAttack) {
                this.blockOnPromptAttack = blockOnPromptAttack;
                return this;
            }

            /**
             * blockOnSensitiveData.
             */
            public Builder blockOnSensitiveData(Boolean blockOnSensitiveData) {
                this.blockOnSensitiveData = blockOnSensitiveData;
                return this;
            }

            /**
             * checkRequest.
             */
            public Builder checkRequest(Boolean checkRequest) {
                this.checkRequest = checkRequest;
                return this;
            }

            /**
             * checkResponse.
             */
            public Builder checkResponse(Boolean checkResponse) {
                this.checkResponse = checkResponse;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * maxTextLength.
             */
            public Builder maxTextLength(Integer maxTextLength) {
                this.maxTextLength = maxTextLength;
                return this;
            }

            public AiGuardrailConfig build() {
                return new AiGuardrailConfig(this);
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
    public static class TokenRateLimiter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tpd")
        private Integer tpd;

        @com.aliyun.core.annotation.NameInMap("tph")
        private Integer tph;

        @com.aliyun.core.annotation.NameInMap("tpm")
        private Integer tpm;

        @com.aliyun.core.annotation.NameInMap("tps")
        private Integer tps;

        private TokenRateLimiter(Builder builder) {
            this.tpd = builder.tpd;
            this.tph = builder.tph;
            this.tpm = builder.tpm;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TokenRateLimiter create() {
            return builder().build();
        }

        /**
         * @return tpd
         */
        public Integer getTpd() {
            return this.tpd;
        }

        /**
         * @return tph
         */
        public Integer getTph() {
            return this.tph;
        }

        /**
         * @return tpm
         */
        public Integer getTpm() {
            return this.tpm;
        }

        /**
         * @return tps
         */
        public Integer getTps() {
            return this.tps;
        }

        public static final class Builder {
            private Integer tpd; 
            private Integer tph; 
            private Integer tpm; 
            private Integer tps; 

            private Builder() {
            } 

            private Builder(TokenRateLimiter model) {
                this.tpd = model.tpd;
                this.tph = model.tph;
                this.tpm = model.tpm;
                this.tps = model.tps;
            } 

            /**
             * tpd.
             */
            public Builder tpd(Integer tpd) {
                this.tpd = tpd;
                return this;
            }

            /**
             * tph.
             */
            public Builder tph(Integer tph) {
                this.tph = tph;
                return this;
            }

            /**
             * tpm.
             */
            public Builder tpm(Integer tpm) {
                this.tpm = tpm;
                return this;
            }

            /**
             * tps.
             */
            public Builder tps(Integer tps) {
                this.tps = tps;
                return this;
            }

            public TokenRateLimiter build() {
                return new TokenRateLimiter(this);
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
        @com.aliyun.core.annotation.NameInMap("aiGuardrailConfig")
        private AiGuardrailConfig aiGuardrailConfig;

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

        @com.aliyun.core.annotation.NameInMap("tokenRateLimiter")
        private TokenRateLimiter tokenRateLimiter;

        private Policies(Builder builder) {
            this.aiGuardrailConfig = builder.aiGuardrailConfig;
            this.cache = builder.cache;
            this.concurrencyLimit = builder.concurrencyLimit;
            this.fallbacks = builder.fallbacks;
            this.numRetries = builder.numRetries;
            this.requestTimeout = builder.requestTimeout;
            this.tokenRateLimiter = builder.tokenRateLimiter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return aiGuardrailConfig
         */
        public AiGuardrailConfig getAiGuardrailConfig() {
            return this.aiGuardrailConfig;
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

        /**
         * @return tokenRateLimiter
         */
        public TokenRateLimiter getTokenRateLimiter() {
            return this.tokenRateLimiter;
        }

        public static final class Builder {
            private AiGuardrailConfig aiGuardrailConfig; 
            private Boolean cache; 
            private Integer concurrencyLimit; 
            private java.util.List<Fallbacks> fallbacks; 
            private Integer numRetries; 
            private Integer requestTimeout; 
            private TokenRateLimiter tokenRateLimiter; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.aiGuardrailConfig = model.aiGuardrailConfig;
                this.cache = model.cache;
                this.concurrencyLimit = model.concurrencyLimit;
                this.fallbacks = model.fallbacks;
                this.numRetries = model.numRetries;
                this.requestTimeout = model.requestTimeout;
                this.tokenRateLimiter = model.tokenRateLimiter;
            } 

            /**
             * aiGuardrailConfig.
             */
            public Builder aiGuardrailConfig(AiGuardrailConfig aiGuardrailConfig) {
                this.aiGuardrailConfig = aiGuardrailConfig;
                return this;
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

            /**
             * tokenRateLimiter.
             */
            public Builder tokenRateLimiter(TokenRateLimiter tokenRateLimiter) {
                this.tokenRateLimiter = tokenRateLimiter;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
