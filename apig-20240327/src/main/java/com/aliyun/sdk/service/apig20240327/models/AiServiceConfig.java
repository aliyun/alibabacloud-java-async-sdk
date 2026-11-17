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
 * {@link AiServiceConfig} extends {@link TeaModel}
 *
 * <p>AiServiceConfig</p>
 */
public class AiServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKeyGenerateMode")
    private String apiKeyGenerateMode;

    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("apiKeyFailover")
    private ApiKeyFailover apiKeyFailover;

    @com.aliyun.core.annotation.NameInMap("apiKeyReferences")
    private java.util.List<String> apiKeyReferences;

    @com.aliyun.core.annotation.NameInMap("apiKeys")
    private java.util.List<String> apiKeys;

    @com.aliyun.core.annotation.NameInMap("authHeaderKey")
    private String authHeaderKey;

    @com.aliyun.core.annotation.NameInMap("bedrockServiceConfig")
    private BedrockServiceConfig bedrockServiceConfig;

    @com.aliyun.core.annotation.NameInMap("claudeCodeMode")
    private Boolean claudeCodeMode;

    @com.aliyun.core.annotation.NameInMap("compatibleProtocols")
    private java.util.List<String> compatibleProtocols;

    @com.aliyun.core.annotation.NameInMap("configRevision")
    private String configRevision;

    @com.aliyun.core.annotation.NameInMap("defaultModelName")
    private String defaultModelName;

    @com.aliyun.core.annotation.NameInMap("enableHealthCheck")
    private Boolean enableHealthCheck;

    @com.aliyun.core.annotation.NameInMap("enableOutlierDetection")
    private Boolean enableOutlierDetection;

    @com.aliyun.core.annotation.NameInMap("klingServiceConfig")
    private KlingServiceConfig klingServiceConfig;

    @com.aliyun.core.annotation.NameInMap("paiEASServiceConfig")
    private PaiEASServiceConfig paiEASServiceConfig;

    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("retryOnFailure")
    private RetryOnFailure retryOnFailure;

    @com.aliyun.core.annotation.NameInMap("upstreamAuthMode")
    private String upstreamAuthMode;

    @com.aliyun.core.annotation.NameInMap("vertexServiceConfig")
    private VertexServiceConfig vertexServiceConfig;

    private AiServiceConfig(Builder builder) {
        this.apiKeyGenerateMode = builder.apiKeyGenerateMode;
        this.address = builder.address;
        this.apiKeyFailover = builder.apiKeyFailover;
        this.apiKeyReferences = builder.apiKeyReferences;
        this.apiKeys = builder.apiKeys;
        this.authHeaderKey = builder.authHeaderKey;
        this.bedrockServiceConfig = builder.bedrockServiceConfig;
        this.claudeCodeMode = builder.claudeCodeMode;
        this.compatibleProtocols = builder.compatibleProtocols;
        this.configRevision = builder.configRevision;
        this.defaultModelName = builder.defaultModelName;
        this.enableHealthCheck = builder.enableHealthCheck;
        this.enableOutlierDetection = builder.enableOutlierDetection;
        this.klingServiceConfig = builder.klingServiceConfig;
        this.paiEASServiceConfig = builder.paiEASServiceConfig;
        this.protocols = builder.protocols;
        this.provider = builder.provider;
        this.retryOnFailure = builder.retryOnFailure;
        this.upstreamAuthMode = builder.upstreamAuthMode;
        this.vertexServiceConfig = builder.vertexServiceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyGenerateMode
     */
    public String getApiKeyGenerateMode() {
        return this.apiKeyGenerateMode;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return apiKeyFailover
     */
    public ApiKeyFailover getApiKeyFailover() {
        return this.apiKeyFailover;
    }

    /**
     * @return apiKeyReferences
     */
    public java.util.List<String> getApiKeyReferences() {
        return this.apiKeyReferences;
    }

    /**
     * @return apiKeys
     */
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return authHeaderKey
     */
    public String getAuthHeaderKey() {
        return this.authHeaderKey;
    }

    /**
     * @return bedrockServiceConfig
     */
    public BedrockServiceConfig getBedrockServiceConfig() {
        return this.bedrockServiceConfig;
    }

    /**
     * @return claudeCodeMode
     */
    public Boolean getClaudeCodeMode() {
        return this.claudeCodeMode;
    }

    /**
     * @return compatibleProtocols
     */
    public java.util.List<String> getCompatibleProtocols() {
        return this.compatibleProtocols;
    }

    /**
     * @return configRevision
     */
    public String getConfigRevision() {
        return this.configRevision;
    }

    /**
     * @return defaultModelName
     */
    public String getDefaultModelName() {
        return this.defaultModelName;
    }

    /**
     * @return enableHealthCheck
     */
    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * @return enableOutlierDetection
     */
    public Boolean getEnableOutlierDetection() {
        return this.enableOutlierDetection;
    }

    /**
     * @return klingServiceConfig
     */
    public KlingServiceConfig getKlingServiceConfig() {
        return this.klingServiceConfig;
    }

    /**
     * @return paiEASServiceConfig
     */
    public PaiEASServiceConfig getPaiEASServiceConfig() {
        return this.paiEASServiceConfig;
    }

    /**
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return retryOnFailure
     */
    public RetryOnFailure getRetryOnFailure() {
        return this.retryOnFailure;
    }

    /**
     * @return upstreamAuthMode
     */
    public String getUpstreamAuthMode() {
        return this.upstreamAuthMode;
    }

    /**
     * @return vertexServiceConfig
     */
    public VertexServiceConfig getVertexServiceConfig() {
        return this.vertexServiceConfig;
    }

    public static final class Builder {
        private String apiKeyGenerateMode; 
        private String address; 
        private ApiKeyFailover apiKeyFailover; 
        private java.util.List<String> apiKeyReferences; 
        private java.util.List<String> apiKeys; 
        private String authHeaderKey; 
        private BedrockServiceConfig bedrockServiceConfig; 
        private Boolean claudeCodeMode; 
        private java.util.List<String> compatibleProtocols; 
        private String configRevision; 
        private String defaultModelName; 
        private Boolean enableHealthCheck; 
        private Boolean enableOutlierDetection; 
        private KlingServiceConfig klingServiceConfig; 
        private PaiEASServiceConfig paiEASServiceConfig; 
        private java.util.List<String> protocols; 
        private String provider; 
        private RetryOnFailure retryOnFailure; 
        private String upstreamAuthMode; 
        private VertexServiceConfig vertexServiceConfig; 

        private Builder() {
        } 

        private Builder(AiServiceConfig model) {
            this.apiKeyGenerateMode = model.apiKeyGenerateMode;
            this.address = model.address;
            this.apiKeyFailover = model.apiKeyFailover;
            this.apiKeyReferences = model.apiKeyReferences;
            this.apiKeys = model.apiKeys;
            this.authHeaderKey = model.authHeaderKey;
            this.bedrockServiceConfig = model.bedrockServiceConfig;
            this.claudeCodeMode = model.claudeCodeMode;
            this.compatibleProtocols = model.compatibleProtocols;
            this.configRevision = model.configRevision;
            this.defaultModelName = model.defaultModelName;
            this.enableHealthCheck = model.enableHealthCheck;
            this.enableOutlierDetection = model.enableOutlierDetection;
            this.klingServiceConfig = model.klingServiceConfig;
            this.paiEASServiceConfig = model.paiEASServiceConfig;
            this.protocols = model.protocols;
            this.provider = model.provider;
            this.retryOnFailure = model.retryOnFailure;
            this.upstreamAuthMode = model.upstreamAuthMode;
            this.vertexServiceConfig = model.vertexServiceConfig;
        } 

        /**
         * <p>The generation mode of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder apiKeyGenerateMode(String apiKeyGenerateMode) {
            this.apiKeyGenerateMode = apiKeyGenerateMode;
            return this;
        }

        /**
         * <p>The service address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyun.com">https://dashscope.aliyun.com</a></p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The configuration for API key failure ejection and recovery.</p>
         */
        public Builder apiKeyFailover(ApiKeyFailover apiKeyFailover) {
            this.apiKeyFailover = apiKeyFailover;
            return this;
        }

        /**
         * <p>The read-only summary of KMS reference names, excluding credential values.</p>
         */
        public Builder apiKeyReferences(java.util.List<String> apiKeyReferences) {
            this.apiKeyReferences = apiKeyReferences;
            return this;
        }

        /**
         * <p>The list of API keys.</p>
         */
        public Builder apiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * <p>The name of the request header used to pass authentication credentials to the upstream.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        public Builder authHeaderKey(String authHeaderKey) {
            this.authHeaderKey = authHeaderKey;
            return this;
        }

        /**
         * <p>The Bedrock service-specific configuration.</p>
         */
        public Builder bedrockServiceConfig(BedrockServiceConfig bedrockServiceConfig) {
            this.bedrockServiceConfig = bedrockServiceConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable Claude Code compatibility mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder claudeCodeMode(Boolean claudeCodeMode) {
            this.claudeCodeMode = claudeCodeMode;
            return this;
        }

        /**
         * <p>The list of compatible protocols supported by the service.</p>
         */
        public Builder compatibleProtocols(java.util.List<String> compatibleProtocols) {
            this.compatibleProtocols = compatibleProtocols;
            return this;
        }

        /**
         * <p>The read-only service configuration version. Use expectedConfigRevision for conditional updates.</p>
         * 
         * <strong>example:</strong>
         * <p>7e4f52a9b0c34d16a268e913f5c2087b</p>
         */
        public Builder configRevision(String configRevision) {
            this.configRevision = configRevision;
            return this;
        }

        /**
         * <p>The name of the default model.</p>
         * 
         * <strong>example:</strong>
         * <p>gpt-4</p>
         */
        public Builder defaultModelName(String defaultModelName) {
            this.defaultModelName = defaultModelName;
            return this;
        }

        /**
         * <p>Specifies whether to enable health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableHealthCheck(Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        /**
         * <p>Specifies whether to enable the outlier detection feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOutlierDetection(Boolean enableOutlierDetection) {
            this.enableOutlierDetection = enableOutlierDetection;
            return this;
        }

        /**
         * <p>The authentication and token configuration specific to the KlingAI service.</p>
         */
        public Builder klingServiceConfig(KlingServiceConfig klingServiceConfig) {
            this.klingServiceConfig = klingServiceConfig;
            return this;
        }

        /**
         * <p>The PAI-EAS service-specific configuration.</p>
         */
        public Builder paiEASServiceConfig(PaiEASServiceConfig paiEASServiceConfig) {
            this.paiEASServiceConfig = paiEASServiceConfig;
            return this;
        }

        /**
         * <p>The list of model protocols.</p>
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>The large language model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen
         * moonshot
         * baichuan
         * yi
         * zhipuai
         * 360ai
         * hunyuan
         * stepfun
         * spark
         * openai
         * claude
         * anthropic
         * doubao
         * minimax
         * gemini
         * azure
         * deepseek
         * custom
         * pai-eas
         * bedrock
         * vertex</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>The configuration for retrying with a different key after the current request fails.</p>
         */
        public Builder retryOnFailure(RetryOnFailure retryOnFailure) {
            this.retryOnFailure = retryOnFailure;
            return this;
        }

        /**
         * <p>The upstream authentication mode, which distinguishes between API key authentication, no authentication, and pass-through downstream authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>api-key</p>
         */
        public Builder upstreamAuthMode(String upstreamAuthMode) {
            this.upstreamAuthMode = upstreamAuthMode;
            return this;
        }

        /**
         * <p>The configuration information for the Vertex AI service.</p>
         */
        public Builder vertexServiceConfig(VertexServiceConfig vertexServiceConfig) {
            this.vertexServiceConfig = vertexServiceConfig;
            return this;
        }

        public AiServiceConfig build() {
            return new AiServiceConfig(this);
        } 

    } 

    /**
     * 
     * {@link AiServiceConfig} extends {@link TeaModel}
     *
     * <p>AiServiceConfig</p>
     */
    public static class ApiKeyFailover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cooldownDuration")
        private Long cooldownDuration;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("failoverOnStatus")
        private java.util.List<String> failoverOnStatus;

        @com.aliyun.core.annotation.NameInMap("failureThreshold")
        private Long failureThreshold;

        private ApiKeyFailover(Builder builder) {
            this.cooldownDuration = builder.cooldownDuration;
            this.enabled = builder.enabled;
            this.failoverOnStatus = builder.failoverOnStatus;
            this.failureThreshold = builder.failureThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeyFailover create() {
            return builder().build();
        }

        /**
         * @return cooldownDuration
         */
        public Long getCooldownDuration() {
            return this.cooldownDuration;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return failoverOnStatus
         */
        public java.util.List<String> getFailoverOnStatus() {
            return this.failoverOnStatus;
        }

        /**
         * @return failureThreshold
         */
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public static final class Builder {
            private Long cooldownDuration; 
            private Boolean enabled; 
            private java.util.List<String> failoverOnStatus; 
            private Long failureThreshold; 

            private Builder() {
            } 

            private Builder(ApiKeyFailover model) {
                this.cooldownDuration = model.cooldownDuration;
                this.enabled = model.enabled;
                this.failoverOnStatus = model.failoverOnStatus;
                this.failureThreshold = model.failureThreshold;
            } 

            /**
             * <p>The cooldown duration after an API key is ejected.</p>
             * 
             * <strong>example:</strong>
             * <p>30000</p>
             */
            public Builder cooldownDuration(Long cooldownDuration) {
                this.cooldownDuration = cooldownDuration;
                return this;
            }

            /**
             * <p>Specifies whether to enable API key failure ejection.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The set of response status matching rules that trigger API key failure ejection.</p>
             */
            public Builder failoverOnStatus(java.util.List<String> failoverOnStatus) {
                this.failoverOnStatus = failoverOnStatus;
                return this;
            }

            /**
             * <p>The failure count threshold that triggers API key ejection.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder failureThreshold(Long failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            public ApiKeyFailover build() {
                return new ApiKeyFailover(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiServiceConfig} extends {@link TeaModel}
     *
     * <p>AiServiceConfig</p>
     */
    public static class BedrockServiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("awsAccessKey")
        private String awsAccessKey;

        @com.aliyun.core.annotation.NameInMap("awsRegion")
        private String awsRegion;

        @com.aliyun.core.annotation.NameInMap("awsSecretKey")
        private String awsSecretKey;

        @com.aliyun.core.annotation.NameInMap("bedrockPromptCachePointPositions")
        private java.util.Map<String, Boolean> bedrockPromptCachePointPositions;

        @com.aliyun.core.annotation.NameInMap("endpointMode")
        private String endpointMode;

        @com.aliyun.core.annotation.NameInMap("promptCacheEnable")
        private Boolean promptCacheEnable;

        @com.aliyun.core.annotation.NameInMap("promptCacheRetention")
        private String promptCacheRetention;

        @com.aliyun.core.annotation.NameInMap("promptCacheStrategy")
        private String promptCacheStrategy;

        private BedrockServiceConfig(Builder builder) {
            this.awsAccessKey = builder.awsAccessKey;
            this.awsRegion = builder.awsRegion;
            this.awsSecretKey = builder.awsSecretKey;
            this.bedrockPromptCachePointPositions = builder.bedrockPromptCachePointPositions;
            this.endpointMode = builder.endpointMode;
            this.promptCacheEnable = builder.promptCacheEnable;
            this.promptCacheRetention = builder.promptCacheRetention;
            this.promptCacheStrategy = builder.promptCacheStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BedrockServiceConfig create() {
            return builder().build();
        }

        /**
         * @return awsAccessKey
         */
        public String getAwsAccessKey() {
            return this.awsAccessKey;
        }

        /**
         * @return awsRegion
         */
        public String getAwsRegion() {
            return this.awsRegion;
        }

        /**
         * @return awsSecretKey
         */
        public String getAwsSecretKey() {
            return this.awsSecretKey;
        }

        /**
         * @return bedrockPromptCachePointPositions
         */
        public java.util.Map<String, Boolean> getBedrockPromptCachePointPositions() {
            return this.bedrockPromptCachePointPositions;
        }

        /**
         * @return endpointMode
         */
        public String getEndpointMode() {
            return this.endpointMode;
        }

        /**
         * @return promptCacheEnable
         */
        public Boolean getPromptCacheEnable() {
            return this.promptCacheEnable;
        }

        /**
         * @return promptCacheRetention
         */
        public String getPromptCacheRetention() {
            return this.promptCacheRetention;
        }

        /**
         * @return promptCacheStrategy
         */
        public String getPromptCacheStrategy() {
            return this.promptCacheStrategy;
        }

        public static final class Builder {
            private String awsAccessKey; 
            private String awsRegion; 
            private String awsSecretKey; 
            private java.util.Map<String, Boolean> bedrockPromptCachePointPositions; 
            private String endpointMode; 
            private Boolean promptCacheEnable; 
            private String promptCacheRetention; 
            private String promptCacheStrategy; 

            private Builder() {
            } 

            private Builder(BedrockServiceConfig model) {
                this.awsAccessKey = model.awsAccessKey;
                this.awsRegion = model.awsRegion;
                this.awsSecretKey = model.awsSecretKey;
                this.bedrockPromptCachePointPositions = model.bedrockPromptCachePointPositions;
                this.endpointMode = model.endpointMode;
                this.promptCacheEnable = model.promptCacheEnable;
                this.promptCacheRetention = model.promptCacheRetention;
                this.promptCacheStrategy = model.promptCacheStrategy;
            } 

            /**
             * <p>The AWS access key.</p>
             * 
             * <strong>example:</strong>
             * <p>AKIAIOSFODNN7EXAMPLE</p>
             */
            public Builder awsAccessKey(String awsAccessKey) {
                this.awsAccessKey = awsAccessKey;
                return this;
            }

            /**
             * <p>The AWS region.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder awsRegion(String awsRegion) {
                this.awsRegion = awsRegion;
                return this;
            }

            /**
             * <p>The AWS secret key.</p>
             * 
             * <strong>example:</strong>
             * <p>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</p>
             */
            public Builder awsSecretKey(String awsSecretKey) {
                this.awsSecretKey = awsSecretKey;
                return this;
            }

            /**
             * <p>Configures whether to insert Bedrock cache markers based on prompt positions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;systemPrompt&quot;:true}</p>
             */
            public Builder bedrockPromptCachePointPositions(java.util.Map<String, Boolean> bedrockPromptCachePointPositions) {
                this.bedrockPromptCachePointPositions = bedrockPromptCachePointPositions;
                return this;
            }

            /**
             * <p>The Bedrock service endpoint mode, which supports runtime and mantle. If omitted, runtime is used.</p>
             * 
             * <strong>example:</strong>
             * <p>runtime</p>
             */
            public Builder endpointMode(String endpointMode) {
                this.endpointMode = endpointMode;
                return this;
            }

            /**
             * <p>Specifies whether to enable prompt caching for the Bedrock upstream.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder promptCacheEnable(Boolean promptCacheEnable) {
                this.promptCacheEnable = promptCacheEnable;
                return this;
            }

            /**
             * <p>The data retention policy for the prompt cache.</p>
             * 
             * <strong>example:</strong>
             * <p>in_memory</p>
             */
            public Builder promptCacheRetention(String promptCacheRetention) {
                this.promptCacheRetention = promptCacheRetention;
                return this;
            }

            /**
             * <p>The applicable model strategy for Bedrock prompt caching.</p>
             * 
             * <strong>example:</strong>
             * <p>supported_models_only</p>
             */
            public Builder promptCacheStrategy(String promptCacheStrategy) {
                this.promptCacheStrategy = promptCacheStrategy;
                return this;
            }

            public BedrockServiceConfig build() {
                return new BedrockServiceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiServiceConfig} extends {@link TeaModel}
     *
     * <p>AiServiceConfig</p>
     */
    public static class KlingServiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("klingAccessKey")
        private String klingAccessKey;

        @com.aliyun.core.annotation.NameInMap("klingSecretKey")
        private String klingSecretKey;

        @com.aliyun.core.annotation.NameInMap("klingTokenRefreshAhead")
        private Long klingTokenRefreshAhead;

        private KlingServiceConfig(Builder builder) {
            this.klingAccessKey = builder.klingAccessKey;
            this.klingSecretKey = builder.klingSecretKey;
            this.klingTokenRefreshAhead = builder.klingTokenRefreshAhead;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KlingServiceConfig create() {
            return builder().build();
        }

        /**
         * @return klingAccessKey
         */
        public String getKlingAccessKey() {
            return this.klingAccessKey;
        }

        /**
         * @return klingSecretKey
         */
        public String getKlingSecretKey() {
            return this.klingSecretKey;
        }

        /**
         * @return klingTokenRefreshAhead
         */
        public Long getKlingTokenRefreshAhead() {
            return this.klingTokenRefreshAhead;
        }

        public static final class Builder {
            private String klingAccessKey; 
            private String klingSecretKey; 
            private Long klingTokenRefreshAhead; 

            private Builder() {
            } 

            private Builder(KlingServiceConfig model) {
                this.klingAccessKey = model.klingAccessKey;
                this.klingSecretKey = model.klingSecretKey;
                this.klingTokenRefreshAhead = model.klingTokenRefreshAhead;
            } 

            /**
             * <p>The KlingAI access key identifier. Examples use desensitized values.</p>
             * 
             * <strong>example:</strong>
             * <p>kling-access-key-****</p>
             */
            public Builder klingAccessKey(String klingAccessKey) {
                this.klingAccessKey = klingAccessKey;
                return this;
            }

            /**
             * <p>The KlingAI secret key. Examples use desensitized values.</p>
             * 
             * <strong>example:</strong>
             * <p>kling-secret-key-****</p>
             */
            public Builder klingSecretKey(String klingSecretKey) {
                this.klingSecretKey = klingSecretKey;
                return this;
            }

            /**
             * <p>The advance refresh configuration for KlingAI tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder klingTokenRefreshAhead(Long klingTokenRefreshAhead) {
                this.klingTokenRefreshAhead = klingTokenRefreshAhead;
                return this;
            }

            public KlingServiceConfig build() {
                return new KlingServiceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiServiceConfig} extends {@link TeaModel}
     *
     * <p>AiServiceConfig</p>
     */
    public static class PaiEASServiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private PaiEASServiceConfig(Builder builder) {
            this.endpointType = builder.endpointType;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PaiEASServiceConfig create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String endpointType; 
            private String serviceId; 
            private String serviceName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(PaiEASServiceConfig model) {
                this.endpointType = model.endpointType;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The connection type, which can be a private network (VPC) or a public network.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;public&quot;，&quot;private&quot;</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>svc-cvaeb0um1hkqp79k72v0</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>auto-ai-service</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cb89d4de30042df4459442589664e00d</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public PaiEASServiceConfig build() {
                return new PaiEASServiceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiServiceConfig} extends {@link TeaModel}
     *
     * <p>AiServiceConfig</p>
     */
    public static class RetryOnFailure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("maxRetries")
        private Long maxRetries;

        @com.aliyun.core.annotation.NameInMap("retryOnStatus")
        private java.util.List<String> retryOnStatus;

        @com.aliyun.core.annotation.NameInMap("retryTimeout")
        private Long retryTimeout;

        private RetryOnFailure(Builder builder) {
            this.enabled = builder.enabled;
            this.maxRetries = builder.maxRetries;
            this.retryOnStatus = builder.retryOnStatus;
            this.retryTimeout = builder.retryTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryOnFailure create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxRetries
         */
        public Long getMaxRetries() {
            return this.maxRetries;
        }

        /**
         * @return retryOnStatus
         */
        public java.util.List<String> getRetryOnStatus() {
            return this.retryOnStatus;
        }

        /**
         * @return retryTimeout
         */
        public Long getRetryTimeout() {
            return this.retryTimeout;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Long maxRetries; 
            private java.util.List<String> retryOnStatus; 
            private Long retryTimeout; 

            private Builder() {
            } 

            private Builder(RetryOnFailure model) {
                this.enabled = model.enabled;
                this.maxRetries = model.maxRetries;
                this.retryOnStatus = model.retryOnStatus;
                this.retryTimeout = model.retryTimeout;
            } 

            /**
             * <p>Specifies whether to enable retries upon current request failure.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of retries for the current request.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxRetries(Long maxRetries) {
                this.maxRetries = maxRetries;
                return this;
            }

            /**
             * <p>The set of response status matching rules that trigger retries for the current request.</p>
             */
            public Builder retryOnStatus(java.util.List<String> retryOnStatus) {
                this.retryOnStatus = retryOnStatus;
                return this;
            }

            /**
             * <p>The retry timeout configuration for the current request.</p>
             * 
             * <strong>example:</strong>
             * <p>30000</p>
             */
            public Builder retryTimeout(Long retryTimeout) {
                this.retryTimeout = retryTimeout;
                return this;
            }

            public RetryOnFailure build() {
                return new RetryOnFailure(this);
            } 

        } 

    }
    /**
     * 
     * {@link AiServiceConfig} extends {@link TeaModel}
     *
     * <p>AiServiceConfig</p>
     */
    public static class VertexServiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("geminiSafetySetting")
        private java.util.Map<String, String> geminiSafetySetting;

        @com.aliyun.core.annotation.NameInMap("vertexAuthKey")
        private String vertexAuthKey;

        @com.aliyun.core.annotation.NameInMap("vertexAuthServiceName")
        private String vertexAuthServiceName;

        @com.aliyun.core.annotation.NameInMap("vertexOpenAICompatible")
        private Boolean vertexOpenAICompatible;

        @com.aliyun.core.annotation.NameInMap("vertexProjectId")
        private String vertexProjectId;

        @com.aliyun.core.annotation.NameInMap("vertexRegion")
        private String vertexRegion;

        @com.aliyun.core.annotation.NameInMap("vertexTokenRefreshAhead")
        private Integer vertexTokenRefreshAhead;

        private VertexServiceConfig(Builder builder) {
            this.geminiSafetySetting = builder.geminiSafetySetting;
            this.vertexAuthKey = builder.vertexAuthKey;
            this.vertexAuthServiceName = builder.vertexAuthServiceName;
            this.vertexOpenAICompatible = builder.vertexOpenAICompatible;
            this.vertexProjectId = builder.vertexProjectId;
            this.vertexRegion = builder.vertexRegion;
            this.vertexTokenRefreshAhead = builder.vertexTokenRefreshAhead;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VertexServiceConfig create() {
            return builder().build();
        }

        /**
         * @return geminiSafetySetting
         */
        public java.util.Map<String, String> getGeminiSafetySetting() {
            return this.geminiSafetySetting;
        }

        /**
         * @return vertexAuthKey
         */
        public String getVertexAuthKey() {
            return this.vertexAuthKey;
        }

        /**
         * @return vertexAuthServiceName
         */
        public String getVertexAuthServiceName() {
            return this.vertexAuthServiceName;
        }

        /**
         * @return vertexOpenAICompatible
         */
        public Boolean getVertexOpenAICompatible() {
            return this.vertexOpenAICompatible;
        }

        /**
         * @return vertexProjectId
         */
        public String getVertexProjectId() {
            return this.vertexProjectId;
        }

        /**
         * @return vertexRegion
         */
        public String getVertexRegion() {
            return this.vertexRegion;
        }

        /**
         * @return vertexTokenRefreshAhead
         */
        public Integer getVertexTokenRefreshAhead() {
            return this.vertexTokenRefreshAhead;
        }

        public static final class Builder {
            private java.util.Map<String, String> geminiSafetySetting; 
            private String vertexAuthKey; 
            private String vertexAuthServiceName; 
            private Boolean vertexOpenAICompatible; 
            private String vertexProjectId; 
            private String vertexRegion; 
            private Integer vertexTokenRefreshAhead; 

            private Builder() {
            } 

            private Builder(VertexServiceConfig model) {
                this.geminiSafetySetting = model.geminiSafetySetting;
                this.vertexAuthKey = model.vertexAuthKey;
                this.vertexAuthServiceName = model.vertexAuthServiceName;
                this.vertexOpenAICompatible = model.vertexOpenAICompatible;
                this.vertexProjectId = model.vertexProjectId;
                this.vertexRegion = model.vertexRegion;
                this.vertexTokenRefreshAhead = model.vertexTokenRefreshAhead;
            } 

            /**
             * <p>The safety filtering level settings for the Gemini model.</p>
             */
            public Builder geminiSafetySetting(java.util.Map<String, String> geminiSafetySetting) {
                this.geminiSafetySetting = geminiSafetySetting;
                return this;
            }

            /**
             * <p>The authentication key for Vertex AI.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;type\&quot;:\&quot;service_account\&quot;,\&quot;project_id\&quot;:\&quot;my-project\&quot;,\&quot;private_key\&quot;:\&quot;-----BEGIN PRIVATE KEY-----...\&quot;,\&quot;client_email\&quot;:\&quot;<a href="mailto:xxx@xxx.iam.gserviceaccount.com">xxx@xxx.iam.gserviceaccount.com</a>\&quot;,\&quot;token_uri\&quot;:\&quot;<a href="https://oauth2.googleapis.com/token%5C%5C%22%7D">https://oauth2.googleapis.com/token\\&quot;}</a></p>
             */
            public Builder vertexAuthKey(String vertexAuthKey) {
                this.vertexAuthKey = vertexAuthKey;
                return this;
            }

            /**
             * <p>The authentication service name used by Vertex AI.</p>
             * 
             * <strong>example:</strong>
             * <p>google-oauth2</p>
             */
            public Builder vertexAuthServiceName(String vertexAuthServiceName) {
                this.vertexAuthServiceName = vertexAuthServiceName;
                return this;
            }

            /**
             * <p>Specifies whether to use the OpenAI-compatible interface of Vertex AI.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder vertexOpenAICompatible(Boolean vertexOpenAICompatible) {
                this.vertexOpenAICompatible = vertexOpenAICompatible;
                return this;
            }

            /**
             * <p>The Google Cloud project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>my-project</p>
             */
            public Builder vertexProjectId(String vertexProjectId) {
                this.vertexProjectId = vertexProjectId;
                return this;
            }

            /**
             * <p>The Google Cloud region where the Vertex AI service is located.</p>
             * 
             * <strong>example:</strong>
             * <p>us-central1</p>
             */
            public Builder vertexRegion(String vertexRegion) {
                this.vertexRegion = vertexRegion;
                return this;
            }

            /**
             * <p>The number of seconds before access token expiration to trigger an advance refresh.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder vertexTokenRefreshAhead(Integer vertexTokenRefreshAhead) {
                this.vertexTokenRefreshAhead = vertexTokenRefreshAhead;
                return this;
            }

            public VertexServiceConfig build() {
                return new VertexServiceConfig(this);
            } 

        } 

    }
}
