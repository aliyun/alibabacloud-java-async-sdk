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
 * {@link AiTokenRateLimitConfig} extends {@link TeaModel}
 *
 * <p>AiTokenRateLimitConfig</p>
 */
public class AiTokenRateLimitConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableGlobalRules")
    private Boolean enableGlobalRules;

    @com.aliyun.core.annotation.NameInMap("globalRules")
    private java.util.List<AiTokenRateLimitConfigRule> globalRules;

    @com.aliyun.core.annotation.NameInMap("pluginStatus")
    private AiPluginStatus pluginStatus;

    @com.aliyun.core.annotation.NameInMap("redisConfig")
    private AiPolicyRedisConfig redisConfig;

    @com.aliyun.core.annotation.NameInMap("rules")
    private java.util.List<AiTokenRateLimitConfigRule> rules;

    private AiTokenRateLimitConfig(Builder builder) {
        this.enableGlobalRules = builder.enableGlobalRules;
        this.globalRules = builder.globalRules;
        this.pluginStatus = builder.pluginStatus;
        this.redisConfig = builder.redisConfig;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiTokenRateLimitConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableGlobalRules
     */
    public Boolean getEnableGlobalRules() {
        return this.enableGlobalRules;
    }

    /**
     * @return globalRules
     */
    public java.util.List<AiTokenRateLimitConfigRule> getGlobalRules() {
        return this.globalRules;
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
     * @return rules
     */
    public java.util.List<AiTokenRateLimitConfigRule> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private Boolean enableGlobalRules; 
        private java.util.List<AiTokenRateLimitConfigRule> globalRules; 
        private AiPluginStatus pluginStatus; 
        private AiPolicyRedisConfig redisConfig; 
        private java.util.List<AiTokenRateLimitConfigRule> rules; 

        private Builder() {
        } 

        private Builder(AiTokenRateLimitConfig model) {
            this.enableGlobalRules = model.enableGlobalRules;
            this.globalRules = model.globalRules;
            this.pluginStatus = model.pluginStatus;
            this.redisConfig = model.redisConfig;
            this.rules = model.rules;
        } 

        /**
         * enableGlobalRules.
         */
        public Builder enableGlobalRules(Boolean enableGlobalRules) {
            this.enableGlobalRules = enableGlobalRules;
            return this;
        }

        /**
         * globalRules.
         */
        public Builder globalRules(java.util.List<AiTokenRateLimitConfigRule> globalRules) {
            this.globalRules = globalRules;
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
         * rules.
         */
        public Builder rules(java.util.List<AiTokenRateLimitConfigRule> rules) {
            this.rules = rules;
            return this;
        }

        public AiTokenRateLimitConfig build() {
            return new AiTokenRateLimitConfig(this);
        } 

    } 

}
