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
 * {@link ListGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewaysResponseBody</p>
 */
public class ListGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewaysResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewaysResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Result of gateway list query.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5B626361-070A-56A7-B127-ADAC8F3655DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewaysResponseBody build() {
            return new ListGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Ports(Builder builder) {
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
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>Port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Protocol:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
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
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class LoadBalancers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("addressIpVersion")
        private String addressIpVersion;

        @com.aliyun.core.annotation.NameInMap("addressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("gatewayDefault")
        private Boolean gatewayDefault;

        @com.aliyun.core.annotation.NameInMap("loadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ports")
        private java.util.List<Ports> ports;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private LoadBalancers(Builder builder) {
            this.address = builder.address;
            this.addressIpVersion = builder.addressIpVersion;
            this.addressType = builder.addressType;
            this.gatewayDefault = builder.gatewayDefault;
            this.loadBalancerId = builder.loadBalancerId;
            this.mode = builder.mode;
            this.ports = builder.ports;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancers create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return addressIpVersion
         */
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return gatewayDefault
         */
        public Boolean getGatewayDefault() {
            return this.gatewayDefault;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return ports
         */
        public java.util.List<Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private String addressIpVersion; 
            private String addressType; 
            private Boolean gatewayDefault; 
            private String loadBalancerId; 
            private String mode; 
            private java.util.List<Ports> ports; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(LoadBalancers model) {
                this.address = model.address;
                this.addressIpVersion = model.addressIpVersion;
                this.addressType = model.addressType;
                this.gatewayDefault = model.gatewayDefault;
                this.loadBalancerId = model.loadBalancerId;
                this.mode = model.mode;
                this.ports = model.ports;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>Load balancer address.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-xoh3pghr***.cn-hangzhou.nlb.aliyuncs.com</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>IP version:</p>
             * <ul>
             * <li>ipv4: IPv4.</li>
             * <li>ipv6: IPv6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder addressIpVersion(String addressIpVersion) {
                this.addressIpVersion = addressIpVersion;
                return this;
            }

            /**
             * <p>Load balancer address type:</p>
             * <ul>
             * <li>Internet: Public network.</li>
             * <li>Intranet: Private network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>Indicates whether this is the default entry address for the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder gatewayDefault(Boolean gatewayDefault) {
                this.gatewayDefault = gatewayDefault;
                return this;
            }

            /**
             * <p>Load balancer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-xqwioje1c91r***</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>Load balancer provision mode for the gateway:</p>
             * <ul>
             * <li>Managed: Managed by the Cloud Native API Gateway.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Managed</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>List of listening ports.</p>
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>Status of the load balancer:</p>
             * <ul>
             * <li>Ready: Available.</li>
             * <li>NotCreate: No associated instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Type of load balancer for the gateway:</p>
             * <ul>
             * <li>NLB: Network Load Balancer.</li>
             * <li>CLB: Classic Load Balancer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NLB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class SecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        private SecurityGroup(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String securityGroupId; 

            private Builder() {
            } 

            private Builder(SecurityGroup model) {
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * <p>The Security Group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class VSwitch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        private VSwitch(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitch create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(VSwitch model) {
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitch build() {
                return new VSwitch(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Vpc(Builder builder) {
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Vpc model) {
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class ZonesVSwitch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        private ZonesVSwitch(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZonesVSwitch create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(ZonesVSwitch model) {
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ZonesVSwitch build() {
                return new ZonesVSwitch(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitch")
        private ZonesVSwitch vSwitch;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.vSwitch = builder.vSwitch;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return vSwitch
         */
        public ZonesVSwitch getVSwitch() {
            return this.vSwitch;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private ZonesVSwitch vSwitch; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.vSwitch = model.vSwitch;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The vSwitch.</p>
             */
            public Builder vSwitch(ZonesVSwitch vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            /**
             * <p>The ID of the current zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-f</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("createFrom")
        private String createFrom;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("expireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("loadBalancers")
        private java.util.List<LoadBalancers> loadBalancers;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("replicas")
        private String replicas;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("securityGroup")
        private SecurityGroup securityGroup;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subDomainInfos")
        private java.util.List<SubDomainInfo> subDomainInfos;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("targetVersion")
        private String targetVersion;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("vSwitch")
        private VSwitch vSwitch;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("vpc")
        private Vpc vpc;

        @com.aliyun.core.annotation.NameInMap("zones")
        private java.util.List<Zones> zones;

        private Items(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createFrom = builder.createFrom;
            this.createTimestamp = builder.createTimestamp;
            this.expireTimestamp = builder.expireTimestamp;
            this.gatewayId = builder.gatewayId;
            this.loadBalancers = builder.loadBalancers;
            this.name = builder.name;
            this.replicas = builder.replicas;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroup = builder.securityGroup;
            this.spec = builder.spec;
            this.status = builder.status;
            this.subDomainInfos = builder.subDomainInfos;
            this.tags = builder.tags;
            this.targetVersion = builder.targetVersion;
            this.updateTimestamp = builder.updateTimestamp;
            this.vSwitch = builder.vSwitch;
            this.version = builder.version;
            this.vpc = builder.vpc;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createFrom
         */
        public String getCreateFrom() {
            return this.createFrom;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return expireTimestamp
         */
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return loadBalancers
         */
        public java.util.List<LoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return replicas
         */
        public String getReplicas() {
            return this.replicas;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroup
         */
        public SecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subDomainInfos
         */
        public java.util.List<SubDomainInfo> getSubDomainInfos() {
            return this.subDomainInfos;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        /**
         * @return vSwitch
         */
        public VSwitch getVSwitch() {
            return this.vSwitch;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        /**
         * @return zones
         */
        public java.util.List<Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String chargeType; 
            private String createFrom; 
            private Long createTimestamp; 
            private Long expireTimestamp; 
            private String gatewayId; 
            private java.util.List<LoadBalancers> loadBalancers; 
            private String name; 
            private String replicas; 
            private String resourceGroupId; 
            private SecurityGroup securityGroup; 
            private String spec; 
            private String status; 
            private java.util.List<SubDomainInfo> subDomainInfos; 
            private java.util.List<Tags> tags; 
            private String targetVersion; 
            private Long updateTimestamp; 
            private VSwitch vSwitch; 
            private String version; 
            private Vpc vpc; 
            private java.util.List<Zones> zones; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.chargeType = model.chargeType;
                this.createFrom = model.createFrom;
                this.createTimestamp = model.createTimestamp;
                this.expireTimestamp = model.expireTimestamp;
                this.gatewayId = model.gatewayId;
                this.loadBalancers = model.loadBalancers;
                this.name = model.name;
                this.replicas = model.replicas;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroup = model.securityGroup;
                this.spec = model.spec;
                this.status = model.status;
                this.subDomainInfos = model.subDomainInfos;
                this.tags = model.tags;
                this.targetVersion = model.targetVersion;
                this.updateTimestamp = model.updateTimestamp;
                this.vSwitch = model.vSwitch;
                this.version = model.version;
                this.vpc = model.vpc;
                this.zones = model.zones;
            } 

            /**
             * <p>Charge type</p>
             * <ul>
             * <li>POSTPAY: Postpaid (pay-as-you-go)</li>
             * <li>PREPAY: Prepaid (subscription)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Source of gateway creation:</p>
             * <ul>
             * <li>Console: Console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Console</p>
             */
            public Builder createFrom(String createFrom) {
                this.createFrom = createFrom;
                return this;
            }

            /**
             * <p>Creation timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Expiration timestamp for prepaid (annual or monthly) subscriptions. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>172086834548</p>
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>Gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-cpv54p5***</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>List of gateway entry addresses.</p>
             */
            public Builder loadBalancers(java.util.List<LoadBalancers> loadBalancers) {
                this.loadBalancers = loadBalancers;
                return this;
            }

            /**
             * <p>Gateway name.</p>
             * 
             * <strong>example:</strong>
             * <p>itemcenter-gateway</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Number of gateway instance nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicas(String replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>Resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-xxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The Security Group.</p>
             */
            public Builder securityGroup(SecurityGroup securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <p>Gateway specification:</p>
             * <ul>
             * <li>apigw.small.x1: Small specification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>apigw.small.x1</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>Gateway status:</p>
             * <ul>
             * <li>Running: Running.</li>
             * <li>Creating: Creating.</li>
             * <li>CreateFailed: Creation failed.</li>
             * <li>Upgrading: Upgrading.</li>
             * <li>UpgradeFailed: Upgrade failed.</li>
             * <li>Restarting: Restarting.</li>
             * <li>RestartFailed: Restart failed.</li>
             * <li>Deleting: Deleting.</li>
             * <li>DeleteFailed: Deletion failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>List of sub domain information</p>
             */
            public Builder subDomainInfos(java.util.List<SubDomainInfo> subDomainInfos) {
                this.subDomainInfos = subDomainInfos;
                return this;
            }

            /**
             * <p>Array of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Target version of the gateway. When it is inconsistent with the current <code>version</code>, an upgrade can be performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.2</p>
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            /**
             * <p>Update timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>The vSwtich.</p>
             */
            public Builder vSwitch(VSwitch vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            /**
             * <p>Gateway version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The VPC.</p>
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * <p>The Zones.</p>
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewaysResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>Gateway list</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
