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
 * {@link GetGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayResponseBody</p>
 */
public class GetGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayResponseBody create() {
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

        private Builder(GetGatewayResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0F138FFC-6E2B-56C1-9BAB-A67462E339D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayResponseBody build() {
            return new GetGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class Environments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Environments(Builder builder) {
            this.alias = builder.alias;
            this.environmentId = builder.environmentId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environments create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String alias; 
            private String environmentId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Environments model) {
                this.alias = model.alias;
                this.environmentId = model.environmentId;
                this.name = model.name;
            } 

            /**
             * <p>The environment alias.</p>
             * 
             * <strong>example:</strong>
             * <p>Default environment</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cp9uhudlht***</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>default-gw-cp9ugg5***</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Environments build() {
                return new Environments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
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
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
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
             * <p>The load balancer IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-xoh3pghr***.cn-hangzhou.nlb.aliyuncs.com</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The IP version of the address. Valid values:</p>
             * <ul>
             * <li>ipv4</li>
             * <li>ipv6</li>
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
             * <p>The load balancer address type. Valid values:</p>
             * <ul>
             * <li>Internet</li>
             * <li>Intranet</li>
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
             * <p>Indicates whether the address is the default ingress address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder gatewayDefault(Boolean gatewayDefault) {
                this.gatewayDefault = gatewayDefault;
                return this;
            }

            /**
             * <p>The load balancer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-xoh3pghru7c***</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The mode in which the load balancer is provided. Valid values:</p>
             * <ul>
             * <li>Managed: Cloud-native API Gateway manages and provides the load balancer.</li>
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
             * <p>The list of listened ports.</p>
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The load balancer status. Valid values:</p>
             * <ul>
             * <li>Ready: The load balancer is available.</li>
             * <li>NotCreate: The load balancer is not associated with the instance.</li>
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
             * <p>The load balancer type. Valid values:</p>
             * <ul>
             * <li>NLB: Network Load Balancer</li>
             * <li>CLB: Classic Load Balancer</li>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class SecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        private SecurityGroup(Builder builder) {
            this.name = builder.name;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String name; 
            private String securityGroupId; 

            private Builder() {
            } 

            private Builder(SecurityGroup model) {
                this.name = model.name;
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * <p>The security group name.</p>
             * 
             * <strong>example:</strong>
             * <p>APIG-sg-gw-cq7ke5ll***</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp16tafq9***</p>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class VSwitch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        private VSwitch(Builder builder) {
            this.name = builder.name;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitch create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String name; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(VSwitch model) {
                this.name = model.name;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The vSwitch name.</p>
             * 
             * <strong>example:</strong>
             * <p>HangzhouVPCvSwitch</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1c7ggkj***</p>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Vpc(Builder builder) {
            this.name = builder.name;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String name; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Vpc model) {
                this.name = model.name;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The VPC name.</p>
             * 
             * <strong>example:</strong>
             * <p>HangzhouVPC</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1llj52lvj6xc***</p>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class ZonesVSwitch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        private ZonesVSwitch(Builder builder) {
            this.name = builder.name;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZonesVSwitch create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String name; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(ZonesVSwitch model) {
                this.name = model.name;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The vSwitch name.</p>
             * 
             * <strong>example:</strong>
             * <p>HangzhouVPCvSwitch</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1c7ggkj***</p>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("vSwitch")
        private ZonesVSwitch vSwitch;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String name; 
            private ZonesVSwitch vSwitch; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.name = model.name;
                this.vSwitch = model.vSwitch;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The zone name.</p>
             * 
             * <strong>example:</strong>
             * <p>HangzhouZoneE</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The vSwitch information.</p>
             */
            public Builder vSwitch(ZonesVSwitch vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
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
     * {@link GetGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("createFrom")
        private String createFrom;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("environments")
        private java.util.List<Environments> environments;

        @com.aliyun.core.annotation.NameInMap("expireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("gatewayType")
        private String gatewayType;

        @com.aliyun.core.annotation.NameInMap("isp")
        private String isp;

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

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createFrom = builder.createFrom;
            this.createTimestamp = builder.createTimestamp;
            this.environments = builder.environments;
            this.expireTimestamp = builder.expireTimestamp;
            this.gatewayId = builder.gatewayId;
            this.gatewayType = builder.gatewayType;
            this.isp = builder.isp;
            this.loadBalancers = builder.loadBalancers;
            this.name = builder.name;
            this.replicas = builder.replicas;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroup = builder.securityGroup;
            this.spec = builder.spec;
            this.status = builder.status;
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

        public static Data create() {
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
         * @return environments
         */
        public java.util.List<Environments> getEnvironments() {
            return this.environments;
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
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
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
            private java.util.List<Environments> environments; 
            private Long expireTimestamp; 
            private String gatewayId; 
            private String gatewayType; 
            private String isp; 
            private java.util.List<LoadBalancers> loadBalancers; 
            private String name; 
            private String replicas; 
            private String resourceGroupId; 
            private SecurityGroup securityGroup; 
            private String spec; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String targetVersion; 
            private Long updateTimestamp; 
            private VSwitch vSwitch; 
            private String version; 
            private Vpc vpc; 
            private java.util.List<Zones> zones; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chargeType = model.chargeType;
                this.createFrom = model.createFrom;
                this.createTimestamp = model.createTimestamp;
                this.environments = model.environments;
                this.expireTimestamp = model.expireTimestamp;
                this.gatewayId = model.gatewayId;
                this.gatewayType = model.gatewayType;
                this.isp = model.isp;
                this.loadBalancers = model.loadBalancers;
                this.name = model.name;
                this.replicas = model.replicas;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroup = model.securityGroup;
                this.spec = model.spec;
                this.status = model.status;
                this.tags = model.tags;
                this.targetVersion = model.targetVersion;
                this.updateTimestamp = model.updateTimestamp;
                this.vSwitch = model.vSwitch;
                this.version = model.version;
                this.vpc = model.vpc;
                this.zones = model.zones;
            } 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>POSTPAY: pay-as-you-go</li>
             * <li>PREPAY: subscription</li>
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
             * <p>The creation source of the instance. Valid values:</p>
             * <ul>
             * <li>Console</li>
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
             * <p>The creation timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The list of environments associated with the instance.</p>
             */
            public Builder environments(java.util.List<Environments> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * <p>The time when the instance expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-cq2vundlhtg***</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>the gateway type, which is categorized into the following two types:</p>
             * <ul>
             * <li>API: indicates an API gateway</li>
             * <li>AI: Indicates an AI gateway</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>API</p>
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The ingress addresses of the instance.</p>
             */
            public Builder loadBalancers(java.util.List<LoadBalancers> loadBalancers) {
                this.loadBalancers = loadBalancers;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>itemcenter-gateway</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node quantity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicas(String replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2s3cvc4jzfxi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The security group of the instance.</p>
             */
            public Builder securityGroup(SecurityGroup securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <p>The instance specification. Valid values:</p>
             * <ul>
             * <li>apigw.small.x1</li>
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
             * <p>The instance state. Valid values:</p>
             * <ul>
             * <li>Running: The instance is running.</li>
             * <li>Creating: The instance is being created.</li>
             * <li>CreateFailed: The instance failed to be created.</li>
             * <li>Upgrading: The instance is being upgraded.</li>
             * <li>UpgradeFailed: The instance failed to be upgraded.</li>
             * <li>Restarting: The instance is being restarted.</li>
             * <li>RestartFailed: The instance failed to be restarted.</li>
             * <li>Deleting: The instance is being released.</li>
             * <li>DeleteFailed: The instance failed to be released.</li>
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
             * <p>The resource tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The destination version of the instance. If the value is inconsistent with the version value, you can upgrade the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.2</p>
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            /**
             * <p>The last update timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>The vSwitch associated with the instance.</p>
             */
            public Builder vSwitch(VSwitch vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            /**
             * <p>The instance version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The VPC associated with the instance.</p>
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * <p>The list of zones associated with the instance.</p>
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
