// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Logstash} extends {@link TeaModel}
 *
 * <p>Logstash</p>
 */
public class Logstash extends TeaModel {
    @NameInMap("config")
    private java.util.Map < String, String > config;

    @NameInMap("createdAt")
    private String createdAt;

    @NameInMap("dataNode")
    private Boolean dataNode;

    @NameInMap("description")
    private String description;

    @NameInMap("endTime")
    private Long endTime;

    @NameInMap("endpointList")
    private java.util.List < EndpointList> endpointList;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("networkConfig")
    private NetworkConfig networkConfig;

    @NameInMap("nodeAmount")
    private Long nodeAmount;

    @NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @NameInMap("paymentType")
    private String paymentType;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @NameInMap("status")
    private String status;

    @NameInMap("tags")
    private java.util.List < Tags> tags;

    @NameInMap("updatedAt")
    private String updatedAt;

    @NameInMap("version")
    private String version;

    @NameInMap("zoneCount")
    private Long zoneCount;

    @NameInMap("zoneInfos")
    private java.util.List < ZoneInfos> zoneInfos;

    private Logstash(Builder builder) {
        this.config = builder.config;
        this.createdAt = builder.createdAt;
        this.dataNode = builder.dataNode;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.endpointList = builder.endpointList;
        this.instanceId = builder.instanceId;
        this.networkConfig = builder.networkConfig;
        this.nodeAmount = builder.nodeAmount;
        this.nodeSpec = builder.nodeSpec;
        this.paymentType = builder.paymentType;
        this.protocol = builder.protocol;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.updatedAt = builder.updatedAt;
        this.version = builder.version;
        this.zoneCount = builder.zoneCount;
        this.zoneInfos = builder.zoneInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Logstash create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public java.util.Map < String, String > getConfig() {
        return this.config;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return dataNode
     */
    public Boolean getDataNode() {
        return this.dataNode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return endpointList
     */
    public java.util.List < EndpointList> getEndpointList() {
        return this.endpointList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @return nodeAmount
     */
    public Long getNodeAmount() {
        return this.nodeAmount;
    }

    /**
     * @return nodeSpec
     */
    public NodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return zoneCount
     */
    public Long getZoneCount() {
        return this.zoneCount;
    }

    /**
     * @return zoneInfos
     */
    public java.util.List < ZoneInfos> getZoneInfos() {
        return this.zoneInfos;
    }

    public static final class Builder {
        private java.util.Map < String, String > config; 
        private String createdAt; 
        private Boolean dataNode; 
        private String description; 
        private Long endTime; 
        private java.util.List < EndpointList> endpointList; 
        private String instanceId; 
        private NetworkConfig networkConfig; 
        private Long nodeAmount; 
        private NodeSpec nodeSpec; 
        private String paymentType; 
        private String protocol; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List < Tags> tags; 
        private String updatedAt; 
        private String version; 
        private Long zoneCount; 
        private java.util.List < ZoneInfos> zoneInfos; 

        /**
         * Config
         */
        public Builder config(java.util.Map < String, String > config) {
            this.config = config;
            return this;
        }

        /**
         * CreatedAt
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * DataNode
         */
        public Builder dataNode(Boolean dataNode) {
            this.dataNode = dataNode;
            return this;
        }

        /**
         * Description
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EndTime
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * EndpointList
         */
        public Builder endpointList(java.util.List < EndpointList> endpointList) {
            this.endpointList = endpointList;
            return this;
        }

        /**
         * InstanceId
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkConfig
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * NodeAmount
         */
        public Builder nodeAmount(Long nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * NodeSpec
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * PaymentType
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Protocol
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * ResourceGroupId
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Status
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tags
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * UpdatedAt
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Version
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * ZoneCount
         */
        public Builder zoneCount(Long zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }

        /**
         * ZoneInfos
         */
        public Builder zoneInfos(java.util.List < ZoneInfos> zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }

        public Logstash build() {
            return new Logstash(this);
        } 

    } 

    public static class EndpointList extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("port")
        private Long port;

        @NameInMap("zoneId")
        private String zoneId;

        private EndpointList(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointList create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String host; 
            private Long port; 
            private String zoneId; 

            /**
             * Host
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * ZoneId
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public EndpointList build() {
                return new EndpointList(this);
            } 

        } 

    }
    public static class NetworkConfig extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vsArea")
        private String vsArea;

        @NameInMap("vswitchId")
        private String vswitchId;

        private NetworkConfig(Builder builder) {
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vsArea = builder.vsArea;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vsArea
         */
        public String getVsArea() {
            return this.vsArea;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String type; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 

            /**
             * Type
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VpcId
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VsArea
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * VswitchId
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    public static class NodeSpec extends TeaModel {
        @NameInMap("disk")
        private Long disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSpec create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public Long getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Long disk; 
            private String diskType; 
            private String spec; 

            /**
             * Disk
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * DiskType
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Spec
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public NodeSpec build() {
                return new NodeSpec(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("tagKey")
        private String tagKey;

        @NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ZoneInfos extends TeaModel {
        @NameInMap("status")
        private String status;

        @NameInMap("zoneId")
        private String zoneId;

        private ZoneInfos(Builder builder) {
            this.status = builder.status;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneInfos create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String status; 
            private String zoneId; 

            /**
             * Status
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ZoneId
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneInfos build() {
                return new ZoneInfos(this);
            } 

        } 

    }
}
