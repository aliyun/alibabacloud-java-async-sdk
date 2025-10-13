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
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("apiKeys")
    private java.util.List<String> apiKeys;

    @com.aliyun.core.annotation.NameInMap("bedrockServiceConfig")
    private BedrockServiceConfig bedrockServiceConfig;

    @com.aliyun.core.annotation.NameInMap("enableHealthCheck")
    private Boolean enableHealthCheck;

    @com.aliyun.core.annotation.NameInMap("paiEASServiceConfig")
    private PaiEASServiceConfig paiEASServiceConfig;

    @com.aliyun.core.annotation.NameInMap("protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private AiServiceConfig(Builder builder) {
        this.address = builder.address;
        this.apiKeys = builder.apiKeys;
        this.bedrockServiceConfig = builder.bedrockServiceConfig;
        this.enableHealthCheck = builder.enableHealthCheck;
        this.paiEASServiceConfig = builder.paiEASServiceConfig;
        this.protocols = builder.protocols;
        this.provider = builder.provider;
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
     * @return enableHealthCheck
     */
    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
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

    public static final class Builder {
        private String address; 
        private java.util.List<String> apiKeys; 
        private BedrockServiceConfig bedrockServiceConfig; 
        private Boolean enableHealthCheck; 
        private PaiEASServiceConfig paiEASServiceConfig; 
        private java.util.List<String> protocols; 
        private String provider; 

        private Builder() {
        } 

        private Builder(AiServiceConfig model) {
            this.address = model.address;
            this.apiKeys = model.apiKeys;
            this.bedrockServiceConfig = model.bedrockServiceConfig;
            this.enableHealthCheck = model.enableHealthCheck;
            this.paiEASServiceConfig = model.paiEASServiceConfig;
            this.protocols = model.protocols;
            this.provider = model.provider;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * apiKeys.
         */
        public Builder apiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }

        /**
         * bedrockServiceConfig.
         */
        public Builder bedrockServiceConfig(BedrockServiceConfig bedrockServiceConfig) {
            this.bedrockServiceConfig = bedrockServiceConfig;
            return this;
        }

        /**
         * enableHealthCheck.
         */
        public Builder enableHealthCheck(Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        /**
         * paiEASServiceConfig.
         */
        public Builder paiEASServiceConfig(PaiEASServiceConfig paiEASServiceConfig) {
            this.paiEASServiceConfig = paiEASServiceConfig;
            return this;
        }

        /**
         * protocols.
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
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
             * awsAccessKey.
             */
            public Builder awsAccessKey(String awsAccessKey) {
                this.awsAccessKey = awsAccessKey;
                return this;
            }

            /**
             * awsRegion.
             */
            public Builder awsRegion(String awsRegion) {
                this.awsRegion = awsRegion;
                return this;
            }

            /**
             * awsSecretKey.
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
             * endpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
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
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * workspaceId.
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
}
