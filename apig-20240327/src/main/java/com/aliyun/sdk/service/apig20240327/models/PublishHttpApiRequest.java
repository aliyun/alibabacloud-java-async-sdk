// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishHttpApiRequest} extends {@link RequestModel}
 *
 * <p>PublishHttpApiRequest</p>
 */
public class PublishHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowOverwrite")
    private Boolean allowOverwrite;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environment")
    private Environment environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("revisionId")
    private String revisionId;

    private PublishHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.allowOverwrite = builder.allowOverwrite;
        this.description = builder.description;
        this.environment = builder.environment;
        this.revisionId = builder.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return allowOverwrite
     */
    public Boolean getAllowOverwrite() {
        return this.allowOverwrite;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environment
     */
    public Environment getEnvironment() {
        return this.environment;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    public static final class Builder extends Request.Builder<PublishHttpApiRequest, Builder> {
        private String httpApiId; 
        private Boolean allowOverwrite; 
        private String description; 
        private Environment environment; 
        private String revisionId; 

        private Builder() {
            super();
        } 

        private Builder(PublishHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.allowOverwrite = request.allowOverwrite;
            this.description = request.description;
            this.environment = request.environment;
            this.revisionId = request.revisionId;
        } 

        /**
         * httpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * allowOverwrite.
         */
        public Builder allowOverwrite(Boolean allowOverwrite) {
            this.putBodyParameter("allowOverwrite", allowOverwrite);
            this.allowOverwrite = allowOverwrite;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * environment.
         */
        public Builder environment(Environment environment) {
            this.putBodyParameter("environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * revisionId.
         */
        public Builder revisionId(String revisionId) {
            this.putBodyParameter("revisionId", revisionId);
            this.revisionId = revisionId;
            return this;
        }

        @Override
        public PublishHttpApiRequest build() {
            return new PublishHttpApiRequest(this);
        } 

    } 

    public static class ContainerServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private ContainerServiceConfigs(Builder builder) {
            this.match = builder.match;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
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
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private HttpApiBackendMatchConditions match; 
            private String name; 
            private String namespace; 
            private Integer port; 
            private String protocol; 
            private Integer weight; 

            /**
             * match.
             */
            public Builder match(HttpApiBackendMatchConditions match) {
                this.match = match;
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
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
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
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ContainerServiceConfigs build() {
                return new ContainerServiceConfigs(this);
            } 

        } 

    }
    public static class FunctionConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("quanlifer")
        private String quanlifer;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private FunctionConfigs(Builder builder) {
            this.match = builder.match;
            this.name = builder.name;
            this.quanlifer = builder.quanlifer;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionConfigs create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quanlifer
         */
        public String getQuanlifer() {
            return this.quanlifer;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private HttpApiBackendMatchConditions match; 
            private String name; 
            private String quanlifer; 
            private Integer weight; 

            /**
             * match.
             */
            public Builder match(HttpApiBackendMatchConditions match) {
                this.match = match;
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
             * quanlifer.
             */
            public Builder quanlifer(String quanlifer) {
                this.quanlifer = quanlifer;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public FunctionConfigs build() {
                return new FunctionConfigs(this);
            } 

        } 

    }
    public static class MseNacosConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("weight")
        private String weight;

        private MseNacosConfigs(Builder builder) {
            this.groupName = builder.groupName;
            this.match = builder.match;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MseNacosConfigs create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String groupName; 
            private HttpApiBackendMatchConditions match; 
            private String name; 
            private String namespace; 
            private String weight; 

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public MseNacosConfigs build() {
                return new MseNacosConfigs(this);
            } 

        } 

    }
    public static class CloudProductConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cloudProductType")
        private String cloudProductType;

        @com.aliyun.core.annotation.NameInMap("containerServiceConfigs")
        private java.util.List < ContainerServiceConfigs> containerServiceConfigs;

        @com.aliyun.core.annotation.NameInMap("functionConfigs")
        private java.util.List < FunctionConfigs> functionConfigs;

        @com.aliyun.core.annotation.NameInMap("mseNacosConfigs")
        private java.util.List < MseNacosConfigs> mseNacosConfigs;

        private CloudProductConfig(Builder builder) {
            this.cloudProductType = builder.cloudProductType;
            this.containerServiceConfigs = builder.containerServiceConfigs;
            this.functionConfigs = builder.functionConfigs;
            this.mseNacosConfigs = builder.mseNacosConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudProductConfig create() {
            return builder().build();
        }

        /**
         * @return cloudProductType
         */
        public String getCloudProductType() {
            return this.cloudProductType;
        }

        /**
         * @return containerServiceConfigs
         */
        public java.util.List < ContainerServiceConfigs> getContainerServiceConfigs() {
            return this.containerServiceConfigs;
        }

        /**
         * @return functionConfigs
         */
        public java.util.List < FunctionConfigs> getFunctionConfigs() {
            return this.functionConfigs;
        }

        /**
         * @return mseNacosConfigs
         */
        public java.util.List < MseNacosConfigs> getMseNacosConfigs() {
            return this.mseNacosConfigs;
        }

        public static final class Builder {
            private String cloudProductType; 
            private java.util.List < ContainerServiceConfigs> containerServiceConfigs; 
            private java.util.List < FunctionConfigs> functionConfigs; 
            private java.util.List < MseNacosConfigs> mseNacosConfigs; 

            /**
             * cloudProductType.
             */
            public Builder cloudProductType(String cloudProductType) {
                this.cloudProductType = cloudProductType;
                return this;
            }

            /**
             * containerServiceConfigs.
             */
            public Builder containerServiceConfigs(java.util.List < ContainerServiceConfigs> containerServiceConfigs) {
                this.containerServiceConfigs = containerServiceConfigs;
                return this;
            }

            /**
             * functionConfigs.
             */
            public Builder functionConfigs(java.util.List < FunctionConfigs> functionConfigs) {
                this.functionConfigs = functionConfigs;
                return this;
            }

            /**
             * mseNacosConfigs.
             */
            public Builder mseNacosConfigs(java.util.List < MseNacosConfigs> mseNacosConfigs) {
                this.mseNacosConfigs = mseNacosConfigs;
                return this;
            }

            public CloudProductConfig build() {
                return new CloudProductConfig(this);
            } 

        } 

    }
    public static class DnsConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dnsList")
        private java.util.List < String > dnsList;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private DnsConfigs(Builder builder) {
            this.dnsList = builder.dnsList;
            this.match = builder.match;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConfigs create() {
            return builder().build();
        }

        /**
         * @return dnsList
         */
        public java.util.List < String > getDnsList() {
            return this.dnsList;
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private java.util.List < String > dnsList; 
            private HttpApiBackendMatchConditions match; 
            private Integer weight; 

            /**
             * dnsList.
             */
            public Builder dnsList(java.util.List < String > dnsList) {
                this.dnsList = dnsList;
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
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public DnsConfigs build() {
                return new DnsConfigs(this);
            } 

        } 

    }
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private ServiceConfigs(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
            this.match = builder.match;
            this.port = builder.port;
            this.protocol = builder.protocol;
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
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String gatewayServiceId; 
            private HttpApiBackendMatchConditions match; 
            private Integer port; 
            private String protocol; 
            private String version; 
            private Integer weight; 

            /**
             * gatewayServiceId.
             */
            public Builder gatewayServiceId(String gatewayServiceId) {
                this.gatewayServiceId = gatewayServiceId;
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
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
    public static class VipConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoints")
        private java.util.List < String > endpoints;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private VipConfigs(Builder builder) {
            this.endpoints = builder.endpoints;
            this.match = builder.match;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VipConfigs create() {
            return builder().build();
        }

        /**
         * @return endpoints
         */
        public java.util.List < String > getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private java.util.List < String > endpoints; 
            private HttpApiBackendMatchConditions match; 
            private Integer weight; 

            /**
             * endpoints.
             */
            public Builder endpoints(java.util.List < String > endpoints) {
                this.endpoints = endpoints;
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
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VipConfigs build() {
                return new VipConfigs(this);
            } 

        } 

    }
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendScene")
        private String backendScene;

        @com.aliyun.core.annotation.NameInMap("backendType")
        private String backendType;

        @com.aliyun.core.annotation.NameInMap("cloudProductConfig")
        private CloudProductConfig cloudProductConfig;

        @com.aliyun.core.annotation.NameInMap("customDomainIds")
        private java.util.List < String > customDomainIds;

        @com.aliyun.core.annotation.NameInMap("dnsConfigs")
        private java.util.List < DnsConfigs> dnsConfigs;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("serviceConfigs")
        private java.util.List < ServiceConfigs> serviceConfigs;

        @com.aliyun.core.annotation.NameInMap("vipConfigs")
        private java.util.List < VipConfigs> vipConfigs;

        private Environment(Builder builder) {
            this.backendScene = builder.backendScene;
            this.backendType = builder.backendType;
            this.cloudProductConfig = builder.cloudProductConfig;
            this.customDomainIds = builder.customDomainIds;
            this.dnsConfigs = builder.dnsConfigs;
            this.environmentId = builder.environmentId;
            this.serviceConfigs = builder.serviceConfigs;
            this.vipConfigs = builder.vipConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environment create() {
            return builder().build();
        }

        /**
         * @return backendScene
         */
        public String getBackendScene() {
            return this.backendScene;
        }

        /**
         * @return backendType
         */
        public String getBackendType() {
            return this.backendType;
        }

        /**
         * @return cloudProductConfig
         */
        public CloudProductConfig getCloudProductConfig() {
            return this.cloudProductConfig;
        }

        /**
         * @return customDomainIds
         */
        public java.util.List < String > getCustomDomainIds() {
            return this.customDomainIds;
        }

        /**
         * @return dnsConfigs
         */
        public java.util.List < DnsConfigs> getDnsConfigs() {
            return this.dnsConfigs;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return serviceConfigs
         */
        public java.util.List < ServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        /**
         * @return vipConfigs
         */
        public java.util.List < VipConfigs> getVipConfigs() {
            return this.vipConfigs;
        }

        public static final class Builder {
            private String backendScene; 
            private String backendType; 
            private CloudProductConfig cloudProductConfig; 
            private java.util.List < String > customDomainIds; 
            private java.util.List < DnsConfigs> dnsConfigs; 
            private String environmentId; 
            private java.util.List < ServiceConfigs> serviceConfigs; 
            private java.util.List < VipConfigs> vipConfigs; 

            /**
             * backendScene.
             */
            public Builder backendScene(String backendScene) {
                this.backendScene = backendScene;
                return this;
            }

            /**
             * backendType.
             */
            public Builder backendType(String backendType) {
                this.backendType = backendType;
                return this;
            }

            /**
             * cloudProductConfig.
             */
            public Builder cloudProductConfig(CloudProductConfig cloudProductConfig) {
                this.cloudProductConfig = cloudProductConfig;
                return this;
            }

            /**
             * customDomainIds.
             */
            public Builder customDomainIds(java.util.List < String > customDomainIds) {
                this.customDomainIds = customDomainIds;
                return this;
            }

            /**
             * dnsConfigs.
             */
            public Builder dnsConfigs(java.util.List < DnsConfigs> dnsConfigs) {
                this.dnsConfigs = dnsConfigs;
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
             * serviceConfigs.
             */
            public Builder serviceConfigs(java.util.List < ServiceConfigs> serviceConfigs) {
                this.serviceConfigs = serviceConfigs;
                return this;
            }

            /**
             * vipConfigs.
             */
            public Builder vipConfigs(java.util.List < VipConfigs> vipConfigs) {
                this.vipConfigs = vipConfigs;
                return this;
            }

            public Environment build() {
                return new Environment(this);
            } 

        } 

    }
}
