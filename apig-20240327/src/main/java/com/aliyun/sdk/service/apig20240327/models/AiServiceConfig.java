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

    @com.aliyun.core.annotation.NameInMap("apiKeys")
    private java.util.List<String> apiKeys;

    @com.aliyun.core.annotation.NameInMap("bedrockServiceConfig")
    private BedrockServiceConfig bedrockServiceConfig;

    @com.aliyun.core.annotation.NameInMap("compatibleProtocols")
    private java.util.List<String> compatibleProtocols;

    @com.aliyun.core.annotation.NameInMap("defaultModelName")
    private String defaultModelName;

    @com.aliyun.core.annotation.NameInMap("enableHealthCheck")
    private Boolean enableHealthCheck;

    @com.aliyun.core.annotation.NameInMap("enableOutlierDetection")
    private Boolean enableOutlierDetection;

    @com.aliyun.core.annotation.NameInMap("paiEASServiceConfig")
    private PaiEASServiceConfig paiEASServiceConfig;

    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("vertexServiceConfig")
    private VertexServiceConfig vertexServiceConfig;

    private AiServiceConfig(Builder builder) {
        this.apiKeyGenerateMode = builder.apiKeyGenerateMode;
        this.address = builder.address;
        this.apiKeys = builder.apiKeys;
        this.bedrockServiceConfig = builder.bedrockServiceConfig;
        this.compatibleProtocols = builder.compatibleProtocols;
        this.defaultModelName = builder.defaultModelName;
        this.enableHealthCheck = builder.enableHealthCheck;
        this.enableOutlierDetection = builder.enableOutlierDetection;
        this.paiEASServiceConfig = builder.paiEASServiceConfig;
        this.protocols = builder.protocols;
        this.provider = builder.provider;
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
     * @return apiKeys
     */
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
    }

    /**
     * @return bedrockServiceConfig
     */
    public BedrockServiceConfig getBedrockServiceConfig() {
        return this.bedrockServiceConfig;
    }

    /**
     * @return compatibleProtocols
     */
    public java.util.List<String> getCompatibleProtocols() {
        return this.compatibleProtocols;
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
     * @return vertexServiceConfig
     */
    public VertexServiceConfig getVertexServiceConfig() {
        return this.vertexServiceConfig;
    }

    public static final class Builder {
        private String apiKeyGenerateMode; 
        private String address; 
        private java.util.List<String> apiKeys; 
        private BedrockServiceConfig bedrockServiceConfig; 
        private java.util.List<String> compatibleProtocols; 
        private String defaultModelName; 
        private Boolean enableHealthCheck; 
        private Boolean enableOutlierDetection; 
        private PaiEASServiceConfig paiEASServiceConfig; 
        private java.util.List<String> protocols; 
        private String provider; 
        private VertexServiceConfig vertexServiceConfig; 

        private Builder() {
        } 

        private Builder(AiServiceConfig model) {
            this.apiKeyGenerateMode = model.apiKeyGenerateMode;
            this.address = model.address;
            this.apiKeys = model.apiKeys;
            this.bedrockServiceConfig = model.bedrockServiceConfig;
            this.compatibleProtocols = model.compatibleProtocols;
            this.defaultModelName = model.defaultModelName;
            this.enableHealthCheck = model.enableHealthCheck;
            this.enableOutlierDetection = model.enableOutlierDetection;
            this.paiEASServiceConfig = model.paiEASServiceConfig;
            this.protocols = model.protocols;
            this.provider = model.provider;
            this.vertexServiceConfig = model.vertexServiceConfig;
        } 

        /**
         * <p>API key generation mode.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder apiKeyGenerateMode(String apiKeyGenerateMode) {
            this.apiKeyGenerateMode = apiKeyGenerateMode;
            return this;
        }

        /**
         * <p>The service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyun.com">https://dashscope.aliyun.com</a></p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The API keys.</p>
         */
        public Builder apiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * <p>Bedrock service configuration.</p>
         */
        public Builder bedrockServiceConfig(BedrockServiceConfig bedrockServiceConfig) {
            this.bedrockServiceConfig = bedrockServiceConfig;
            return this;
        }

        /**
         * <p>Supported compatible protocols.</p>
         */
        public Builder compatibleProtocols(java.util.List<String> compatibleProtocols) {
            this.compatibleProtocols = compatibleProtocols;
            return this;
        }

        /**
         * <p>Default model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-turbo</p>
         */
        public Builder defaultModelName(String defaultModelName) {
            this.defaultModelName = defaultModelName;
            return this;
        }

        /**
         * <p>Specifies whether to enable health check.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableHealthCheck(Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        /**
         * <p>Enable outlier detection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableOutlierDetection(Boolean enableOutlierDetection) {
            this.enableOutlierDetection = enableOutlierDetection;
            return this;
        }

        /**
         * <p>PAI-EAS service configuration settings.</p>
         */
        public Builder paiEASServiceConfig(PaiEASServiceConfig paiEASServiceConfig) {
            this.paiEASServiceConfig = paiEASServiceConfig;
            return this;
        }

        /**
         * <p>The LLM protocols.</p>
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>The Large Language Model (LLM) provider.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>Vertex AI service configuration.</p>
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
    public static class BedrockServiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("awsAccessKey")
        private String awsAccessKey;

        @com.aliyun.core.annotation.NameInMap("awsRegion")
        private String awsRegion;

        @com.aliyun.core.annotation.NameInMap("awsSecretKey")
        private String awsSecretKey;

        private BedrockServiceConfig(Builder builder) {
            this.awsAccessKey = builder.awsAccessKey;
            this.awsRegion = builder.awsRegion;
            this.awsSecretKey = builder.awsSecretKey;
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

        public static final class Builder {
            private String awsAccessKey; 
            private String awsRegion; 
            private String awsSecretKey; 

            private Builder() {
            } 

            private Builder(BedrockServiceConfig model) {
                this.awsAccessKey = model.awsAccessKey;
                this.awsRegion = model.awsRegion;
                this.awsSecretKey = model.awsSecretKey;
            } 

            /**
             * <p>AWS-AccessKey</p>
             * 
             * <strong>example:</strong>
             * <p>AKIAIOSFODNN7EXAMPLE</p>
             */
            public Builder awsAccessKey(String awsAccessKey) {
                this.awsAccessKey = awsAccessKey;
                return this;
            }

            /**
             * <p>AWS-Region</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-2</p>
             */
            public Builder awsRegion(String awsRegion) {
                this.awsRegion = awsRegion;
                return this;
            }

            /**
             * <p>AWS-SecretKey</p>
             * 
             * <strong>example:</strong>
             * <p>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</p>
             */
            public Builder awsSecretKey(String awsSecretKey) {
                this.awsSecretKey = awsSecretKey;
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
             * <p>Type of endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;public&quot;，&quot;private&quot;</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>Service identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>svc-d33onfmm1hkn5duhuqjg</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>service-hello</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Workspace identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>plw-d5g7qsem1hkmih54g210</p>
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
    public static class VertexServiceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("geminiSafetySetting")
        private java.util.Map<String, String> geminiSafetySetting;

        @com.aliyun.core.annotation.NameInMap("vertexAuthKey")
        private String vertexAuthKey;

        @com.aliyun.core.annotation.NameInMap("vertexAuthServiceName")
        private String vertexAuthServiceName;

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
            private String vertexProjectId; 
            private String vertexRegion; 
            private Integer vertexTokenRefreshAhead; 

            private Builder() {
            } 

            private Builder(VertexServiceConfig model) {
                this.geminiSafetySetting = model.geminiSafetySetting;
                this.vertexAuthKey = model.vertexAuthKey;
                this.vertexAuthServiceName = model.vertexAuthServiceName;
                this.vertexProjectId = model.vertexProjectId;
                this.vertexRegion = model.vertexRegion;
                this.vertexTokenRefreshAhead = model.vertexTokenRefreshAhead;
            } 

            /**
             * <p>Gemini safety settings.</p>
             */
            public Builder geminiSafetySetting(java.util.Map<String, String> geminiSafetySetting) {
                this.geminiSafetySetting = geminiSafetySetting;
                return this;
            }

            /**
             * <p>Vertex AI authentication key.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;type\&quot;:\&quot;service_account\&quot;,\&quot;project_id\&quot;:\&quot;xxx\&quot;,\&quot;private_key\&quot;:\&quot;-----BEGIN PRIVATE KEY-----\&quot;,\&quot;client_email\&quot;:\&quot;<a href="mailto:xxx@xxx.iam.gserviceaccount.com">xxx@xxx.iam.gserviceaccount.com</a>\&quot;,\&quot;token_uri\&quot;:\&quot;<a href="https://oauth2.googleapis.com/token%5C%5C%22%7D">https://oauth2.googleapis.com/token\\&quot;}</a></p>
             */
            public Builder vertexAuthKey(String vertexAuthKey) {
                this.vertexAuthKey = vertexAuthKey;
                return this;
            }

            /**
             * <p>Vertex AI auth service name.</p>
             * 
             * <strong>example:</strong>
             * <p>custom-vertex-auth</p>
             */
            public Builder vertexAuthServiceName(String vertexAuthServiceName) {
                this.vertexAuthServiceName = vertexAuthServiceName;
                return this;
            }

            /**
             * <p>Vertex AI project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>my-gcp-project-123</p>
             */
            public Builder vertexProjectId(String vertexProjectId) {
                this.vertexProjectId = vertexProjectId;
                return this;
            }

            /**
             * <p>Vertex AI region.</p>
             * 
             * <strong>example:</strong>
             * <p>us-central1</p>
             */
            public Builder vertexRegion(String vertexRegion) {
                this.vertexRegion = vertexRegion;
                return this;
            }

            /**
             * <p>Vertex token refresh lead time.</p>
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
