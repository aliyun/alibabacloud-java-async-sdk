// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayResponseBody build() {
            return new GetGatewayResponseBody(this);
        } 

    } 

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
             * name.
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
        private java.util.List < Ports> ports;

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
        public java.util.List < Ports> getPorts() {
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
            private java.util.List < Ports> ports; 
            private String status; 
            private String type; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * addressIpVersion.
             */
            public Builder addressIpVersion(String addressIpVersion) {
                this.addressIpVersion = addressIpVersion;
                return this;
            }

            /**
             * addressType.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * gatewayDefault.
             */
            public Builder gatewayDefault(Boolean gatewayDefault) {
                this.gatewayDefault = gatewayDefault;
                return this;
            }

            /**
             * loadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ports.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
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
             * type.
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

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * securityGroupId.
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

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * vSwitchId.
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

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * vpcId.
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

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * vSwitchId.
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

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * vSwitch.
             */
            public Builder vSwitch(ZonesVSwitch vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            /**
             * zoneId.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("chargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("createFrom")
        private String createFrom;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("environments")
        private java.util.List < Environments> environments;

        @com.aliyun.core.annotation.NameInMap("expireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("loadBalancers")
        private java.util.List < LoadBalancers> loadBalancers;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("replicas")
        private String replicas;

        @com.aliyun.core.annotation.NameInMap("securityGroup")
        private SecurityGroup securityGroup;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

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
        private java.util.List < Zones> zones;

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createFrom = builder.createFrom;
            this.createTimestamp = builder.createTimestamp;
            this.environments = builder.environments;
            this.expireTimestamp = builder.expireTimestamp;
            this.gatewayId = builder.gatewayId;
            this.loadBalancers = builder.loadBalancers;
            this.name = builder.name;
            this.replicas = builder.replicas;
            this.securityGroup = builder.securityGroup;
            this.spec = builder.spec;
            this.status = builder.status;
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
        public java.util.List < Environments> getEnvironments() {
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
         * @return loadBalancers
         */
        public java.util.List < LoadBalancers> getLoadBalancers() {
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
        public java.util.List < Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String chargeType; 
            private String createFrom; 
            private Long createTimestamp; 
            private java.util.List < Environments> environments; 
            private Long expireTimestamp; 
            private String gatewayId; 
            private java.util.List < LoadBalancers> loadBalancers; 
            private String name; 
            private String replicas; 
            private SecurityGroup securityGroup; 
            private String spec; 
            private String status; 
            private String targetVersion; 
            private Long updateTimestamp; 
            private VSwitch vSwitch; 
            private String version; 
            private Vpc vpc; 
            private java.util.List < Zones> zones; 

            /**
             * chargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * createFrom.
             */
            public Builder createFrom(String createFrom) {
                this.createFrom = createFrom;
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
             * environments.
             */
            public Builder environments(java.util.List < Environments> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * expireTimestamp.
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
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
             * loadBalancers.
             */
            public Builder loadBalancers(java.util.List < LoadBalancers> loadBalancers) {
                this.loadBalancers = loadBalancers;
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
             * replicas.
             */
            public Builder replicas(String replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * securityGroup.
             */
            public Builder securityGroup(SecurityGroup securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
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
             * targetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
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
             * vSwitch.
             */
            public Builder vSwitch(VSwitch vSwitch) {
                this.vSwitch = vSwitch;
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
             * vpc.
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * zones.
             */
            public Builder zones(java.util.List < Zones> zones) {
                this.zones = zones;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
