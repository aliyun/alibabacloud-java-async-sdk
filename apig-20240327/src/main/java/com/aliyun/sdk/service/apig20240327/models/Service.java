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
 * {@link Service} extends {@link TeaModel}
 *
 * <p>Service</p>
 */
public class Service extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addresses")
    private java.util.List<String> addresses;

    @com.aliyun.core.annotation.NameInMap("agentServiceConfig")
    private AgentServiceConfig agentServiceConfig;

    @com.aliyun.core.annotation.NameInMap("aiServiceConfig")
    private AiServiceConfig aiServiceConfig;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("expressType")
    private String expressType;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("groupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("healthCheck")
    private ServiceHealthCheck healthCheck;

    @com.aliyun.core.annotation.NameInMap("healthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.NameInMap("labelDetails")
    private java.util.List<LabelDetail> labelDetails;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("outlierEndpoints")
    private java.util.List<String> outlierEndpoints;

    @com.aliyun.core.annotation.NameInMap("ports")
    private java.util.List<Ports> ports;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("unhealthyEndpoints")
    private java.util.List<String> unhealthyEndpoints;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    @com.aliyun.core.annotation.NameInMap("versions")
    private java.util.List<Versions> versions;

    private Service(Builder builder) {
        this.addresses = builder.addresses;
        this.agentServiceConfig = builder.agentServiceConfig;
        this.aiServiceConfig = builder.aiServiceConfig;
        this.createTimestamp = builder.createTimestamp;
        this.expressType = builder.expressType;
        this.gatewayId = builder.gatewayId;
        this.groupName = builder.groupName;
        this.healthCheck = builder.healthCheck;
        this.healthStatus = builder.healthStatus;
        this.labelDetails = builder.labelDetails;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.outlierEndpoints = builder.outlierEndpoints;
        this.ports = builder.ports;
        this.protocol = builder.protocol;
        this.qualifier = builder.qualifier;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceId = builder.serviceId;
        this.sourceType = builder.sourceType;
        this.unhealthyEndpoints = builder.unhealthyEndpoints;
        this.updateTimestamp = builder.updateTimestamp;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Service create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    /**
     * @return agentServiceConfig
     */
    public AgentServiceConfig getAgentServiceConfig() {
        return this.agentServiceConfig;
    }

    /**
     * @return aiServiceConfig
     */
    public AiServiceConfig getAiServiceConfig() {
        return this.aiServiceConfig;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return expressType
     */
    public String getExpressType() {
        return this.expressType;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return healthCheck
     */
    public ServiceHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return labelDetails
     */
    public java.util.List<LabelDetail> getLabelDetails() {
        return this.labelDetails;
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
     * @return outlierEndpoints
     */
    public java.util.List<String> getOutlierEndpoints() {
        return this.outlierEndpoints;
    }

    /**
     * @return ports
     */
    public java.util.List<Ports> getPorts() {
        return this.ports;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return unhealthyEndpoints
     */
    public java.util.List<String> getUnhealthyEndpoints() {
        return this.unhealthyEndpoints;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /**
     * @return versions
     */
    public java.util.List<Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private java.util.List<String> addresses; 
        private AgentServiceConfig agentServiceConfig; 
        private AiServiceConfig aiServiceConfig; 
        private Long createTimestamp; 
        private String expressType; 
        private String gatewayId; 
        private String groupName; 
        private ServiceHealthCheck healthCheck; 
        private String healthStatus; 
        private java.util.List<LabelDetail> labelDetails; 
        private String name; 
        private String namespace; 
        private java.util.List<String> outlierEndpoints; 
        private java.util.List<Ports> ports; 
        private String protocol; 
        private String qualifier; 
        private String resourceGroupId; 
        private String serviceId; 
        private String sourceType; 
        private java.util.List<String> unhealthyEndpoints; 
        private Long updateTimestamp; 
        private java.util.List<Versions> versions; 

        private Builder() {
        } 

        private Builder(Service model) {
            this.addresses = model.addresses;
            this.agentServiceConfig = model.agentServiceConfig;
            this.aiServiceConfig = model.aiServiceConfig;
            this.createTimestamp = model.createTimestamp;
            this.expressType = model.expressType;
            this.gatewayId = model.gatewayId;
            this.groupName = model.groupName;
            this.healthCheck = model.healthCheck;
            this.healthStatus = model.healthStatus;
            this.labelDetails = model.labelDetails;
            this.name = model.name;
            this.namespace = model.namespace;
            this.outlierEndpoints = model.outlierEndpoints;
            this.ports = model.ports;
            this.protocol = model.protocol;
            this.qualifier = model.qualifier;
            this.resourceGroupId = model.resourceGroupId;
            this.serviceId = model.serviceId;
            this.sourceType = model.sourceType;
            this.unhealthyEndpoints = model.unhealthyEndpoints;
            this.updateTimestamp = model.updateTimestamp;
            this.versions = model.versions;
        } 

        /**
         * addresses.
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * agentServiceConfig.
         */
        public Builder agentServiceConfig(AgentServiceConfig agentServiceConfig) {
            this.agentServiceConfig = agentServiceConfig;
            return this;
        }

        /**
         * aiServiceConfig.
         */
        public Builder aiServiceConfig(AiServiceConfig aiServiceConfig) {
            this.aiServiceConfig = aiServiceConfig;
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
         * expressType.
         */
        public Builder expressType(String expressType) {
            this.expressType = expressType;
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
         * groupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * healthCheck.
         */
        public Builder healthCheck(ServiceHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * healthStatus.
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * labelDetails.
         */
        public Builder labelDetails(java.util.List<LabelDetail> labelDetails) {
            this.labelDetails = labelDetails;
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
         * outlierEndpoints.
         */
        public Builder outlierEndpoints(java.util.List<String> outlierEndpoints) {
            this.outlierEndpoints = outlierEndpoints;
            return this;
        }

        /**
         * ports.
         */
        public Builder ports(java.util.List<Ports> ports) {
            this.ports = ports;
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
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
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
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * unhealthyEndpoints.
         */
        public Builder unhealthyEndpoints(java.util.List<String> unhealthyEndpoints) {
            this.unhealthyEndpoints = unhealthyEndpoints;
            return this;
        }

        /**
         * updateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * versions.
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        public Service build() {
            return new Service(this);
        } 

    } 

    /**
     * 
     * {@link Service} extends {@link TeaModel}
     *
     * <p>Service</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.name = builder.name;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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

        public static final class Builder {
            private String name; 
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.name = model.name;
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    /**
     * 
     * {@link Service} extends {@link TeaModel}
     *
     * <p>Service</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link Service} extends {@link TeaModel}
     *
     * <p>Service</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Versions(Builder builder) {
            this.labels = builder.labels;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Labels> labels; 
            private String name; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.labels = model.labels;
                this.name = model.name;
            } 

            /**
             * labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
