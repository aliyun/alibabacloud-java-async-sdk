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
 * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
 *
 * <p>HttpApiPublishRevisionInfo</p>
 */
public class HttpApiPublishRevisionInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backendScene")
    private String backendScene;

    @com.aliyun.core.annotation.NameInMap("backendType")
    private String backendType;

    @com.aliyun.core.annotation.NameInMap("cloudProductConfig")
    private CloudProductConfig cloudProductConfig;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("customDomains")
    private java.util.List<HttpApiDomainInfo> customDomains;

    @com.aliyun.core.annotation.NameInMap("dnsConfigs")
    private java.util.List<DnsConfigs> dnsConfigs;

    @com.aliyun.core.annotation.NameInMap("environmentInfo")
    private EnvironmentInfo environmentInfo;

    @com.aliyun.core.annotation.NameInMap("isCurrentVersion")
    private Boolean isCurrentVersion;

    @com.aliyun.core.annotation.NameInMap("operations")
    private java.util.List<HttpApiOperationInfo> operations;

    @com.aliyun.core.annotation.NameInMap("revisionId")
    private String revisionId;

    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<ServiceConfigs> serviceConfigs;

    @com.aliyun.core.annotation.NameInMap("subDomains")
    private java.util.List<HttpApiDomainInfo> subDomains;

    @com.aliyun.core.annotation.NameInMap("vipConfigs")
    private java.util.List<VipConfigs> vipConfigs;

    private HttpApiPublishRevisionInfo(Builder builder) {
        this.backendScene = builder.backendScene;
        this.backendType = builder.backendType;
        this.cloudProductConfig = builder.cloudProductConfig;
        this.createTimestamp = builder.createTimestamp;
        this.customDomains = builder.customDomains;
        this.dnsConfigs = builder.dnsConfigs;
        this.environmentInfo = builder.environmentInfo;
        this.isCurrentVersion = builder.isCurrentVersion;
        this.operations = builder.operations;
        this.revisionId = builder.revisionId;
        this.serviceConfigs = builder.serviceConfigs;
        this.subDomains = builder.subDomains;
        this.vipConfigs = builder.vipConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiPublishRevisionInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return customDomains
     */
    public java.util.List<HttpApiDomainInfo> getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return dnsConfigs
     */
    public java.util.List<DnsConfigs> getDnsConfigs() {
        return this.dnsConfigs;
    }

    /**
     * @return environmentInfo
     */
    public EnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    /**
     * @return isCurrentVersion
     */
    public Boolean getIsCurrentVersion() {
        return this.isCurrentVersion;
    }

    /**
     * @return operations
     */
    public java.util.List<HttpApiOperationInfo> getOperations() {
        return this.operations;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
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
    public java.util.List<HttpApiDomainInfo> getSubDomains() {
        return this.subDomains;
    }

    /**
     * @return vipConfigs
     */
    public java.util.List<VipConfigs> getVipConfigs() {
        return this.vipConfigs;
    }

    public static final class Builder {
        private String backendScene; 
        private String backendType; 
        private CloudProductConfig cloudProductConfig; 
        private Long createTimestamp; 
        private java.util.List<HttpApiDomainInfo> customDomains; 
        private java.util.List<DnsConfigs> dnsConfigs; 
        private EnvironmentInfo environmentInfo; 
        private Boolean isCurrentVersion; 
        private java.util.List<HttpApiOperationInfo> operations; 
        private String revisionId; 
        private java.util.List<ServiceConfigs> serviceConfigs; 
        private java.util.List<HttpApiDomainInfo> subDomains; 
        private java.util.List<VipConfigs> vipConfigs; 

        private Builder() {
        } 

        private Builder(HttpApiPublishRevisionInfo model) {
            this.backendScene = model.backendScene;
            this.backendType = model.backendType;
            this.cloudProductConfig = model.cloudProductConfig;
            this.createTimestamp = model.createTimestamp;
            this.customDomains = model.customDomains;
            this.dnsConfigs = model.dnsConfigs;
            this.environmentInfo = model.environmentInfo;
            this.isCurrentVersion = model.isCurrentVersion;
            this.operations = model.operations;
            this.revisionId = model.revisionId;
            this.serviceConfigs = model.serviceConfigs;
            this.subDomains = model.subDomains;
            this.vipConfigs = model.vipConfigs;
        } 

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
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * customDomains.
         */
        public Builder customDomains(java.util.List<HttpApiDomainInfo> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * dnsConfigs.
         */
        public Builder dnsConfigs(java.util.List<DnsConfigs> dnsConfigs) {
            this.dnsConfigs = dnsConfigs;
            return this;
        }

        /**
         * environmentInfo.
         */
        public Builder environmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }

        /**
         * isCurrentVersion.
         */
        public Builder isCurrentVersion(Boolean isCurrentVersion) {
            this.isCurrentVersion = isCurrentVersion;
            return this;
        }

        /**
         * operations.
         */
        public Builder operations(java.util.List<HttpApiOperationInfo> operations) {
            this.operations = operations;
            return this;
        }

        /**
         * revisionId.
         */
        public Builder revisionId(String revisionId) {
            this.revisionId = revisionId;
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
        public Builder subDomains(java.util.List<HttpApiDomainInfo> subDomains) {
            this.subDomains = subDomains;
            return this;
        }

        /**
         * vipConfigs.
         */
        public Builder vipConfigs(java.util.List<VipConfigs> vipConfigs) {
            this.vipConfigs = vipConfigs;
            return this;
        }

        public HttpApiPublishRevisionInfo build() {
            return new HttpApiPublishRevisionInfo(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class ContainerServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

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
        private String weight;

        private ContainerServiceConfigs(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
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
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String gatewayServiceId; 
            private HttpApiBackendMatchConditions match; 
            private String name; 
            private String namespace; 
            private Integer port; 
            private String protocol; 
            private String weight; 

            private Builder() {
            } 

            private Builder(ContainerServiceConfigs model) {
                this.gatewayServiceId = model.gatewayServiceId;
                this.match = model.match;
                this.name = model.name;
                this.namespace = model.namespace;
                this.port = model.port;
                this.protocol = model.protocol;
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
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public ContainerServiceConfigs build() {
                return new ContainerServiceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class FunctionConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("qualifier")
        private String qualifier;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private FunctionConfigs(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
            this.match = builder.match;
            this.name = builder.name;
            this.qualifier = builder.qualifier;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionConfigs create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return qualifier
         */
        public String getQualifier() {
            return this.qualifier;
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
            private String name; 
            private String qualifier; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(FunctionConfigs model) {
                this.gatewayServiceId = model.gatewayServiceId;
                this.match = model.match;
                this.name = model.name;
                this.qualifier = model.qualifier;
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
             * qualifier.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
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
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class MseNacosConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayServiceId")
        private String gatewayServiceId;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private MseNacosConfigs(Builder builder) {
            this.gatewayServiceId = builder.gatewayServiceId;
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
         * @return gatewayServiceId
         */
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
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
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String gatewayServiceId; 
            private String groupName; 
            private HttpApiBackendMatchConditions match; 
            private String name; 
            private String namespace; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(MseNacosConfigs model) {
                this.gatewayServiceId = model.gatewayServiceId;
                this.groupName = model.groupName;
                this.match = model.match;
                this.name = model.name;
                this.namespace = model.namespace;
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
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public MseNacosConfigs build() {
                return new MseNacosConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class CloudProductConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cloudProductType")
        private String cloudProductType;

        @com.aliyun.core.annotation.NameInMap("containerServiceConfigs")
        private java.util.List<ContainerServiceConfigs> containerServiceConfigs;

        @com.aliyun.core.annotation.NameInMap("functionConfigs")
        private java.util.List<FunctionConfigs> functionConfigs;

        @com.aliyun.core.annotation.NameInMap("mseNacosConfigs")
        private java.util.List<MseNacosConfigs> mseNacosConfigs;

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
        public java.util.List<ContainerServiceConfigs> getContainerServiceConfigs() {
            return this.containerServiceConfigs;
        }

        /**
         * @return functionConfigs
         */
        public java.util.List<FunctionConfigs> getFunctionConfigs() {
            return this.functionConfigs;
        }

        /**
         * @return mseNacosConfigs
         */
        public java.util.List<MseNacosConfigs> getMseNacosConfigs() {
            return this.mseNacosConfigs;
        }

        public static final class Builder {
            private String cloudProductType; 
            private java.util.List<ContainerServiceConfigs> containerServiceConfigs; 
            private java.util.List<FunctionConfigs> functionConfigs; 
            private java.util.List<MseNacosConfigs> mseNacosConfigs; 

            private Builder() {
            } 

            private Builder(CloudProductConfig model) {
                this.cloudProductType = model.cloudProductType;
                this.containerServiceConfigs = model.containerServiceConfigs;
                this.functionConfigs = model.functionConfigs;
                this.mseNacosConfigs = model.mseNacosConfigs;
            } 

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
            public Builder containerServiceConfigs(java.util.List<ContainerServiceConfigs> containerServiceConfigs) {
                this.containerServiceConfigs = containerServiceConfigs;
                return this;
            }

            /**
             * functionConfigs.
             */
            public Builder functionConfigs(java.util.List<FunctionConfigs> functionConfigs) {
                this.functionConfigs = functionConfigs;
                return this;
            }

            /**
             * mseNacosConfigs.
             */
            public Builder mseNacosConfigs(java.util.List<MseNacosConfigs> mseNacosConfigs) {
                this.mseNacosConfigs = mseNacosConfigs;
                return this;
            }

            public CloudProductConfig build() {
                return new CloudProductConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class DnsConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dnsList")
        private java.util.List<String> dnsList;

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
        public java.util.List<String> getDnsList() {
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
            private java.util.List<String> dnsList; 
            private HttpApiBackendMatchConditions match; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(DnsConfigs model) {
                this.dnsList = model.dnsList;
                this.match = model.match;
                this.weight = model.weight;
            } 

            /**
             * dnsList.
             */
            public Builder dnsList(java.util.List<String> dnsList) {
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
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class GatewayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private GatewayInfo(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInfo create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String gatewayId; 
            private String name; 

            private Builder() {
            } 

            private Builder(GatewayInfo model) {
                this.gatewayId = model.gatewayId;
                this.name = model.name;
            } 

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GatewayInfo build() {
                return new GatewayInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class EnvironmentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private EnvironmentInfo(Builder builder) {
            this.alias = builder.alias;
            this.environmentId = builder.environmentId;
            this.gatewayInfo = builder.gatewayInfo;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentInfo create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String alias; 
            private String environmentId; 
            private GatewayInfo gatewayInfo; 
            private String name; 

            private Builder() {
            } 

            private Builder(EnvironmentInfo model) {
                this.alias = model.alias;
                this.environmentId = model.environmentId;
                this.gatewayInfo = model.gatewayInfo;
                this.name = model.name;
            } 

            /**
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
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
             * gatewayInfo.
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EnvironmentInfo build() {
                return new EnvironmentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
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

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.gatewayServiceId = model.gatewayServiceId;
                this.match = model.match;
                this.port = model.port;
                this.protocol = model.protocol;
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
    /**
     * 
     * {@link HttpApiPublishRevisionInfo} extends {@link TeaModel}
     *
     * <p>HttpApiPublishRevisionInfo</p>
     */
    public static class VipConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoints")
        private java.util.List<String> endpoints;

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
        public java.util.List<String> getEndpoints() {
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
            private java.util.List<String> endpoints; 
            private HttpApiBackendMatchConditions match; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(VipConfigs model) {
                this.endpoints = model.endpoints;
                this.match = model.match;
                this.weight = model.weight;
            } 

            /**
             * endpoints.
             */
            public Builder endpoints(java.util.List<String> endpoints) {
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
}
