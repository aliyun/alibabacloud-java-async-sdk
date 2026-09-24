// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link Logstash} extends {@link TeaModel}
 *
 * <p>Logstash</p>
 */
public class Logstash extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, String> config;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("dataNode")
    private Boolean dataNode;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("endpointList")
    private java.util.List<EndpointList> endpointList;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("networkConfig")
    private NetworkConfig networkConfig;

    @com.aliyun.core.annotation.NameInMap("nodeAmount")
    private Long nodeAmount;

    @com.aliyun.core.annotation.NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("zoneCount")
    private Long zoneCount;

    @com.aliyun.core.annotation.NameInMap("zoneInfos")
    private java.util.List<ZoneInfos> zoneInfos;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public java.util.Map<String, String> getConfig() {
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
    public java.util.List<EndpointList> getEndpointList() {
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
    public java.util.List<Tags> getTags() {
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
    public java.util.List<ZoneInfos> getZoneInfos() {
        return this.zoneInfos;
    }

    public static final class Builder {
        private java.util.Map<String, String> config; 
        private String createdAt; 
        private Boolean dataNode; 
        private String description; 
        private Long endTime; 
        private java.util.List<EndpointList> endpointList; 
        private String instanceId; 
        private NetworkConfig networkConfig; 
        private Long nodeAmount; 
        private NodeSpec nodeSpec; 
        private String paymentType; 
        private String protocol; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tags> tags; 
        private String updatedAt; 
        private String version; 
        private Long zoneCount; 
        private java.util.List<ZoneInfos> zoneInfos; 

        private Builder() {
        } 

        private Builder(Logstash model) {
            this.config = model.config;
            this.createdAt = model.createdAt;
            this.dataNode = model.dataNode;
            this.description = model.description;
            this.endTime = model.endTime;
            this.endpointList = model.endpointList;
            this.instanceId = model.instanceId;
            this.networkConfig = model.networkConfig;
            this.nodeAmount = model.nodeAmount;
            this.nodeSpec = model.nodeSpec;
            this.paymentType = model.paymentType;
            this.protocol = model.protocol;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.tags = model.tags;
            this.updatedAt = model.updatedAt;
            this.version = model.version;
            this.zoneCount = model.zoneCount;
            this.zoneInfos = model.zoneInfos;
        } 

        /**
         * <p>The instance configuration.</p>
         */
        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Specifies whether to enable data nodes. This parameter must be set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dataNode(Boolean dataNode) {
            this.dataNode = dataNode;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-abc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The expiration time of the subscription instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4749897600000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The node information.</p>
         */
        public Builder endpointList(java.util.List<EndpointList> endpointList) {
            this.endpointList = endpointList;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-n6w1o5jq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The network configuration.</p>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>The number of nodes in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeAmount(Long nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * <p>The data node configuration.</p>
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>prepaid: subscription</li>
         * <li>postpaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The access protocol of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2h5vbzd****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The zone status. Valid values:</p>
         * <ul>
         * <li>ISOLATION: offline</li>
         * <li>NORMAL: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The instance tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-18T10:10:04.484Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The instance version. Valid values:</p>
         * <ul>
         * <li>6.7.0_with_X-Pack</li>
         * <li>7.4.0_with_X-Pack.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6.7.0_with_X-Pack</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The number of zones for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder zoneCount(Long zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }

        /**
         * <p>The zone information.</p>
         */
        public Builder zoneInfos(java.util.List<ZoneInfos> zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }

        public Logstash build() {
            return new Logstash(this);
        } 

    } 

    /**
     * 
     * {@link Logstash} extends {@link TeaModel}
     *
     * <p>Logstash</p>
     */
    public static class EndpointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("zoneId")
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

            private Builder() {
            } 

            private Builder(EndpointList model) {
                this.host = model.host;
                this.port = model.port;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.xx.xx</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The access port number of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>9200</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
    /**
     * 
     * {@link Logstash} extends {@link TeaModel}
     *
     * <p>Logstash</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vsArea")
        private String vsArea;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
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

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.vsArea = model.vsArea;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The network type. Currently, only Virtual Private Cloud (VPC) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-abc</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-*</p>
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-def</p>
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
    /**
     * 
     * {@link Logstash} extends {@link TeaModel}
     *
     * <p>Logstash</p>
     */
    public static class NodeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disk")
        private Long disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
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

            private Builder() {
            } 

            private Builder(NodeSpec model) {
                this.disk = model.disk;
                this.diskType = model.diskType;
                this.spec = model.spec;
            } 

            /**
             * <p>The disk size of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder disk(Long disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The disk type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>logstash.n4.small</p>
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
    /**
     * 
     * {@link Logstash} extends {@link TeaModel}
     *
     * <p>Logstash</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
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
    /**
     * 
     * {@link Logstash} extends {@link TeaModel}
     *
     * <p>Logstash</p>
     */
    public static class ZoneInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("zoneId")
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

            private Builder() {
            } 

            private Builder(ZoneInfos model) {
                this.status = model.status;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The zone status. Valid values:</p>
             * <ul>
             * <li>ISOLATION: offline</li>
             * <li>NORMAL: Normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
