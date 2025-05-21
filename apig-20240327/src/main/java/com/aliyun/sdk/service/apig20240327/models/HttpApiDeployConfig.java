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
 * {@link HttpApiDeployConfig} extends {@link TeaModel}
 *
 * <p>HttpApiDeployConfig</p>
 */
public class HttpApiDeployConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoDeploy")
    private Boolean autoDeploy;

    @com.aliyun.core.annotation.NameInMap("backendScene")
    private String backendScene;

    @com.aliyun.core.annotation.NameInMap("customDomainIds")
    private java.util.List<String> customDomainIds;

    @com.aliyun.core.annotation.NameInMap("customDomainInfos")
    private java.util.List<CustomDomainInfos> customDomainInfos;

    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("gatewayInfo")
    private GatewayInfo gatewayInfo;

    @com.aliyun.core.annotation.NameInMap("mock")
    private HttpApiMockContract mock;

    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<PolicyConfigs> policyConfigs;

    @com.aliyun.core.annotation.NameInMap("routeBackend")
    private Backend routeBackend;

    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<ServiceConfigs> serviceConfigs;

    @com.aliyun.core.annotation.NameInMap("subDomains")
    private java.util.List<SubDomains> subDomains;

    private HttpApiDeployConfig(Builder builder) {
        this.autoDeploy = builder.autoDeploy;
        this.backendScene = builder.backendScene;
        this.customDomainIds = builder.customDomainIds;
        this.customDomainInfos = builder.customDomainInfos;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.gatewayInfo = builder.gatewayInfo;
        this.mock = builder.mock;
        this.policyConfigs = builder.policyConfigs;
        this.routeBackend = builder.routeBackend;
        this.serviceConfigs = builder.serviceConfigs;
        this.subDomains = builder.subDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiDeployConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDeploy
     */
    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    /**
     * @return backendScene
     */
    public String getBackendScene() {
        return this.backendScene;
    }

    /**
     * @return customDomainIds
     */
    public java.util.List<String> getCustomDomainIds() {
        return this.customDomainIds;
    }

    /**
     * @return customDomainInfos
     */
    public java.util.List<CustomDomainInfos> getCustomDomainInfos() {
        return this.customDomainInfos;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayInfo
     */
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    /**
     * @return mock
     */
    public HttpApiMockContract getMock() {
        return this.mock;
    }

    /**
     * @return policyConfigs
     */
    public java.util.List<PolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    /**
     * @return routeBackend
     */
    public Backend getRouteBackend() {
        return this.routeBackend;
    }

    /**
     * @return serviceConfigs
     */
    public java.util.List<ServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    /**
     * @return subDomains
     */
    public java.util.List<SubDomains> getSubDomains() {
        return this.subDomains;
    }

    public static final class Builder {
        private Boolean autoDeploy; 
        private String backendScene; 
        private java.util.List<String> customDomainIds; 
        private java.util.List<CustomDomainInfos> customDomainInfos; 
        private String environmentId; 
        private String gatewayId; 
        private GatewayInfo gatewayInfo; 
        private HttpApiMockContract mock; 
        private java.util.List<PolicyConfigs> policyConfigs; 
        private Backend routeBackend; 
        private java.util.List<ServiceConfigs> serviceConfigs; 
        private java.util.List<SubDomains> subDomains; 

        private Builder() {
        } 

        private Builder(HttpApiDeployConfig model) {
            this.autoDeploy = model.autoDeploy;
            this.backendScene = model.backendScene;
            this.customDomainIds = model.customDomainIds;
            this.customDomainInfos = model.customDomainInfos;
            this.environmentId = model.environmentId;
            this.gatewayId = model.gatewayId;
            this.gatewayInfo = model.gatewayInfo;
            this.mock = model.mock;
            this.policyConfigs = model.policyConfigs;
            this.routeBackend = model.routeBackend;
            this.serviceConfigs = model.serviceConfigs;
            this.subDomains = model.subDomains;
        } 

        /**
         * autoDeploy.
         */
        public Builder autoDeploy(Boolean autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }

        /**
         * backendScene.
         */
        public Builder backendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }

        /**
         * customDomainIds.
         */
        public Builder customDomainIds(java.util.List<String> customDomainIds) {
            this.customDomainIds = customDomainIds;
            return this;
        }

        /**
         * customDomainInfos.
         */
        public Builder customDomainInfos(java.util.List<CustomDomainInfos> customDomainInfos) {
            this.customDomainInfos = customDomainInfos;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * gatewayInfo.
         */
        public Builder gatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }

        /**
         * mock.
         */
        public Builder mock(HttpApiMockContract mock) {
            this.mock = mock;
            return this;
        }

        /**
         * policyConfigs.
         */
        public Builder policyConfigs(java.util.List<PolicyConfigs> policyConfigs) {
            this.policyConfigs = policyConfigs;
            return this;
        }

        /**
         * routeBackend.
         */
        public Builder routeBackend(Backend routeBackend) {
            this.routeBackend = routeBackend;
            return this;
        }

        /**
         * serviceConfigs.
         */
        public Builder serviceConfigs(java.util.List<ServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }

        /**
         * subDomains.
         */
        public Builder subDomains(java.util.List<SubDomains> subDomains) {
            this.subDomains = subDomains;
            return this;
        }

        public HttpApiDeployConfig build() {
            return new HttpApiDeployConfig(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class CustomDomainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private CustomDomainInfos(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomDomainInfos create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(CustomDomainInfos model) {
                this.domainId = model.domainId;
                this.name = model.name;
                this.protocol = model.protocol;
            } 

            /**
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public CustomDomainInfos build() {
                return new CustomDomainInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class AiFallbackConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("serviceIds")
        private java.util.List<String> serviceIds;

        private AiFallbackConfig(Builder builder) {
            this.serviceIds = builder.serviceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiFallbackConfig create() {
            return builder().build();
        }

        /**
         * @return serviceIds
         */
        public java.util.List<String> getServiceIds() {
            return this.serviceIds;
        }

        public static final class Builder {
            private java.util.List<String> serviceIds; 

            private Builder() {
            } 

            private Builder(AiFallbackConfig model) {
                this.serviceIds = model.serviceIds;
            } 

            /**
             * serviceIds.
             */
            public Builder serviceIds(java.util.List<String> serviceIds) {
                this.serviceIds = serviceIds;
                return this;
            }

            public AiFallbackConfig build() {
                return new AiFallbackConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class PolicyConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiFallbackConfig")
        private AiFallbackConfig aiFallbackConfig;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PolicyConfigs(Builder builder) {
            this.aiFallbackConfig = builder.aiFallbackConfig;
            this.enable = builder.enable;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyConfigs create() {
            return builder().build();
        }

        /**
         * @return aiFallbackConfig
         */
        public AiFallbackConfig getAiFallbackConfig() {
            return this.aiFallbackConfig;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private AiFallbackConfig aiFallbackConfig; 
            private Boolean enable; 
            private String type; 

            private Builder() {
            } 

            private Builder(PolicyConfigs model) {
                this.aiFallbackConfig = model.aiFallbackConfig;
                this.enable = model.enable;
                this.type = model.type;
            } 

            /**
             * aiFallbackConfig.
             */
            public Builder aiFallbackConfig(AiFallbackConfig aiFallbackConfig) {
                this.aiFallbackConfig = aiFallbackConfig;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PolicyConfigs build() {
                return new PolicyConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelNamePattern")
        private String modelNamePattern;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Long weight;

        private ServiceConfigs(Builder builder) {
            this.modelName = builder.modelName;
            this.modelNamePattern = builder.modelNamePattern;
            this.serviceId = builder.serviceId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelNamePattern
         */
        public String getModelNamePattern() {
            return this.modelNamePattern;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String modelName; 
            private String modelNamePattern; 
            private String serviceId; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.modelName = model.modelName;
                this.modelNamePattern = model.modelNamePattern;
                this.serviceId = model.serviceId;
                this.weight = model.weight;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * modelNamePattern.
             */
            public Builder modelNamePattern(String modelNamePattern) {
                this.modelNamePattern = modelNamePattern;
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
             * weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class SubDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private SubDomains(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDomains create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String networkType; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(SubDomains model) {
                this.domainId = model.domainId;
                this.name = model.name;
                this.networkType = model.networkType;
                this.protocol = model.protocol;
            } 

            /**
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * networkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public SubDomains build() {
                return new SubDomains(this);
            } 

        } 

    }
}
