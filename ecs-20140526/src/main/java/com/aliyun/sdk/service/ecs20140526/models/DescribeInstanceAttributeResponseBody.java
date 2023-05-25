// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttributeResponseBody</p>
 */
public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Cpu")
    private Integer cpu;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @NameInMap("DedicatedHostAttribute")
    private DedicatedHostAttribute dedicatedHostAttribute;

    @NameInMap("Description")
    private String description;

    @NameInMap("EipAddress")
    private EipAddress eipAddress;

    @NameInMap("EnableJumboFrame")
    private Boolean enableJumboFrame;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("HostName")
    private String hostName;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("InnerIpAddress")
    private InnerIpAddress innerIpAddress;

    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @NameInMap("InternetMaxBandwidthIn")
    private Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @NameInMap("IoOptimized")
    private String ioOptimized;

    @NameInMap("Memory")
    private Integer memory;

    @NameInMap("OperationLocks")
    private OperationLocks operationLocks;

    @NameInMap("PublicIpAddress")
    private PublicIpAddress publicIpAddress;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupIds")
    private SecurityGroupIds securityGroupIds;

    @NameInMap("SerialNumber")
    private String serialNumber;

    @NameInMap("Status")
    private String status;

    @NameInMap("StoppedMode")
    private String stoppedMode;

    @NameInMap("VlanId")
    private String vlanId;

    @NameInMap("VpcAttributes")
    private VpcAttributes vpcAttributes;

    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeInstanceAttributeResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.cpu = builder.cpu;
        this.creationTime = builder.creationTime;
        this.creditSpecification = builder.creditSpecification;
        this.dedicatedHostAttribute = builder.dedicatedHostAttribute;
        this.description = builder.description;
        this.eipAddress = builder.eipAddress;
        this.enableJumboFrame = builder.enableJumboFrame;
        this.expiredTime = builder.expiredTime;
        this.hostName = builder.hostName;
        this.imageId = builder.imageId;
        this.innerIpAddress = builder.innerIpAddress;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ioOptimized = builder.ioOptimized;
        this.memory = builder.memory;
        this.operationLocks = builder.operationLocks;
        this.publicIpAddress = builder.publicIpAddress;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.securityGroupIds = builder.securityGroupIds;
        this.serialNumber = builder.serialNumber;
        this.status = builder.status;
        this.stoppedMode = builder.stoppedMode;
        this.vlanId = builder.vlanId;
        this.vpcAttributes = builder.vpcAttributes;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return dedicatedHostAttribute
     */
    public DedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eipAddress
     */
    public EipAddress getEipAddress() {
        return this.eipAddress;
    }

    /**
     * @return enableJumboFrame
     */
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return innerIpAddress
     */
    public InnerIpAddress getInnerIpAddress() {
        return this.innerIpAddress;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ioOptimized
     */
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return operationLocks
     */
    public OperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    /**
     * @return publicIpAddress
     */
    public PublicIpAddress getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupIds
     */
    public SecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    /**
     * @return vlanId
     */
    public String getVlanId() {
        return this.vlanId;
    }

    /**
     * @return vpcAttributes
     */
    public VpcAttributes getVpcAttributes() {
        return this.vpcAttributes;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String clusterId; 
        private Integer cpu; 
        private String creationTime; 
        private String creditSpecification; 
        private DedicatedHostAttribute dedicatedHostAttribute; 
        private String description; 
        private EipAddress eipAddress; 
        private Boolean enableJumboFrame; 
        private String expiredTime; 
        private String hostName; 
        private String imageId; 
        private InnerIpAddress innerIpAddress; 
        private String instanceChargeType; 
        private String instanceId; 
        private String instanceName; 
        private String instanceNetworkType; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String ioOptimized; 
        private Integer memory; 
        private OperationLocks operationLocks; 
        private PublicIpAddress publicIpAddress; 
        private String regionId; 
        private String requestId; 
        private SecurityGroupIds securityGroupIds; 
        private String serialNumber; 
        private String status; 
        private String stoppedMode; 
        private String vlanId; 
        private VpcAttributes vpcAttributes; 
        private String zoneId; 

        /**
         * The ID of the cluster to which the instance belongs.
         * <p>
         * 
         * > This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of vCPUs.
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see [ISO 8601](~~25696~~).
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The performance mode of the burstable instance. Valid values:
         * <p>
         * 
         * *   Standard: standard mode. For more information, see the "Standard mode" section in [Overview](~~59977#section-svb-w9d-dju~~).
         * *   Unlimited: unlimited mode. For more information, see the "Unlimited mode" section in [Overview](~~59977#section-svb-w9d-dju~~).
         */
        public Builder creditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * Details about the dedicated host. It is an array that consists of the DedicatedHostClusterId, DedicatedHostId, and DedicatedHostName parameters.
         */
        public Builder dedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
            this.dedicatedHostAttribute = dedicatedHostAttribute;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Details about the elastic IP address (EIP) associated with the instance.
         */
        public Builder eipAddress(EipAddress eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * ECS实例是否开启了Jumbo frame特性。 可能值：
         * <p>
         * 
         * - true：开启。
         * 
         * - false：不开启。
         * 
         * 更多信息，请参见[ECS实例MTU](~~200512~~)。
         */
        public Builder enableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }

        /**
         * The time when the instance expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see [ISO 8601](~~25696~~).
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The hostname of the instance.
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * The ID of the image that the instance is running.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * The internal IP address of the instance located in the classic network.
         */
        public Builder innerIpAddress(InnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   PrePaid: subscription.
         * *   PostPaid: pay-as-you-go
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The instance ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The instance name.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   classic: classic network
         * *   vpc: VPC
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The instance type.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The metering method for network usage. Valid values:
         * <p>
         * 
         * *   PayByBandwidth
         * *   PayByTraffic
         * 
         * > When the **pay-by-traffic** method is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** metering method for network usage.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The maximum inbound public bandwidth. Unit: Mbit/s.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * The maximum outbound public bandwidth. Unit: Mbit/s.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * Indicates whether the instance is I/O optimized.
         */
        public Builder ioOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The memory size of the instance. Unit: MiB.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * The reason why the instance was locked. Valid values:
         * <p>
         * 
         * *   financial: The dedicated host was locked due to overdue payments.
         * *   security: The instance was locked due to security reasons.
         * *   recycling: The preemptible instance was locked and pending release.
         * *   dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.
         * *   refunded: The instance was locked because a refund was made for the instance.
         */
        public Builder operationLocks(OperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * The public IP address of the instance.
         */
        public Builder publicIpAddress(PublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        /**
         * The ID of the region in which the instance resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The IDs of the security groups to which the instance belongs.
         */
        public Builder securityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The serial number of the instance.
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * The status of the instance. Valid values:
         * <p>
         * 
         * *   Pending: The instance is being created.
         * *   Running: The instance is running.
         * *   Starting: The instance is being started.
         * *   Stopping: The instance is being stopped.
         * *   Stopped: The instance is stopped.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether the system implements billing after the instance is stopped. Valid values:
         * <p>
         * 
         * *   KeepCharging: The instance is stopped in standard mode. The billing of the instance continues after the instance is stopped, and resources are retained for the instance.
         * *   StopCharging: The instance is stopped in economical mode. The billing of some resources of the instance stops after the instance is stopped. When the instance is stopped, its resources such as vCPUs, memory, and public IP address are released. The instance may be unable to start again if some required resources are out of stock in the current region.
         * *   Not-applicable: The instance does not support economical mode.
         */
        public Builder stoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }

        /**
         * The virtual LAN (VLAN) ID of the instance.
         * <p>
         * 
         * > This parameter will be removed in the future. To ensure future compatibility, we recommend that you use other parameters.
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }

        /**
         * The VPC attributes of the instance.
         */
        public Builder vpcAttributes(VpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }

        /**
         * The ID of the zone in which the instance resides.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeInstanceAttributeResponseBody build() {
            return new DescribeInstanceAttributeResponseBody(this);
        } 

    } 

    public static class DedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        private DedicatedHostAttribute(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
            this.dedicatedHostName = builder.dedicatedHostName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostAttribute create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return dedicatedHostName
         */
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public static final class Builder {
            private String dedicatedHostId; 
            private String dedicatedHostName; 

            /**
             * The ID of the dedicated host.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * The name of the dedicated host.
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
                return this;
            }

            public DedicatedHostAttribute build() {
                return new DedicatedHostAttribute(this);
            } 

        } 

    }
    public static class EipAddress extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpAddress")
        private String ipAddress;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.bandwidth = builder.bandwidth;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private String allocationId; 
            private Integer bandwidth; 
            private String internetChargeType; 
            private String ipAddress; 

            /**
             * The ID of the EIP.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The maximum public bandwidth of the EIP. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The metering method for network usage. Valid values:
             * <p>
             * 
             * *   PayByBandwidth
             * *   PayByTraffic
             * 
             * > When the **pay-by-traffic** method is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the **pay-by-bandwidth** metering method for network usage.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The ID of the elastic IP address (EIP).
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    public static class InnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private InnerIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * The ID of the elastic IP address (EIP).
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public InnerIpAddress build() {
                return new InnerIpAddress(this);
            } 

        } 

    }
    public static class LockReason extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * The reason why the instance was locked. Valid values:
             * <p>
             * 
             * *   financial: The dedicated host was locked due to overdue payments.
             * *   security: The instance was locked due to security reasons.
             * *   recycling: The preemptible instance was locked and pending release.
             * *   dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.
             * *   refunded: The instance was locked because a refund was made for the instance.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private java.util.List < LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List < LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List < LockReason> lockReason; 

            /**
             * The reason why the instance was locked. Valid values:
             * <p>
             * 
             * *   financial: The dedicated host was locked due to overdue payments.
             * *   security: The instance was locked due to security reasons.
             * *   recycling: The preemptible instance was locked and pending release.
             * *   dedicatedhostfinancial: The instance was locked due to overdue payments for the dedicated host.
             * *   refunded: The instance was locked because a refund was made for the instance.
             */
            public Builder lockReason(java.util.List < LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    public static class PublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private PublicIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * The ID of the elastic IP address (EIP).
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PublicIpAddress build() {
                return new PublicIpAddress(this);
            } 

        } 

    }
    public static class SecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        private java.util.List < String > securityGroupId;

        private SecurityGroupIds(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupIds create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public java.util.List < String > getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupId; 

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(java.util.List < String > securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SecurityGroupIds build() {
                return new SecurityGroupIds(this);
            } 

        } 

    }
    public static class PrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        private PrivateIpAddress(Builder builder) {
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateIpAddress create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public java.util.List < String > getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private java.util.List < String > ipAddress; 

            /**
             * The ID of the elastic IP address (EIP).
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PrivateIpAddress build() {
                return new PrivateIpAddress(this);
            } 

        } 

    }
    public static class VpcAttributes extends TeaModel {
        @NameInMap("NatIpAddress")
        private String natIpAddress;

        @NameInMap("PrivateIpAddress")
        private PrivateIpAddress privateIpAddress;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private VpcAttributes(Builder builder) {
            this.natIpAddress = builder.natIpAddress;
            this.privateIpAddress = builder.privateIpAddress;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcAttributes create() {
            return builder().build();
        }

        /**
         * @return natIpAddress
         */
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        /**
         * @return privateIpAddress
         */
        public PrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
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
            private String natIpAddress; 
            private PrivateIpAddress privateIpAddress; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The NAT IP address of the instance. It is used by ECS instances in different VPCs for communication.
             */
            public Builder natIpAddress(String natIpAddress) {
                this.natIpAddress = natIpAddress;
                return this;
            }

            /**
             * The private IP address of the instance.
             */
            public Builder privateIpAddress(PrivateIpAddress privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The ID of the vSwitch to which the instance is connected.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcAttributes build() {
                return new VpcAttributes(this);
            } 

        } 

    }
}
