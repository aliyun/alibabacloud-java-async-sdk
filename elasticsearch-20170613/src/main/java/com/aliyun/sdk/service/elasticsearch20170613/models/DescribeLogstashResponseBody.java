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
 * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogstashResponseBody</p>
 */
public class DescribeLogstashResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeLogstashResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogstashResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeLogstashResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Detailed information about the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>C9334241-4837-46C2-B24B-9BDC517318DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of the instance.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeLogstashResponseBody build() {
            return new DescribeLogstashResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogstashResponseBody</p>
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
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The information about the zones.</p>
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
     * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogstashResponseBody</p>
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
             * <p>The zone ID of the new instance.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The configuration of cluster extension parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
    /**
     * 
     * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogstashResponseBody</p>
     */
    public static class EndpointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

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
        public String getPort() {
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
            private String port; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(EndpointList model) {
                this.host = model.host;
                this.port = model.port;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The tags added to the ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.16.**.**</code></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>9600</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
     * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogstashResponseBody</p>
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
             * <p>The ID of the vSwitch to which the instance is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The zone where the cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16k1dvzxtmagcva****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values: Currently, only Virtual Private Cloud (VPC) are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-*</p>
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * vswitchId.
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
     * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogstashResponseBody</p>
     */
    public static class NodeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
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
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
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
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskType; 
            private String spec; 

            private Builder() {
            } 

            private Builder(NodeSpec model) {
                this.disk = model.disk;
                this.diskEncryption = model.diskEncryption;
                this.diskType = model.diskType;
                this.spec = model.spec;
            } 

            /**
             * <p>Whether to use disk encryption:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The disk type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * <p>The network configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The disk size of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.sn1ne.large</p>
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
     * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogstashResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtendConfigs")
        private java.util.List<java.util.Map<String, ?>> extendConfigs;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("ZoneInfos")
        private java.util.List<ZoneInfos> zoneInfos;

        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map<String, ?> config;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endpointList")
        private java.util.List<EndpointList> endpointList;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        @com.aliyun.core.annotation.NameInMap("nodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("vpcInstanceId")
        private String vpcInstanceId;

        private Result(Builder builder) {
            this.extendConfigs = builder.extendConfigs;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.zoneInfos = builder.zoneInfos;
            this.config = builder.config;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.endpointList = builder.endpointList;
            this.instanceId = builder.instanceId;
            this.networkConfig = builder.networkConfig;
            this.nodeAmount = builder.nodeAmount;
            this.nodeSpec = builder.nodeSpec;
            this.paymentType = builder.paymentType;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
            this.version = builder.version;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return extendConfigs
         */
        public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return zoneInfos
         */
        public java.util.List<ZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

        /**
         * @return config
         */
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
        public Integer getNodeAmount() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> extendConfigs; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 
            private java.util.List<ZoneInfos> zoneInfos; 
            private java.util.Map<String, ?> config; 
            private String createdAt; 
            private String description; 
            private java.util.List<EndpointList> endpointList; 
            private String instanceId; 
            private NetworkConfig networkConfig; 
            private Integer nodeAmount; 
            private NodeSpec nodeSpec; 
            private String paymentType; 
            private String status; 
            private String updatedAt; 
            private String version; 
            private String vpcInstanceId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.extendConfigs = model.extendConfigs;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.zoneInfos = model.zoneInfos;
                this.config = model.config;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.endpointList = model.endpointList;
                this.instanceId = model.instanceId;
                this.networkConfig = model.networkConfig;
                this.nodeAmount = model.nodeAmount;
                this.nodeSpec = model.nodeSpec;
                this.paymentType = model.paymentType;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.version = model.version;
                this.vpcInstanceId = model.vpcInstanceId;
            } 

            /**
             * <p>The configuration information of the node.</p>
             */
            public Builder extendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * <p>The number of data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzvowej3i****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The key of the tag.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The status of the zone. Valid values:</p>
             * <ul>
             * <li>ISOLATION: offline</li>
             * <li>NORMAL</li>
             * </ul>
             */
            public Builder zoneInfos(java.util.List<ZoneInfos> zoneInfos) {
                this.zoneInfos = zoneInfos;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li>prepaid: subscription</li>
             * <li>postpaid: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;slowlog.threshold.warn&quot;: &quot;2s&quot;,&quot;slowlog.threshold.info&quot;: &quot;1s&quot;,&quot;slowlog.threshold.debug&quot;: &quot;500ms&quot;,&quot;slowlog.threshold.trace&quot;: &quot;100ms&quot; }</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The state of the instance. Four states are supported:</p>
             * <ul>
             * <li>Normal: active</li>
             * <li>Active: activating</li>
             * <li>Freeze: inactive</li>
             * <li>Invalid: invalid</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-02-06T14:12:03.672Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>ls-cn-abc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the zone where the node resides.</p>
             */
            public Builder endpointList(java.util.List<EndpointList> endpointList) {
                this.endpointList = endpointList;
                return this;
            }

            /**
             * <p>The access information of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>ls-cn-abc</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The specifications of the node.</p>
             */
            public Builder nodeSpec(NodeSpec nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>prepaid</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the elastic container instances belong.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The edition of the dedicated KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-06T14:22:36.850Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>7.4.0_with_X-Pack</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The time when the instance was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16k1dvzxtmagcva****</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
