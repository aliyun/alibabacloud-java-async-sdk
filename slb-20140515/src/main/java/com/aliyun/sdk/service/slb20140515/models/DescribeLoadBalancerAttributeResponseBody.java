// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("Address")
    private String address;

    @NameInMap("AddressIPVersion")
    private String addressIPVersion;

    @NameInMap("AddressType")
    private String addressType;

    @NameInMap("AutoReleaseTime")
    private Long autoReleaseTime;

    @NameInMap("BackendServers")
    private BackendServers backendServers;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimeStamp")
    private Long createTimeStamp;

    @NameInMap("DeleteProtection")
    private String deleteProtection;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @NameInMap("ListenerPorts")
    private ListenerPorts listenerPorts;

    @NameInMap("ListenerPortsAndProtocal")
    private ListenerPortsAndProtocal listenerPortsAndProtocal;

    @NameInMap("ListenerPortsAndProtocol")
    private ListenerPortsAndProtocol listenerPortsAndProtocol;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @NameInMap("LoadBalancerSpec")
    private String loadBalancerSpec;

    @NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @NameInMap("MasterZoneId")
    private String masterZoneId;

    @NameInMap("ModificationProtectionReason")
    private String modificationProtectionReason;

    @NameInMap("ModificationProtectionStatus")
    private String modificationProtectionStatus;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RegionIdAlias")
    private String regionIdAlias;

    @NameInMap("RenewalCycUnit")
    private String renewalCycUnit;

    @NameInMap("RenewalDuration")
    private Integer renewalDuration;

    @NameInMap("RenewalStatus")
    private String renewalStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SlaveZoneId")
    private String slaveZoneId;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeLoadBalancerAttributeResponseBody(Builder builder) {
        this.address = builder.address;
        this.addressIPVersion = builder.addressIPVersion;
        this.addressType = builder.addressType;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.backendServers = builder.backendServers;
        this.bandwidth = builder.bandwidth;
        this.createTime = builder.createTime;
        this.createTimeStamp = builder.createTimeStamp;
        this.deleteProtection = builder.deleteProtection;
        this.endTime = builder.endTime;
        this.endTimeStamp = builder.endTimeStamp;
        this.internetChargeType = builder.internetChargeType;
        this.listenerPorts = builder.listenerPorts;
        this.listenerPortsAndProtocal = builder.listenerPortsAndProtocal;
        this.listenerPortsAndProtocol = builder.listenerPortsAndProtocol;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.masterZoneId = builder.masterZoneId;
        this.modificationProtectionReason = builder.modificationProtectionReason;
        this.modificationProtectionStatus = builder.modificationProtectionStatus;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.regionIdAlias = builder.regionIdAlias;
        this.renewalCycUnit = builder.renewalCycUnit;
        this.renewalDuration = builder.renewalDuration;
        this.renewalStatus = builder.renewalStatus;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveZoneId = builder.slaveZoneId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return addressIPVersion
     */
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return autoReleaseTime
     */
    public Long getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return backendServers
     */
    public BackendServers getBackendServers() {
        return this.backendServers;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    /**
     * @return deleteProtection
     */
    public String getDeleteProtection() {
        return this.deleteProtection;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return listenerPorts
     */
    public ListenerPorts getListenerPorts() {
        return this.listenerPorts;
    }

    /**
     * @return listenerPortsAndProtocal
     */
    public ListenerPortsAndProtocal getListenerPortsAndProtocal() {
        return this.listenerPortsAndProtocal;
    }

    /**
     * @return listenerPortsAndProtocol
     */
    public ListenerPortsAndProtocol getListenerPortsAndProtocol() {
        return this.listenerPortsAndProtocol;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    /**
     * @return masterZoneId
     */
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    /**
     * @return modificationProtectionReason
     */
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    /**
     * @return modificationProtectionStatus
     */
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionIdAlias
     */
    public String getRegionIdAlias() {
        return this.regionIdAlias;
    }

    /**
     * @return renewalCycUnit
     */
    public String getRenewalCycUnit() {
        return this.renewalCycUnit;
    }

    /**
     * @return renewalDuration
     */
    public Integer getRenewalDuration() {
        return this.renewalDuration;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return slaveZoneId
     */
    public String getSlaveZoneId() {
        return this.slaveZoneId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String address; 
        private String addressIPVersion; 
        private String addressType; 
        private Long autoReleaseTime; 
        private BackendServers backendServers; 
        private Integer bandwidth; 
        private String createTime; 
        private Long createTimeStamp; 
        private String deleteProtection; 
        private String endTime; 
        private Long endTimeStamp; 
        private String internetChargeType; 
        private ListenerPorts listenerPorts; 
        private ListenerPortsAndProtocal listenerPortsAndProtocal; 
        private ListenerPortsAndProtocol listenerPortsAndProtocol; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String loadBalancerStatus; 
        private String masterZoneId; 
        private String modificationProtectionReason; 
        private String modificationProtectionStatus; 
        private String networkType; 
        private String payType; 
        private String regionId; 
        private String regionIdAlias; 
        private String renewalCycUnit; 
        private Integer renewalDuration; 
        private String renewalStatus; 
        private String requestId; 
        private String resourceGroupId; 
        private String slaveZoneId; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * AddressIPVersion.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * AutoReleaseTime.
         */
        public Builder autoReleaseTime(Long autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * BackendServers.
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateTimeStamp.
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * DeleteProtection.
         */
        public Builder deleteProtection(String deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * EndTimeStamp.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * ListenerPorts.
         */
        public Builder listenerPorts(ListenerPorts listenerPorts) {
            this.listenerPorts = listenerPorts;
            return this;
        }

        /**
         * ListenerPortsAndProtocal.
         */
        public Builder listenerPortsAndProtocal(ListenerPortsAndProtocal listenerPortsAndProtocal) {
            this.listenerPortsAndProtocal = listenerPortsAndProtocal;
            return this;
        }

        /**
         * ListenerPortsAndProtocol.
         */
        public Builder listenerPortsAndProtocol(ListenerPortsAndProtocol listenerPortsAndProtocol) {
            this.listenerPortsAndProtocol = listenerPortsAndProtocol;
            return this;
        }

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * LoadBalancerName.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * LoadBalancerSpec.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * LoadBalancerStatus.
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * MasterZoneId.
         */
        public Builder masterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * ModificationProtectionReason.
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * ModificationProtectionStatus.
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RegionIdAlias.
         */
        public Builder regionIdAlias(String regionIdAlias) {
            this.regionIdAlias = regionIdAlias;
            return this;
        }

        /**
         * RenewalCycUnit.
         */
        public Builder renewalCycUnit(String renewalCycUnit) {
            this.renewalCycUnit = renewalCycUnit;
            return this;
        }

        /**
         * RenewalDuration.
         */
        public Builder renewalDuration(Integer renewalDuration) {
            this.renewalDuration = renewalDuration;
            return this;
        }

        /**
         * RenewalStatus.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SlaveZoneId.
         */
        public Builder slaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeLoadBalancerAttributeResponseBody build() {
            return new DescribeLoadBalancerAttributeResponseBody(this);
        } 

    } 

    public static class BackendServer extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Integer weight;

        private BackendServer(Builder builder) {
            this.description = builder.description;
            this.serverId = builder.serverId;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServer create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String description; 
            private String serverId; 
            private String type; 
            private Integer weight; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public BackendServer build() {
                return new BackendServer(this);
            } 

        } 

    }
    public static class BackendServers extends TeaModel {
        @NameInMap("BackendServer")
        private java.util.List < BackendServer> backendServer;

        private BackendServers(Builder builder) {
            this.backendServer = builder.backendServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return backendServer
         */
        public java.util.List < BackendServer> getBackendServer() {
            return this.backendServer;
        }

        public static final class Builder {
            private java.util.List < BackendServer> backendServer; 

            /**
             * BackendServer.
             */
            public Builder backendServer(java.util.List < BackendServer> backendServer) {
                this.backendServer = backendServer;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
    public static class ListenerPorts extends TeaModel {
        @NameInMap("ListenerPort")
        private java.util.List < Integer > listenerPort;

        private ListenerPorts(Builder builder) {
            this.listenerPort = builder.listenerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPorts create() {
            return builder().build();
        }

        /**
         * @return listenerPort
         */
        public java.util.List < Integer > getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private java.util.List < Integer > listenerPort; 

            /**
             * ListenerPort.
             */
            public Builder listenerPort(java.util.List < Integer > listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public ListenerPorts build() {
                return new ListenerPorts(this);
            } 

        } 

    }
    public static class ListenerPortAndProtocal extends TeaModel {
        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocal")
        private String listenerProtocal;

        private ListenerPortAndProtocal(Builder builder) {
            this.listenerPort = builder.listenerPort;
            this.listenerProtocal = builder.listenerProtocal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortAndProtocal create() {
            return builder().build();
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocal
         */
        public String getListenerProtocal() {
            return this.listenerProtocal;
        }

        public static final class Builder {
            private Integer listenerPort; 
            private String listenerProtocal; 

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * ListenerProtocal.
             */
            public Builder listenerProtocal(String listenerProtocal) {
                this.listenerProtocal = listenerProtocal;
                return this;
            }

            public ListenerPortAndProtocal build() {
                return new ListenerPortAndProtocal(this);
            } 

        } 

    }
    public static class ListenerPortsAndProtocal extends TeaModel {
        @NameInMap("ListenerPortAndProtocal")
        private java.util.List < ListenerPortAndProtocal> listenerPortAndProtocal;

        private ListenerPortsAndProtocal(Builder builder) {
            this.listenerPortAndProtocal = builder.listenerPortAndProtocal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortsAndProtocal create() {
            return builder().build();
        }

        /**
         * @return listenerPortAndProtocal
         */
        public java.util.List < ListenerPortAndProtocal> getListenerPortAndProtocal() {
            return this.listenerPortAndProtocal;
        }

        public static final class Builder {
            private java.util.List < ListenerPortAndProtocal> listenerPortAndProtocal; 

            /**
             * ListenerPortAndProtocal.
             */
            public Builder listenerPortAndProtocal(java.util.List < ListenerPortAndProtocal> listenerPortAndProtocal) {
                this.listenerPortAndProtocal = listenerPortAndProtocal;
                return this;
            }

            public ListenerPortsAndProtocal build() {
                return new ListenerPortsAndProtocal(this);
            } 

        } 

    }
    public static class ListenerPortAndProtocol extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ForwardPort")
        private Integer forwardPort;

        @NameInMap("ListenerForward")
        private String listenerForward;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        private ListenerPortAndProtocol(Builder builder) {
            this.description = builder.description;
            this.forwardPort = builder.forwardPort;
            this.listenerForward = builder.listenerForward;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortAndProtocol create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return forwardPort
         */
        public Integer getForwardPort() {
            return this.forwardPort;
        }

        /**
         * @return listenerForward
         */
        public String getListenerForward() {
            return this.listenerForward;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public static final class Builder {
            private String description; 
            private Integer forwardPort; 
            private String listenerForward; 
            private Integer listenerPort; 
            private String listenerProtocol; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ForwardPort.
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * ListenerForward.
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * ListenerProtocol.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            public ListenerPortAndProtocol build() {
                return new ListenerPortAndProtocol(this);
            } 

        } 

    }
    public static class ListenerPortsAndProtocol extends TeaModel {
        @NameInMap("ListenerPortAndProtocol")
        private java.util.List < ListenerPortAndProtocol> listenerPortAndProtocol;

        private ListenerPortsAndProtocol(Builder builder) {
            this.listenerPortAndProtocol = builder.listenerPortAndProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenerPortsAndProtocol create() {
            return builder().build();
        }

        /**
         * @return listenerPortAndProtocol
         */
        public java.util.List < ListenerPortAndProtocol> getListenerPortAndProtocol() {
            return this.listenerPortAndProtocol;
        }

        public static final class Builder {
            private java.util.List < ListenerPortAndProtocol> listenerPortAndProtocol; 

            /**
             * ListenerPortAndProtocol.
             */
            public Builder listenerPortAndProtocol(java.util.List < ListenerPortAndProtocol> listenerPortAndProtocol) {
                this.listenerPortAndProtocol = listenerPortAndProtocol;
                return this;
            }

            public ListenerPortsAndProtocol build() {
                return new ListenerPortsAndProtocol(this);
            } 

        } 

    }
}
