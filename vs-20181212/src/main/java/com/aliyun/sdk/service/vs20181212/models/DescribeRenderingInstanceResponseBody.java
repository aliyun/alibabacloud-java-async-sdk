// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRenderingInstanceResponseBody</p>
 */
public class DescribeRenderingInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalIngresses")
    private java.util.List<AdditionalIngresses> additionalIngresses;

    @com.aliyun.core.annotation.NameInMap("ConfigInfo")
    private ConfigInfo configInfo;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("EgressIp")
    private String egressIp;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("InternalIp")
    private String internalIp;

    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.NameInMap("PortMappings")
    private java.util.List<PortMappings> portMappings;

    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.NameInMap("RenderingSpec")
    private String renderingSpec;

    @com.aliyun.core.annotation.NameInMap("RenderingStatus")
    private RenderingStatus renderingStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceAttributes")
    private ResourceAttributes resourceAttributes;

    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Integer storageSize;

    @com.aliyun.core.annotation.NameInMap("SystemInfo")
    private SystemInfo systemInfo;

    private DescribeRenderingInstanceResponseBody(Builder builder) {
        this.additionalIngresses = builder.additionalIngresses;
        this.configInfo = builder.configInfo;
        this.creationTime = builder.creationTime;
        this.egressIp = builder.egressIp;
        this.hostname = builder.hostname;
        this.internalIp = builder.internalIp;
        this.isp = builder.isp;
        this.portMappings = builder.portMappings;
        this.renderingInstanceId = builder.renderingInstanceId;
        this.renderingSpec = builder.renderingSpec;
        this.renderingStatus = builder.renderingStatus;
        this.requestId = builder.requestId;
        this.resourceAttributes = builder.resourceAttributes;
        this.storageSize = builder.storageSize;
        this.systemInfo = builder.systemInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalIngresses
     */
    public java.util.List<AdditionalIngresses> getAdditionalIngresses() {
        return this.additionalIngresses;
    }

    /**
     * @return configInfo
     */
    public ConfigInfo getConfigInfo() {
        return this.configInfo;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return egressIp
     */
    public String getEgressIp() {
        return this.egressIp;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return internalIp
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return portMappings
     */
    public java.util.List<PortMappings> getPortMappings() {
        return this.portMappings;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return renderingSpec
     */
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    /**
     * @return renderingStatus
     */
    public RenderingStatus getRenderingStatus() {
        return this.renderingStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceAttributes
     */
    public ResourceAttributes getResourceAttributes() {
        return this.resourceAttributes;
    }

    /**
     * @return storageSize
     */
    public Integer getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return systemInfo
     */
    public SystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    public static final class Builder {
        private java.util.List<AdditionalIngresses> additionalIngresses; 
        private ConfigInfo configInfo; 
        private String creationTime; 
        private String egressIp; 
        private String hostname; 
        private String internalIp; 
        private String isp; 
        private java.util.List<PortMappings> portMappings; 
        private String renderingInstanceId; 
        private String renderingSpec; 
        private RenderingStatus renderingStatus; 
        private String requestId; 
        private ResourceAttributes resourceAttributes; 
        private Integer storageSize; 
        private SystemInfo systemInfo; 

        private Builder() {
        } 

        private Builder(DescribeRenderingInstanceResponseBody model) {
            this.additionalIngresses = model.additionalIngresses;
            this.configInfo = model.configInfo;
            this.creationTime = model.creationTime;
            this.egressIp = model.egressIp;
            this.hostname = model.hostname;
            this.internalIp = model.internalIp;
            this.isp = model.isp;
            this.portMappings = model.portMappings;
            this.renderingInstanceId = model.renderingInstanceId;
            this.renderingSpec = model.renderingSpec;
            this.renderingStatus = model.renderingStatus;
            this.requestId = model.requestId;
            this.resourceAttributes = model.resourceAttributes;
            this.storageSize = model.storageSize;
            this.systemInfo = model.systemInfo;
        } 

        /**
         * AdditionalIngresses.
         */
        public Builder additionalIngresses(java.util.List<AdditionalIngresses> additionalIngresses) {
            this.additionalIngresses = additionalIngresses;
            return this;
        }

        /**
         * ConfigInfo.
         */
        public Builder configInfo(ConfigInfo configInfo) {
            this.configInfo = configInfo;
            return this;
        }

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * EgressIp.
         */
        public Builder egressIp(String egressIp) {
            this.egressIp = egressIp;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * InternalIp.
         */
        public Builder internalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.isp = isp;
            return this;
        }

        /**
         * PortMappings.
         */
        public Builder portMappings(java.util.List<PortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * RenderingSpec.
         */
        public Builder renderingSpec(String renderingSpec) {
            this.renderingSpec = renderingSpec;
            return this;
        }

        /**
         * RenderingStatus.
         */
        public Builder renderingStatus(RenderingStatus renderingStatus) {
            this.renderingStatus = renderingStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceAttributes.
         */
        public Builder resourceAttributes(ResourceAttributes resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * SystemInfo.
         */
        public Builder systemInfo(SystemInfo systemInfo) {
            this.systemInfo = systemInfo;
            return this;
        }

        public DescribeRenderingInstanceResponseBody build() {
            return new DescribeRenderingInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class AdditionalIngressesPortMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        private AdditionalIngressesPortMappings(Builder builder) {
            this.externalPort = builder.externalPort;
            this.internalPort = builder.internalPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalIngressesPortMappings create() {
            return builder().build();
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return internalPort
         */
        public String getInternalPort() {
            return this.internalPort;
        }

        public static final class Builder {
            private String externalPort; 
            private String internalPort; 

            private Builder() {
            } 

            private Builder(AdditionalIngressesPortMappings model) {
                this.externalPort = model.externalPort;
                this.internalPort = model.internalPort;
            } 

            /**
             * ExternalPort.
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * InternalPort.
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            public AdditionalIngressesPortMappings build() {
                return new AdditionalIngressesPortMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class AdditionalIngresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("PortMappings")
        private java.util.List<AdditionalIngressesPortMappings> portMappings;

        private AdditionalIngresses(Builder builder) {
            this.hostname = builder.hostname;
            this.isp = builder.isp;
            this.portMappings = builder.portMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalIngresses create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return portMappings
         */
        public java.util.List<AdditionalIngressesPortMappings> getPortMappings() {
            return this.portMappings;
        }

        public static final class Builder {
            private String hostname; 
            private String isp; 
            private java.util.List<AdditionalIngressesPortMappings> portMappings; 

            private Builder() {
            } 

            private Builder(AdditionalIngresses model) {
                this.hostname = model.hostname;
                this.isp = model.isp;
                this.portMappings = model.portMappings;
            } 

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * PortMappings.
             */
            public Builder portMappings(java.util.List<AdditionalIngressesPortMappings> portMappings) {
                this.portMappings = portMappings;
                return this;
            }

            public AdditionalIngresses build() {
                return new AdditionalIngresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private Attributes(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private Configuration(Builder builder) {
            this.attributes = builder.attributes;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private java.util.List<Attributes> attributes; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.attributes = model.attributes;
                this.moduleName = model.moduleName;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthStatus")
        private String bandwidthStatus;

        @com.aliyun.core.annotation.NameInMap("MaxEgressBandwidth")
        private Integer maxEgressBandwidth;

        @com.aliyun.core.annotation.NameInMap("MaxIngressBandwidth")
        private Integer maxIngressBandwidth;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private NetworkConfig(Builder builder) {
            this.bandwidthStatus = builder.bandwidthStatus;
            this.maxEgressBandwidth = builder.maxEgressBandwidth;
            this.maxIngressBandwidth = builder.maxIngressBandwidth;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return bandwidthStatus
         */
        public String getBandwidthStatus() {
            return this.bandwidthStatus;
        }

        /**
         * @return maxEgressBandwidth
         */
        public Integer getMaxEgressBandwidth() {
            return this.maxEgressBandwidth;
        }

        /**
         * @return maxIngressBandwidth
         */
        public Integer getMaxIngressBandwidth() {
            return this.maxIngressBandwidth;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String bandwidthStatus; 
            private Integer maxEgressBandwidth; 
            private Integer maxIngressBandwidth; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.bandwidthStatus = model.bandwidthStatus;
                this.maxEgressBandwidth = model.maxEgressBandwidth;
                this.maxIngressBandwidth = model.maxIngressBandwidth;
                this.updateTime = model.updateTime;
            } 

            /**
             * BandwidthStatus.
             */
            public Builder bandwidthStatus(String bandwidthStatus) {
                this.bandwidthStatus = bandwidthStatus;
                return this;
            }

            /**
             * MaxEgressBandwidth.
             */
            public Builder maxEgressBandwidth(Integer maxEgressBandwidth) {
                this.maxEgressBandwidth = maxEgressBandwidth;
                return this;
            }

            /**
             * MaxIngressBandwidth.
             */
            public Builder maxIngressBandwidth(Integer maxIngressBandwidth) {
                this.maxIngressBandwidth = maxIngressBandwidth;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class ConfigInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configuration")
        private java.util.List<Configuration> configuration;

        @com.aliyun.core.annotation.NameInMap("NetworkConfig")
        private NetworkConfig networkConfig;

        private ConfigInfo(Builder builder) {
            this.configuration = builder.configuration;
            this.networkConfig = builder.networkConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigInfo create() {
            return builder().build();
        }

        /**
         * @return configuration
         */
        public java.util.List<Configuration> getConfiguration() {
            return this.configuration;
        }

        /**
         * @return networkConfig
         */
        public NetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public static final class Builder {
            private java.util.List<Configuration> configuration; 
            private NetworkConfig networkConfig; 

            private Builder() {
            } 

            private Builder(ConfigInfo model) {
                this.configuration = model.configuration;
                this.networkConfig = model.networkConfig;
            } 

            /**
             * Configuration.
             */
            public Builder configuration(java.util.List<Configuration> configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * NetworkConfig.
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            public ConfigInfo build() {
                return new ConfigInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class PortMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        private PortMappings(Builder builder) {
            this.externalPort = builder.externalPort;
            this.internalPort = builder.internalPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortMappings create() {
            return builder().build();
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return internalPort
         */
        public String getInternalPort() {
            return this.internalPort;
        }

        public static final class Builder {
            private String externalPort; 
            private String internalPort; 

            private Builder() {
            } 

            private Builder(PortMappings model) {
                this.externalPort = model.externalPort;
                this.internalPort = model.internalPort;
            } 

            /**
             * ExternalPort.
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * InternalPort.
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            public PortMappings build() {
                return new PortMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class RenderingStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LatestAction")
        private String latestAction;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RenderingStatus(Builder builder) {
            this.description = builder.description;
            this.latestAction = builder.latestAction;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderingStatus create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return latestAction
         */
        public String getLatestAction() {
            return this.latestAction;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String latestAction; 
            private String status; 

            private Builder() {
            } 

            private Builder(RenderingStatus model) {
                this.description = model.description;
                this.latestAction = model.latestAction;
                this.status = model.status;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LatestAction.
             */
            public Builder latestAction(String latestAction) {
                this.latestAction = latestAction;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RenderingStatus build() {
                return new RenderingStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class ResourceAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdgeMediaService")
        private String edgeMediaService;

        @com.aliyun.core.annotation.NameInMap("InAccess")
        private String inAccess;

        @com.aliyun.core.annotation.NameInMap("OutAccess")
        private String outAccess;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private ResourceAttributes(Builder builder) {
            this.edgeMediaService = builder.edgeMediaService;
            this.inAccess = builder.inAccess;
            this.outAccess = builder.outAccess;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceAttributes create() {
            return builder().build();
        }

        /**
         * @return edgeMediaService
         */
        public String getEdgeMediaService() {
            return this.edgeMediaService;
        }

        /**
         * @return inAccess
         */
        public String getInAccess() {
            return this.inAccess;
        }

        /**
         * @return outAccess
         */
        public String getOutAccess() {
            return this.outAccess;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String edgeMediaService; 
            private String inAccess; 
            private String outAccess; 
            private String zone; 

            private Builder() {
            } 

            private Builder(ResourceAttributes model) {
                this.edgeMediaService = model.edgeMediaService;
                this.inAccess = model.inAccess;
                this.outAccess = model.outAccess;
                this.zone = model.zone;
            } 

            /**
             * EdgeMediaService.
             */
            public Builder edgeMediaService(String edgeMediaService) {
                this.edgeMediaService = edgeMediaService;
                return this;
            }

            /**
             * InAccess.
             */
            public Builder inAccess(String inAccess) {
                this.inAccess = inAccess;
                return this;
            }

            /**
             * OutAccess.
             */
            public Builder outAccess(String outAccess) {
                this.outAccess = outAccess;
                return this;
            }

            /**
             * Zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public ResourceAttributes build() {
                return new ResourceAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRenderingInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceResponseBody</p>
     */
    public static class SystemInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Frequency")
        private Integer frequency;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        private SystemInfo(Builder builder) {
            this.frequency = builder.frequency;
            this.resolution = builder.resolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemInfo create() {
            return builder().build();
        }

        /**
         * @return frequency
         */
        public Integer getFrequency() {
            return this.frequency;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        public static final class Builder {
            private Integer frequency; 
            private String resolution; 

            private Builder() {
            } 

            private Builder(SystemInfo model) {
                this.frequency = model.frequency;
                this.resolution = model.resolution;
            } 

            /**
             * Frequency.
             */
            public Builder frequency(Integer frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            public SystemInfo build() {
                return new SystemInfo(this);
            } 

        } 

    }
}
