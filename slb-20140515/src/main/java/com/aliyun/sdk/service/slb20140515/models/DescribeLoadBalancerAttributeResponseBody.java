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

    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

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

    @NameInMap("Tags")
    private Tags tags;

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
        this.instanceChargeType = builder.instanceChargeType;
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
        this.tags = builder.tags;
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
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
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
        private String instanceChargeType; 
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
        private Tags tags; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * The service IP address of the CLB instance.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * The version of the IP address. Valid values: **ipv4** and **ipv6**.
         */
        public Builder addressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }

        /**
         * The address type of the CLB instance.
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * The timestamp generated when the CLB instance is released.
         */
        public Builder autoReleaseTime(Long autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * The backend servers of the CLB instance.
         */
        public Builder backendServers(BackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }

        /**
         * The maximum bandwidth of the Internet-facing CLB instance that is billed on a pay-by-bandwidth basis.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The time when the CLB instance was created. The time is in the `YYYY-MM-DDThh:mm:ssZ` format.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The timestamp generated when the CA certificate is uploaded.
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * Indicates whether deletion protection is enabled for the CLB instance.
         * <p>
         * 
         * Valid values: **on** and **off**.
         */
        public Builder deleteProtection(String deleteProtection) {
            this.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * The time when the CLB instance expires.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The timestamp that indicates the expiration time of the CLB instance.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * The metering method of the CLB instance. Valid values:
         * <p>
         * 
         * *   **PayBySpec** (default)
         * *   **PayByCLCU**
         * 
         * > This parameter is available only on the China site and takes effect only when **PayType** is set to **PayOnDemand**.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The metering method of the Internet-facing CLB instance. Valid values:
         * <p>
         * 
         * *   **paybytraffic**
         * *   **paybybandwidth**
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The frontend port used by the CLB instance.
         */
        public Builder listenerPorts(ListenerPorts listenerPorts) {
            this.listenerPorts = listenerPorts;
            return this;
        }

        /**
         * The ports or protocols of the listeners.
         */
        public Builder listenerPortsAndProtocal(ListenerPortsAndProtocal listenerPortsAndProtocal) {
            this.listenerPortsAndProtocal = listenerPortsAndProtocal;
            return this;
        }

        /**
         * The ports or protocols of the listeners.
         */
        public Builder listenerPortsAndProtocol(ListenerPortsAndProtocol listenerPortsAndProtocol) {
            this.listenerPortsAndProtocol = listenerPortsAndProtocol;
            return this;
        }

        /**
         * The CLB instance ID.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The name of the CLB instance.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * The specification of the CLB instance.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * The status of the CLB instance. Valid values:
         * <p>
         * 
         * *   **inactive**: The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.
         * *   **active**: The CLB instance is running as expected. Newly created CLB instances are in the **active** state by default.
         * *   **locked**: The CLB instance is locked. CLB instances may be locked due to overdue payments or other reasons.
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * The ID of the primary zone to which the CLB instance belongs.
         */
        public Builder masterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * The reason why the configuration read-only mode is enabled. The value is 1 to 80 characters in length. It starts with a letter and can contain digits, periods (.), underscores (\_), and hyphens (-).
         * <p>
         * 
         * >  This parameter is valid only when **ModificationProtectionStatus** is set to **ConsoleProtection**.
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * Indicates whether the configuration read-only mode is enabled. Valid values:
         * <p>
         * 
         * *   **NonProtection**: The configuration read-only mode is disabled. After you disable the configuration read-only mode, the value of **ModificationProtectionReason** is cleared.
         * *   **ConsoleProtection**: The configuration read-only mode is enabled.
         * 
         * >  If this parameter is set to **ConsoleProtection**, you cannot modify instance configurations in the CLB console. However, you can modify instance configurations by calling API operations.
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }

        /**
         * The network type of the CLB instance.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * The billing method of the CLB instance. Valid values:
         * <p>
         * 
         * *   Only **PayOnDemand** may be returned, which indicates the pay-as-you-go billing method.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * The region ID of the CLB instance.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The alias of the region to which the CLB instance belongs.
         */
        public Builder regionIdAlias(String regionIdAlias) {
            this.regionIdAlias = regionIdAlias;
            return this;
        }

        /**
         * The auto-renewal cycle. Valid values: **Year** and **Month**. Default value: Month.
         * <p>
         * 
         * >  This parameter is valid only if you create a subscription CLB instance on the Alibaba Cloud China site. In this case, **PayType** must be set to **PrePay** and **RenewalStatus** must be set to **AutoRenewal**.
         */
        public Builder renewalCycUnit(String renewalCycUnit) {
            this.renewalCycUnit = renewalCycUnit;
            return this;
        }

        /**
         * The auto-renewal duration. This parameter is valid only if **RenewalStatus** is set to **AutoRenewal**.
         * <p>
         * 
         * *   Valid values when **PeriodUnit** is set to **Year**: **1**, **2**, and **3**.
         * 
         * *   Valid values when **PeriodUnit** is set to **Month**: **1**, **2**, **3**, and **6**.
         * 
         * > This parameter is valid only when you create a subscription CLB instance on the Alibaba Cloud China site. In this case, the **PayType** parameter must be set to **PrePay**.
         */
        public Builder renewalDuration(Integer renewalDuration) {
            this.renewalDuration = renewalDuration;
            return this;
        }

        /**
         * Indicates whether auto-renewal is enabled. Valid values:
         * <p>
         * 
         * *   **AutoRenewal**: Auto-renewal is enabled.
         * 
         * *   **Normal**: Auto-renewal is disabled. You must manually renew the CLB instance.
         * 
         * *   **NotRenewal**: The CLB instance will not be renewed upon expiration. If this value is returned, the system does not send notifications until three days before the expiration date.
         * 
         *     **
         * 
         *     **Note** This parameter is valid only when you create a subscription CLB instance on the Alibaba Cloud China site. In this case, **PayType** must be set to **PrePay**.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the secondary zone to which the CLB instance belongs.
         */
        public Builder slaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the vSwitch to which the internal-facing CLB instance belongs.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) where the internal-facing CLB instance is deployed.
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

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Integer weight;

        private BackendServer(Builder builder) {
            this.description = builder.description;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
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
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
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
            private String serverIp; 
            private String type; 
            private Integer weight; 

            /**
             * The description of the backend server.
             * <p>
             * 
             * > This parameter is not returned if Description is not set.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The backend server ID.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The ID of the elastic network interface (ENI) or elastic container instance.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The type of the backend server.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the backend server.
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
             * The frontend port that is used by the CLB instance.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The frontend protocol that is used by the CLB instance.
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
             * Indicates whether the listener is enabled.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination listening port to which requests are forwarded. The port must be open and use HTTPS.
             */
            public Builder forwardPort(Integer forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * Indicates whether the listener is enabled.
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * The frontend port that is used by the CLB instance.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The frontend protocol that is used by the CLB instance.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The tag key. Valid values of N: **1** to **20**. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be at most 64 characters in length, and cannot contain `http://` or `https://`. It must not start with `aliyun` or `acs:`.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value. Valid values of N: **1** to **20**. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. The tag value cannot contain `http://` or `https://`.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
