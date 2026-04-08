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

    @com.aliyun.core.annotation.NameInMap("builtinRouteNames")
    private java.util.List<String> builtinRouteNames;

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

    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.NameInMap("mock")
    private HttpApiMockContract mock;

    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<HttpApiPolicyConfigs> policyConfigs;

    @com.aliyun.core.annotation.NameInMap("routeBackend")
    private Backend routeBackend;

    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<ServiceConfigs> serviceConfigs;

    @com.aliyun.core.annotation.NameInMap("subDomains")
    private java.util.List<SubDomains> subDomains;

    private HttpApiDeployConfig(Builder builder) {
        this.autoDeploy = builder.autoDeploy;
        this.backendScene = builder.backendScene;
        this.builtinRouteNames = builder.builtinRouteNames;
        this.customDomainIds = builder.customDomainIds;
        this.customDomainInfos = builder.customDomainInfos;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.gatewayInfo = builder.gatewayInfo;
        this.gatewayType = builder.gatewayType;
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
     * @return builtinRouteNames
     */
    public java.util.List<String> getBuiltinRouteNames() {
        return this.builtinRouteNames;
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
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
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
    public java.util.List<HttpApiPolicyConfigs> getPolicyConfigs() {
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
        private java.util.List<String> builtinRouteNames; 
        private java.util.List<String> customDomainIds; 
        private java.util.List<CustomDomainInfos> customDomainInfos; 
        private String environmentId; 
        private String gatewayId; 
        private GatewayInfo gatewayInfo; 
        private String gatewayType; 
        private HttpApiMockContract mock; 
        private java.util.List<HttpApiPolicyConfigs> policyConfigs; 
        private Backend routeBackend; 
        private java.util.List<ServiceConfigs> serviceConfigs; 
        private java.util.List<SubDomains> subDomains; 

        private Builder() {
        } 

        private Builder(HttpApiDeployConfig model) {
            this.autoDeploy = model.autoDeploy;
            this.backendScene = model.backendScene;
            this.builtinRouteNames = model.builtinRouteNames;
            this.customDomainIds = model.customDomainIds;
            this.customDomainInfos = model.customDomainInfos;
            this.environmentId = model.environmentId;
            this.gatewayId = model.gatewayId;
            this.gatewayInfo = model.gatewayInfo;
            this.gatewayType = model.gatewayType;
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
         * builtinRouteNames.
         */
        public Builder builtinRouteNames(java.util.List<String> builtinRouteNames) {
            this.builtinRouteNames = builtinRouteNames;
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
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
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
        public Builder policyConfigs(java.util.List<HttpApiPolicyConfigs> policyConfigs) {
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
    public static class ObservabilityRouteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("queueSize")
        private Integer queueSize;

        @com.aliyun.core.annotation.NameInMap("rateLimit")
        private Float rateLimit;

        private ObservabilityRouteConfig(Builder builder) {
            this.mode = builder.mode;
            this.queueSize = builder.queueSize;
            this.rateLimit = builder.rateLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObservabilityRouteConfig create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return queueSize
         */
        public Integer getQueueSize() {
            return this.queueSize;
        }

        /**
         * @return rateLimit
         */
        public Float getRateLimit() {
            return this.rateLimit;
        }

        public static final class Builder {
            private String mode; 
            private Integer queueSize; 
            private Float rateLimit; 

            private Builder() {
            } 

            private Builder(ObservabilityRouteConfig model) {
                this.mode = model.mode;
                this.queueSize = model.queueSize;
                this.rateLimit = model.rateLimit;
            } 

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * queueSize.
             */
            public Builder queueSize(Integer queueSize) {
                this.queueSize = queueSize;
                return this;
            }

            /**
             * rateLimit.
             */
            public Builder rateLimit(Float rateLimit) {
                this.rateLimit = rateLimit;
                return this;
            }

            public ObservabilityRouteConfig build() {
                return new ObservabilityRouteConfig(this);
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
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

        @com.aliyun.core.annotation.NameInMap("intentCode")
        private String intentCode;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelNamePattern")
        private String modelNamePattern;

        @com.aliyun.core.annotation.NameInMap("multiServiceRouteStrategy")
        private String multiServiceRouteStrategy;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("observabilityRouteConfig")
        private ObservabilityRouteConfig observabilityRouteConfig;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Long weight;

        private ServiceConfigs(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
            this.intentCode = builder.intentCode;
            this.match = builder.match;
            this.modelName = builder.modelName;
            this.modelNamePattern = builder.modelNamePattern;
            this.multiServiceRouteStrategy = builder.multiServiceRouteStrategy;
            this.name = builder.name;
            this.observabilityRouteConfig = builder.observabilityRouteConfig;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.serviceId = builder.serviceId;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return gatewayServiceId
         */
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        /**
         * @return intentCode
         */
        public String getIntentCode() {
            return this.intentCode;
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
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
         * @return multiServiceRouteStrategy
         */
        public String getMultiServiceRouteStrategy() {
            return this.multiServiceRouteStrategy;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return observabilityRouteConfig
         */
        public ObservabilityRouteConfig getObservabilityRouteConfig() {
            return this.observabilityRouteConfig;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String gatewayServiceId; 
            private String intentCode; 
            private HttpApiBackendMatchConditions match; 
            private String modelName; 
            private String modelNamePattern; 
            private String multiServiceRouteStrategy; 
            private String name; 
            private ObservabilityRouteConfig observabilityRouteConfig; 
            private Integer port; 
            private String protocol; 
            private String serviceId; 
            private String version; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.gatewayServiceId = model.gatewayServiceId;
                this.intentCode = model.intentCode;
                this.match = model.match;
                this.modelName = model.modelName;
                this.modelNamePattern = model.modelNamePattern;
                this.multiServiceRouteStrategy = model.multiServiceRouteStrategy;
                this.name = model.name;
                this.observabilityRouteConfig = model.observabilityRouteConfig;
                this.port = model.port;
                this.protocol = model.protocol;
                this.serviceId = model.serviceId;
                this.version = model.version;
                this.weight = model.weight;
            } 

            /**
             * gatewayServiceId.
             */
            public Builder gatewayServiceId(String gatewayServiceId) {
                this.gatewayServiceId = gatewayServiceId;
                return this;
            }

            /**
             * intentCode.
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
                return this;
            }

            /**
             * match.
             */
            public Builder match(HttpApiBackendMatchConditions match) {
                this.match = match;
                return this;
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
             * multiServiceRouteStrategy.
             */
            public Builder multiServiceRouteStrategy(String multiServiceRouteStrategy) {
                this.multiServiceRouteStrategy = multiServiceRouteStrategy;
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
             * observabilityRouteConfig.
             */
            public Builder observabilityRouteConfig(ObservabilityRouteConfig observabilityRouteConfig) {
                this.observabilityRouteConfig = observabilityRouteConfig;
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
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
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
             * version.
             */
            public Builder version(String version) {
                this.version = version;
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
