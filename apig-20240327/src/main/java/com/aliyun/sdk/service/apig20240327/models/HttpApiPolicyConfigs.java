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
 * {@link HttpApiPolicyConfigs} extends {@link TeaModel}
 *
 * <p>HttpApiPolicyConfigs</p>
 */
public class HttpApiPolicyConfigs extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiCacheConfig")
    private AiCacheConfig aiCacheConfig;

    @com.aliyun.core.annotation.NameInMap("aiFallbackConfig")
    private AiFallbackConfig aiFallbackConfig;

    @com.aliyun.core.annotation.NameInMap("aiNetworkSearchConfig")
    private AiNetworkSearchConfig aiNetworkSearchConfig;

    @com.aliyun.core.annotation.NameInMap("aiSecurityGuardConfig")
    private AiSecurityGuardConfig aiSecurityGuardConfig;

    @com.aliyun.core.annotation.NameInMap("aiStatisticsConfig")
    private AiStatisticsConfig aiStatisticsConfig;

    @com.aliyun.core.annotation.NameInMap("aiTokenRateLimitConfig")
    private AiTokenRateLimitConfig aiTokenRateLimitConfig;

    @com.aliyun.core.annotation.NameInMap("aiToolSelectionConfig")
    private AiToolSelectionConfig aiToolSelectionConfig;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("semanticRouterConfig")
    private SemanticRouterConfig semanticRouterConfig;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private HttpApiPolicyConfigs(Builder builder) {
        this.aiCacheConfig = builder.aiCacheConfig;
        this.aiFallbackConfig = builder.aiFallbackConfig;
        this.aiNetworkSearchConfig = builder.aiNetworkSearchConfig;
        this.aiSecurityGuardConfig = builder.aiSecurityGuardConfig;
        this.aiStatisticsConfig = builder.aiStatisticsConfig;
        this.aiTokenRateLimitConfig = builder.aiTokenRateLimitConfig;
        this.aiToolSelectionConfig = builder.aiToolSelectionConfig;
        this.enable = builder.enable;
        this.semanticRouterConfig = builder.semanticRouterConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiPolicyConfigs create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiCacheConfig
     */
    public AiCacheConfig getAiCacheConfig() {
        return this.aiCacheConfig;
    }

    /**
     * @return aiFallbackConfig
     */
    public AiFallbackConfig getAiFallbackConfig() {
        return this.aiFallbackConfig;
    }

    /**
     * @return aiNetworkSearchConfig
     */
    public AiNetworkSearchConfig getAiNetworkSearchConfig() {
        return this.aiNetworkSearchConfig;
    }

    /**
     * @return aiSecurityGuardConfig
     */
    public AiSecurityGuardConfig getAiSecurityGuardConfig() {
        return this.aiSecurityGuardConfig;
    }

    /**
     * @return aiStatisticsConfig
     */
    public AiStatisticsConfig getAiStatisticsConfig() {
        return this.aiStatisticsConfig;
    }

    /**
     * @return aiTokenRateLimitConfig
     */
    public AiTokenRateLimitConfig getAiTokenRateLimitConfig() {
        return this.aiTokenRateLimitConfig;
    }

    /**
     * @return aiToolSelectionConfig
     */
    public AiToolSelectionConfig getAiToolSelectionConfig() {
        return this.aiToolSelectionConfig;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return semanticRouterConfig
     */
    public SemanticRouterConfig getSemanticRouterConfig() {
        return this.semanticRouterConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private AiCacheConfig aiCacheConfig; 
        private AiFallbackConfig aiFallbackConfig; 
        private AiNetworkSearchConfig aiNetworkSearchConfig; 
        private AiSecurityGuardConfig aiSecurityGuardConfig; 
        private AiStatisticsConfig aiStatisticsConfig; 
        private AiTokenRateLimitConfig aiTokenRateLimitConfig; 
        private AiToolSelectionConfig aiToolSelectionConfig; 
        private Boolean enable; 
        private SemanticRouterConfig semanticRouterConfig; 
        private String type; 

        private Builder() {
        } 

        private Builder(HttpApiPolicyConfigs model) {
            this.aiCacheConfig = model.aiCacheConfig;
            this.aiFallbackConfig = model.aiFallbackConfig;
            this.aiNetworkSearchConfig = model.aiNetworkSearchConfig;
            this.aiSecurityGuardConfig = model.aiSecurityGuardConfig;
            this.aiStatisticsConfig = model.aiStatisticsConfig;
            this.aiTokenRateLimitConfig = model.aiTokenRateLimitConfig;
            this.aiToolSelectionConfig = model.aiToolSelectionConfig;
            this.enable = model.enable;
            this.semanticRouterConfig = model.semanticRouterConfig;
            this.type = model.type;
        } 

        /**
         * aiCacheConfig.
         */
        public Builder aiCacheConfig(AiCacheConfig aiCacheConfig) {
            this.aiCacheConfig = aiCacheConfig;
            return this;
        }

        /**
         * aiFallbackConfig.
         */
        public Builder aiFallbackConfig(AiFallbackConfig aiFallbackConfig) {
            this.aiFallbackConfig = aiFallbackConfig;
            return this;
        }

        /**
         * aiNetworkSearchConfig.
         */
        public Builder aiNetworkSearchConfig(AiNetworkSearchConfig aiNetworkSearchConfig) {
            this.aiNetworkSearchConfig = aiNetworkSearchConfig;
            return this;
        }

        /**
         * aiSecurityGuardConfig.
         */
        public Builder aiSecurityGuardConfig(AiSecurityGuardConfig aiSecurityGuardConfig) {
            this.aiSecurityGuardConfig = aiSecurityGuardConfig;
            return this;
        }

        /**
         * aiStatisticsConfig.
         */
        public Builder aiStatisticsConfig(AiStatisticsConfig aiStatisticsConfig) {
            this.aiStatisticsConfig = aiStatisticsConfig;
            return this;
        }

        /**
         * aiTokenRateLimitConfig.
         */
        public Builder aiTokenRateLimitConfig(AiTokenRateLimitConfig aiTokenRateLimitConfig) {
            this.aiTokenRateLimitConfig = aiTokenRateLimitConfig;
            return this;
        }

        /**
         * aiToolSelectionConfig.
         */
        public Builder aiToolSelectionConfig(AiToolSelectionConfig aiToolSelectionConfig) {
            this.aiToolSelectionConfig = aiToolSelectionConfig;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * semanticRouterConfig.
         */
        public Builder semanticRouterConfig(SemanticRouterConfig semanticRouterConfig) {
            this.semanticRouterConfig = semanticRouterConfig;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public HttpApiPolicyConfigs build() {
            return new HttpApiPolicyConfigs(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiPolicyConfigs} extends {@link TeaModel}
     *
     * <p>HttpApiPolicyConfigs</p>
     */
    public static class SemanticRouterConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private SemanticRouterConfig(Builder builder) {
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SemanticRouterConfig create() {
            return builder().build();
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(SemanticRouterConfig model) {
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public SemanticRouterConfig build() {
                return new SemanticRouterConfig(this);
            } 

        } 

    }
}
