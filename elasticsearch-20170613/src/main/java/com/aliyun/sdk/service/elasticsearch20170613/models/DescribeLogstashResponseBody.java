// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogstashResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogstashResponseBody</p>
 */
public class DescribeLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeLogstashResponseBody build() {
            return new DescribeLogstashResponseBody(this);
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
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * zoneId.
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
    public static class EndpointList extends TeaModel {
        @NameInMap("host")
        private String host;

        @NameInMap("port")
        private String port;

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

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * zoneId.
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vsArea.
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
    public static class NodeSpec extends TeaModel {
        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
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

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
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
    public static class Result extends TeaModel {
        @NameInMap("ExtendConfigs")
        private java.util.List < java.util.Map<String, ?>> extendConfigs;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("ZoneInfos")
        private java.util.List < ZoneInfos> zoneInfos;

        @NameInMap("config")
        private java.util.Map < String, ? > config;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("description")
        private String description;

        @NameInMap("endpointList")
        private java.util.List < EndpointList> endpointList;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        @NameInMap("nodeAmount")
        private Integer nodeAmount;

        @NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @NameInMap("paymentType")
        private String paymentType;

        @NameInMap("status")
        private String status;

        @NameInMap("updatedAt")
        private String updatedAt;

        @NameInMap("version")
        private String version;

        @NameInMap("vpcInstanceId")
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
        public java.util.List < java.util.Map<String, ?>> getExtendConfigs() {
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return zoneInfos
         */
        public java.util.List < ZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

        /**
         * @return config
         */
        public java.util.Map < String, ? > getConfig() {
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
            private java.util.List < java.util.Map<String, ?>> extendConfigs; 
            private String resourceGroupId; 
            private java.util.List < Tags> tags; 
            private java.util.List < ZoneInfos> zoneInfos; 
            private java.util.Map < String, ? > config; 
            private String createdAt; 
            private String description; 
            private java.util.List < EndpointList> endpointList; 
            private String instanceId; 
            private NetworkConfig networkConfig; 
            private Integer nodeAmount; 
            private NodeSpec nodeSpec; 
            private String paymentType; 
            private String status; 
            private String updatedAt; 
            private String version; 
            private String vpcInstanceId; 

            /**
             * ExtendConfigs.
             */
            public Builder extendConfigs(java.util.List < java.util.Map<String, ?>> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * ZoneInfos.
             */
            public Builder zoneInfos(java.util.List < ZoneInfos> zoneInfos) {
                this.zoneInfos = zoneInfos;
                return this;
            }

            /**
             * config.
             */
            public Builder config(java.util.Map < String, ? > config) {
                this.config = config;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * endpointList.
             */
            public Builder endpointList(java.util.List < EndpointList> endpointList) {
                this.endpointList = endpointList;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * networkConfig.
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            /**
             * nodeAmount.
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * nodeSpec.
             */
            public Builder nodeSpec(NodeSpec nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
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
             * vpcInstanceId.
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
