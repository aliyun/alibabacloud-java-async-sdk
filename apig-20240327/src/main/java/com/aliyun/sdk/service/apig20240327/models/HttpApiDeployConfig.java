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

    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

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
        private String gatewayType; 
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
    public static class AiFallbackConfigServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("targetModelName")
        private String targetModelName;

        private AiFallbackConfigServiceConfigs(Builder builder) {
            this.serviceId = builder.serviceId;
            this.targetModelName = builder.targetModelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiFallbackConfigServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return targetModelName
         */
        public String getTargetModelName() {
            return this.targetModelName;
        }

        public static final class Builder {
            private String serviceId; 
            private String targetModelName; 

            private Builder() {
            } 

            private Builder(AiFallbackConfigServiceConfigs model) {
                this.serviceId = model.serviceId;
                this.targetModelName = model.targetModelName;
            } 

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * targetModelName.
             */
            public Builder targetModelName(String targetModelName) {
                this.targetModelName = targetModelName;
                return this;
            }

            public AiFallbackConfigServiceConfigs build() {
                return new AiFallbackConfigServiceConfigs(this);
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
        @com.aliyun.core.annotation.NameInMap("serviceConfigs")
        private java.util.List<AiFallbackConfigServiceConfigs> serviceConfigs;

        private AiFallbackConfig(Builder builder) {
            this.serviceConfigs = builder.serviceConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiFallbackConfig create() {
            return builder().build();
        }

        /**
         * @return serviceConfigs
         */
        public java.util.List<AiFallbackConfigServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        public static final class Builder {
            private java.util.List<AiFallbackConfigServiceConfigs> serviceConfigs; 

            private Builder() {
            } 

            private Builder(AiFallbackConfig model) {
                this.serviceConfigs = model.serviceConfigs;
            } 

            /**
             * serviceConfigs.
             */
            public Builder serviceConfigs(java.util.List<AiFallbackConfigServiceConfigs> serviceConfigs) {
                this.serviceConfigs = serviceConfigs;
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
    public static class ConsumerRequestCheckService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("modalityType")
        private String modalityType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("requestCheckService")
        private String requestCheckService;

        @com.aliyun.core.annotation.NameInMap("requestImageCheckService")
        private String requestImageCheckService;

        private ConsumerRequestCheckService(Builder builder) {
            this.matchType = builder.matchType;
            this.modalityType = builder.modalityType;
            this.name = builder.name;
            this.requestCheckService = builder.requestCheckService;
            this.requestImageCheckService = builder.requestImageCheckService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRequestCheckService create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return modalityType
         */
        public String getModalityType() {
            return this.modalityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return requestCheckService
         */
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        /**
         * @return requestImageCheckService
         */
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        public static final class Builder {
            private String matchType; 
            private String modalityType; 
            private String name; 
            private String requestCheckService; 
            private String requestImageCheckService; 

            private Builder() {
            } 

            private Builder(ConsumerRequestCheckService model) {
                this.matchType = model.matchType;
                this.modalityType = model.modalityType;
                this.name = model.name;
                this.requestCheckService = model.requestCheckService;
                this.requestImageCheckService = model.requestImageCheckService;
            } 

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * modalityType.
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
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
             * requestCheckService.
             */
            public Builder requestCheckService(String requestCheckService) {
                this.requestCheckService = requestCheckService;
                return this;
            }

            /**
             * requestImageCheckService.
             */
            public Builder requestImageCheckService(String requestImageCheckService) {
                this.requestImageCheckService = requestImageCheckService;
                return this;
            }

            public ConsumerRequestCheckService build() {
                return new ConsumerRequestCheckService(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class ConsumerResponseCheckService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("modalityType")
        private String modalityType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("responseCheckService")
        private String responseCheckService;

        @com.aliyun.core.annotation.NameInMap("responseImageCheckService")
        private String responseImageCheckService;

        private ConsumerResponseCheckService(Builder builder) {
            this.matchType = builder.matchType;
            this.modalityType = builder.modalityType;
            this.name = builder.name;
            this.responseCheckService = builder.responseCheckService;
            this.responseImageCheckService = builder.responseImageCheckService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerResponseCheckService create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return modalityType
         */
        public String getModalityType() {
            return this.modalityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return responseCheckService
         */
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        /**
         * @return responseImageCheckService
         */
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        public static final class Builder {
            private String matchType; 
            private String modalityType; 
            private String name; 
            private String responseCheckService; 
            private String responseImageCheckService; 

            private Builder() {
            } 

            private Builder(ConsumerResponseCheckService model) {
                this.matchType = model.matchType;
                this.modalityType = model.modalityType;
                this.name = model.name;
                this.responseCheckService = model.responseCheckService;
                this.responseImageCheckService = model.responseImageCheckService;
            } 

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * modalityType.
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
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
             * responseCheckService.
             */
            public Builder responseCheckService(String responseCheckService) {
                this.responseCheckService = responseCheckService;
                return this;
            }

            /**
             * responseImageCheckService.
             */
            public Builder responseImageCheckService(String responseImageCheckService) {
                this.responseImageCheckService = responseImageCheckService;
                return this;
            }

            public ConsumerResponseCheckService build() {
                return new ConsumerResponseCheckService(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class ConsumerRiskLevel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ConsumerRiskLevel(Builder builder) {
            this.level = builder.level;
            this.matchType = builder.matchType;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRiskLevel create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private String matchType; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(ConsumerRiskLevel model) {
                this.level = model.level;
                this.matchType = model.matchType;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConsumerRiskLevel build() {
                return new ConsumerRiskLevel(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class ConsumerRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("pattern")
        private String pattern;

        private ConsumerRules(Builder builder) {
            this.matchType = builder.matchType;
            this.pattern = builder.pattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRules create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        public static final class Builder {
            private String matchType; 
            private String pattern; 

            private Builder() {
            } 

            private Builder(ConsumerRules model) {
                this.matchType = model.matchType;
                this.pattern = model.pattern;
            } 

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            public ConsumerRules build() {
                return new ConsumerRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class RiskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerRules")
        private ConsumerRules consumerRules;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private RiskConfig(Builder builder) {
            this.consumerRules = builder.consumerRules;
            this.level = builder.level;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskConfig create() {
            return builder().build();
        }

        /**
         * @return consumerRules
         */
        public ConsumerRules getConsumerRules() {
            return this.consumerRules;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ConsumerRules consumerRules; 
            private String level; 
            private String type; 

            private Builder() {
            } 

            private Builder(RiskConfig model) {
                this.consumerRules = model.consumerRules;
                this.level = model.level;
                this.type = model.type;
            } 

            /**
             * consumerRules.
             */
            public Builder consumerRules(ConsumerRules consumerRules) {
                this.consumerRules = consumerRules;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RiskConfig build() {
                return new RiskConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class AiSecurityGuardConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bufferLimit")
        private Integer bufferLimit;

        @com.aliyun.core.annotation.NameInMap("checkRequest")
        private Boolean checkRequest;

        @com.aliyun.core.annotation.NameInMap("checkRequestImage")
        private Boolean checkRequestImage;

        @com.aliyun.core.annotation.NameInMap("checkResponse")
        private Boolean checkResponse;

        @com.aliyun.core.annotation.NameInMap("checkResponseImage")
        private Boolean checkResponseImage;

        @com.aliyun.core.annotation.NameInMap("consumerRequestCheckService")
        private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService;

        @com.aliyun.core.annotation.NameInMap("consumerResponseCheckService")
        private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService;

        @com.aliyun.core.annotation.NameInMap("consumerRiskLevel")
        private java.util.List<ConsumerRiskLevel> consumerRiskLevel;

        @com.aliyun.core.annotation.NameInMap("requestCheckService")
        private String requestCheckService;

        @com.aliyun.core.annotation.NameInMap("requestImageCheckService")
        private String requestImageCheckService;

        @com.aliyun.core.annotation.NameInMap("responseCheckService")
        private String responseCheckService;

        @com.aliyun.core.annotation.NameInMap("responseImageCheckService")
        private String responseImageCheckService;

        @com.aliyun.core.annotation.NameInMap("riskAlertLevel")
        private String riskAlertLevel;

        @com.aliyun.core.annotation.NameInMap("riskConfig")
        private java.util.List<RiskConfig> riskConfig;

        @com.aliyun.core.annotation.NameInMap("serviceAddress")
        private String serviceAddress;

        private AiSecurityGuardConfig(Builder builder) {
            this.bufferLimit = builder.bufferLimit;
            this.checkRequest = builder.checkRequest;
            this.checkRequestImage = builder.checkRequestImage;
            this.checkResponse = builder.checkResponse;
            this.checkResponseImage = builder.checkResponseImage;
            this.consumerRequestCheckService = builder.consumerRequestCheckService;
            this.consumerResponseCheckService = builder.consumerResponseCheckService;
            this.consumerRiskLevel = builder.consumerRiskLevel;
            this.requestCheckService = builder.requestCheckService;
            this.requestImageCheckService = builder.requestImageCheckService;
            this.responseCheckService = builder.responseCheckService;
            this.responseImageCheckService = builder.responseImageCheckService;
            this.riskAlertLevel = builder.riskAlertLevel;
            this.riskConfig = builder.riskConfig;
            this.serviceAddress = builder.serviceAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiSecurityGuardConfig create() {
            return builder().build();
        }

        /**
         * @return bufferLimit
         */
        public Integer getBufferLimit() {
            return this.bufferLimit;
        }

        /**
         * @return checkRequest
         */
        public Boolean getCheckRequest() {
            return this.checkRequest;
        }

        /**
         * @return checkRequestImage
         */
        public Boolean getCheckRequestImage() {
            return this.checkRequestImage;
        }

        /**
         * @return checkResponse
         */
        public Boolean getCheckResponse() {
            return this.checkResponse;
        }

        /**
         * @return checkResponseImage
         */
        public Boolean getCheckResponseImage() {
            return this.checkResponseImage;
        }

        /**
         * @return consumerRequestCheckService
         */
        public java.util.List<ConsumerRequestCheckService> getConsumerRequestCheckService() {
            return this.consumerRequestCheckService;
        }

        /**
         * @return consumerResponseCheckService
         */
        public java.util.List<ConsumerResponseCheckService> getConsumerResponseCheckService() {
            return this.consumerResponseCheckService;
        }

        /**
         * @return consumerRiskLevel
         */
        public java.util.List<ConsumerRiskLevel> getConsumerRiskLevel() {
            return this.consumerRiskLevel;
        }

        /**
         * @return requestCheckService
         */
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        /**
         * @return requestImageCheckService
         */
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        /**
         * @return responseCheckService
         */
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        /**
         * @return responseImageCheckService
         */
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        /**
         * @return riskAlertLevel
         */
        public String getRiskAlertLevel() {
            return this.riskAlertLevel;
        }

        /**
         * @return riskConfig
         */
        public java.util.List<RiskConfig> getRiskConfig() {
            return this.riskConfig;
        }

        /**
         * @return serviceAddress
         */
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public static final class Builder {
            private Integer bufferLimit; 
            private Boolean checkRequest; 
            private Boolean checkRequestImage; 
            private Boolean checkResponse; 
            private Boolean checkResponseImage; 
            private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService; 
            private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService; 
            private java.util.List<ConsumerRiskLevel> consumerRiskLevel; 
            private String requestCheckService; 
            private String requestImageCheckService; 
            private String responseCheckService; 
            private String responseImageCheckService; 
            private String riskAlertLevel; 
            private java.util.List<RiskConfig> riskConfig; 
            private String serviceAddress; 

            private Builder() {
            } 

            private Builder(AiSecurityGuardConfig model) {
                this.bufferLimit = model.bufferLimit;
                this.checkRequest = model.checkRequest;
                this.checkRequestImage = model.checkRequestImage;
                this.checkResponse = model.checkResponse;
                this.checkResponseImage = model.checkResponseImage;
                this.consumerRequestCheckService = model.consumerRequestCheckService;
                this.consumerResponseCheckService = model.consumerResponseCheckService;
                this.consumerRiskLevel = model.consumerRiskLevel;
                this.requestCheckService = model.requestCheckService;
                this.requestImageCheckService = model.requestImageCheckService;
                this.responseCheckService = model.responseCheckService;
                this.responseImageCheckService = model.responseImageCheckService;
                this.riskAlertLevel = model.riskAlertLevel;
                this.riskConfig = model.riskConfig;
                this.serviceAddress = model.serviceAddress;
            } 

            /**
             * bufferLimit.
             */
            public Builder bufferLimit(Integer bufferLimit) {
                this.bufferLimit = bufferLimit;
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
             * checkRequestImage.
             */
            public Builder checkRequestImage(Boolean checkRequestImage) {
                this.checkRequestImage = checkRequestImage;
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
             * checkResponseImage.
             */
            public Builder checkResponseImage(Boolean checkResponseImage) {
                this.checkResponseImage = checkResponseImage;
                return this;
            }

            /**
             * consumerRequestCheckService.
             */
            public Builder consumerRequestCheckService(java.util.List<ConsumerRequestCheckService> consumerRequestCheckService) {
                this.consumerRequestCheckService = consumerRequestCheckService;
                return this;
            }

            /**
             * consumerResponseCheckService.
             */
            public Builder consumerResponseCheckService(java.util.List<ConsumerResponseCheckService> consumerResponseCheckService) {
                this.consumerResponseCheckService = consumerResponseCheckService;
                return this;
            }

            /**
             * consumerRiskLevel.
             */
            public Builder consumerRiskLevel(java.util.List<ConsumerRiskLevel> consumerRiskLevel) {
                this.consumerRiskLevel = consumerRiskLevel;
                return this;
            }

            /**
             * requestCheckService.
             */
            public Builder requestCheckService(String requestCheckService) {
                this.requestCheckService = requestCheckService;
                return this;
            }

            /**
             * requestImageCheckService.
             */
            public Builder requestImageCheckService(String requestImageCheckService) {
                this.requestImageCheckService = requestImageCheckService;
                return this;
            }

            /**
             * responseCheckService.
             */
            public Builder responseCheckService(String responseCheckService) {
                this.responseCheckService = responseCheckService;
                return this;
            }

            /**
             * responseImageCheckService.
             */
            public Builder responseImageCheckService(String responseImageCheckService) {
                this.responseImageCheckService = responseImageCheckService;
                return this;
            }

            /**
             * riskAlertLevel.
             */
            public Builder riskAlertLevel(String riskAlertLevel) {
                this.riskAlertLevel = riskAlertLevel;
                return this;
            }

            /**
             * riskConfig.
             */
            public Builder riskConfig(java.util.List<RiskConfig> riskConfig) {
                this.riskConfig = riskConfig;
                return this;
            }

            /**
             * serviceAddress.
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            public AiSecurityGuardConfig build() {
                return new AiSecurityGuardConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class GlobalRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limitMode")
        private String limitMode;

        @com.aliyun.core.annotation.NameInMap("limitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("limitValue")
        private Integer limitValue;

        @com.aliyun.core.annotation.NameInMap("matchKey")
        private String matchKey;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("matchValue")
        private String matchValue;

        private GlobalRules(Builder builder) {
            this.limitMode = builder.limitMode;
            this.limitType = builder.limitType;
            this.limitValue = builder.limitValue;
            this.matchKey = builder.matchKey;
            this.matchType = builder.matchType;
            this.matchValue = builder.matchValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalRules create() {
            return builder().build();
        }

        /**
         * @return limitMode
         */
        public String getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return limitValue
         */
        public Integer getLimitValue() {
            return this.limitValue;
        }

        /**
         * @return matchKey
         */
        public String getMatchKey() {
            return this.matchKey;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return matchValue
         */
        public String getMatchValue() {
            return this.matchValue;
        }

        public static final class Builder {
            private String limitMode; 
            private String limitType; 
            private Integer limitValue; 
            private String matchKey; 
            private String matchType; 
            private String matchValue; 

            private Builder() {
            } 

            private Builder(GlobalRules model) {
                this.limitMode = model.limitMode;
                this.limitType = model.limitType;
                this.limitValue = model.limitValue;
                this.matchKey = model.matchKey;
                this.matchType = model.matchType;
                this.matchValue = model.matchValue;
            } 

            /**
             * limitMode.
             */
            public Builder limitMode(String limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * limitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * limitValue.
             */
            public Builder limitValue(Integer limitValue) {
                this.limitValue = limitValue;
                return this;
            }

            /**
             * matchKey.
             */
            public Builder matchKey(String matchKey) {
                this.matchKey = matchKey;
                return this;
            }

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * matchValue.
             */
            public Builder matchValue(String matchValue) {
                this.matchValue = matchValue;
                return this;
            }

            public GlobalRules build() {
                return new GlobalRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limitMode")
        private String limitMode;

        @com.aliyun.core.annotation.NameInMap("limitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("limitValue")
        private Integer limitValue;

        @com.aliyun.core.annotation.NameInMap("matchKey")
        private String matchKey;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("matchValue")
        private String matchValue;

        private Rules(Builder builder) {
            this.limitMode = builder.limitMode;
            this.limitType = builder.limitType;
            this.limitValue = builder.limitValue;
            this.matchKey = builder.matchKey;
            this.matchType = builder.matchType;
            this.matchValue = builder.matchValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return limitMode
         */
        public String getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return limitValue
         */
        public Integer getLimitValue() {
            return this.limitValue;
        }

        /**
         * @return matchKey
         */
        public String getMatchKey() {
            return this.matchKey;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return matchValue
         */
        public String getMatchValue() {
            return this.matchValue;
        }

        public static final class Builder {
            private String limitMode; 
            private String limitType; 
            private Integer limitValue; 
            private String matchKey; 
            private String matchType; 
            private String matchValue; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.limitMode = model.limitMode;
                this.limitType = model.limitType;
                this.limitValue = model.limitValue;
                this.matchKey = model.matchKey;
                this.matchType = model.matchType;
                this.matchValue = model.matchValue;
            } 

            /**
             * limitMode.
             */
            public Builder limitMode(String limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * limitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * limitValue.
             */
            public Builder limitValue(Integer limitValue) {
                this.limitValue = limitValue;
                return this;
            }

            /**
             * matchKey.
             */
            public Builder matchKey(String matchKey) {
                this.matchKey = matchKey;
                return this;
            }

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * matchValue.
             */
            public Builder matchValue(String matchValue) {
                this.matchValue = matchValue;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiDeployConfig} extends {@link TeaModel}
     *
     * <p>HttpApiDeployConfig</p>
     */
    public static class AiTokenRateLimitConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableGlobalRules")
        private Boolean enableGlobalRules;

        @com.aliyun.core.annotation.NameInMap("globalRules")
        private java.util.List<GlobalRules> globalRules;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List<Rules> rules;

        private AiTokenRateLimitConfig(Builder builder) {
            this.enableGlobalRules = builder.enableGlobalRules;
            this.globalRules = builder.globalRules;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiTokenRateLimitConfig create() {
            return builder().build();
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
        public java.util.List<GlobalRules> getGlobalRules() {
            return this.globalRules;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Boolean enableGlobalRules; 
            private java.util.List<GlobalRules> globalRules; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(AiTokenRateLimitConfig model) {
                this.enableGlobalRules = model.enableGlobalRules;
                this.globalRules = model.globalRules;
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
            public Builder globalRules(java.util.List<GlobalRules> globalRules) {
                this.globalRules = globalRules;
                return this;
            }

            /**
             * rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public AiTokenRateLimitConfig build() {
                return new AiTokenRateLimitConfig(this);
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

        @com.aliyun.core.annotation.NameInMap("aiSecurityGuardConfig")
        private AiSecurityGuardConfig aiSecurityGuardConfig;

        @com.aliyun.core.annotation.NameInMap("aiTokenRateLimitConfig")
        private AiTokenRateLimitConfig aiTokenRateLimitConfig;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PolicyConfigs(Builder builder) {
            this.aiFallbackConfig = builder.aiFallbackConfig;
            this.aiSecurityGuardConfig = builder.aiSecurityGuardConfig;
            this.aiTokenRateLimitConfig = builder.aiTokenRateLimitConfig;
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
         * @return aiSecurityGuardConfig
         */
        public AiSecurityGuardConfig getAiSecurityGuardConfig() {
            return this.aiSecurityGuardConfig;
        }

        /**
         * @return aiTokenRateLimitConfig
         */
        public AiTokenRateLimitConfig getAiTokenRateLimitConfig() {
            return this.aiTokenRateLimitConfig;
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
            private AiSecurityGuardConfig aiSecurityGuardConfig; 
            private AiTokenRateLimitConfig aiTokenRateLimitConfig; 
            private Boolean enable; 
            private String type; 

            private Builder() {
            } 

            private Builder(PolicyConfigs model) {
                this.aiFallbackConfig = model.aiFallbackConfig;
                this.aiSecurityGuardConfig = model.aiSecurityGuardConfig;
                this.aiTokenRateLimitConfig = model.aiTokenRateLimitConfig;
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
             * aiSecurityGuardConfig.
             */
            public Builder aiSecurityGuardConfig(AiSecurityGuardConfig aiSecurityGuardConfig) {
                this.aiSecurityGuardConfig = aiSecurityGuardConfig;
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
        @com.aliyun.core.annotation.NameInMap("intentCode")
        private String intentCode;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelNamePattern")
        private String modelNamePattern;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Long weight;

        private ServiceConfigs(Builder builder) {
            this.intentCode = builder.intentCode;
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
         * @return intentCode
         */
        public String getIntentCode() {
            return this.intentCode;
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
            private String intentCode; 
            private String modelName; 
            private String modelNamePattern; 
            private String serviceId; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.intentCode = model.intentCode;
                this.modelName = model.modelName;
                this.modelNamePattern = model.modelNamePattern;
                this.serviceId = model.serviceId;
                this.weight = model.weight;
            } 

            /**
             * intentCode.
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
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
