// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoadBalancerAttributeResponseBody</p>
 */
public class GetLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @NameInMap("AddressType")
    private String addressType;

    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @NameInMap("Cps")
    private Integer cps;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CrossZoneEnabled")
    private Boolean crossZoneEnabled;

    @NameInMap("DNSName")
    private String DNSName;

    @NameInMap("DeletionProtectionConfig")
    private DeletionProtectionConfig deletionProtectionConfig;

    @NameInMap("Ipv6AddressType")
    private String ipv6AddressType;

    @NameInMap("LoadBalancerBillingConfig")
    private LoadBalancerBillingConfig loadBalancerBillingConfig;

    @NameInMap("LoadBalancerBusinessStatus")
    private String loadBalancerBusinessStatus;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @NameInMap("LoadBalancerType")
    private String loadBalancerType;

    @NameInMap("ModificationProtectionConfig")
    private ModificationProtectionConfig modificationProtectionConfig;

    @NameInMap("OperationLocks")
    private java.util.List < OperationLocks> operationLocks;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneMappings")
    private java.util.List < ZoneMappings> zoneMappings;

    private GetLoadBalancerAttributeResponseBody(Builder builder) {
        this.addressIpVersion = builder.addressIpVersion;
        this.addressType = builder.addressType;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.cps = builder.cps;
        this.createTime = builder.createTime;
        this.crossZoneEnabled = builder.crossZoneEnabled;
        this.DNSName = builder.DNSName;
        this.deletionProtectionConfig = builder.deletionProtectionConfig;
        this.ipv6AddressType = builder.ipv6AddressType;
        this.loadBalancerBillingConfig = builder.loadBalancerBillingConfig;
        this.loadBalancerBusinessStatus = builder.loadBalancerBusinessStatus;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.loadBalancerType = builder.loadBalancerType;
        this.modificationProtectionConfig = builder.modificationProtectionConfig;
        this.operationLocks = builder.operationLocks;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoadBalancerAttributeResponseBody create() {
        return builder().build();
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
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return cps
     */
    public Integer getCps() {
        return this.cps;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return crossZoneEnabled
     */
    public Boolean getCrossZoneEnabled() {
        return this.crossZoneEnabled;
    }

    /**
     * @return DNSName
     */
    public String getDNSName() {
        return this.DNSName;
    }

    /**
     * @return deletionProtectionConfig
     */
    public DeletionProtectionConfig getDeletionProtectionConfig() {
        return this.deletionProtectionConfig;
    }

    /**
     * @return ipv6AddressType
     */
    public String getIpv6AddressType() {
        return this.ipv6AddressType;
    }

    /**
     * @return loadBalancerBillingConfig
     */
    public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    /**
     * @return loadBalancerBusinessStatus
     */
    public String getLoadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
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
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    /**
     * @return loadBalancerType
     */
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * @return modificationProtectionConfig
     */
    public ModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    /**
     * @return operationLocks
     */
    public java.util.List < OperationLocks> getOperationLocks() {
        return this.operationLocks;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List < ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder {
        private String addressIpVersion; 
        private String addressType; 
        private String bandwidthPackageId; 
        private Integer cps; 
        private String createTime; 
        private Boolean crossZoneEnabled; 
        private String DNSName; 
        private DeletionProtectionConfig deletionProtectionConfig; 
        private String ipv6AddressType; 
        private LoadBalancerBillingConfig loadBalancerBillingConfig; 
        private String loadBalancerBusinessStatus; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String loadBalancerStatus; 
        private String loadBalancerType; 
        private ModificationProtectionConfig modificationProtectionConfig; 
        private java.util.List < OperationLocks> operationLocks; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List < String > securityGroupIds; 
        private java.util.List < Tags> tags; 
        private String vpcId; 
        private java.util.List < ZoneMappings> zoneMappings; 

        /**
         * AddressIpVersion.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * The IPv4 network type of the NLB instance. Valid values:
         * <p>
         * 
         * *   **Internet** The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
         * *   **Intranet** The domain name of the NLB instance is resolved to the private IP address. Therefore, the NLB instance can be accessed over the VPC in which the NLB instance is deployed.
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * BandwidthPackageId.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The maximum number of connections per second that can be created on the NLB instance. Valid values: **0** to **1000000**.
         * <p>
         * 
         * **0** indicates that the number of connections is unlimited.
         */
        public Builder cps(Integer cps) {
            this.cps = cps;
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
         * Indicates whether the NLB instance is accessible across zones. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder crossZoneEnabled(Boolean crossZoneEnabled) {
            this.crossZoneEnabled = crossZoneEnabled;
            return this;
        }

        /**
         * DNSName.
         */
        public Builder DNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }

        /**
         * DeletionProtectionConfig.
         */
        public Builder deletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
            this.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }

        /**
         * The IPv6 network type of the NLB instance. Valid values:
         * <p>
         * 
         * *   **Internet**: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. Therefore, the NLB instance can be accessed over the Internet.
         * *   **Intranet**: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. In this case, the NLB instance can be accessed over the VPC where the NLB instance is deployed.
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * The billing information of the NLB instance.
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * The status of workloads on the NLB instance. Valid values:
         * <p>
         * 
         * *   **Abnormal**
         * *   **Normal**
         */
        public Builder loadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }

        /**
         * The NLB instance ID.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The NLB instance name.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * The NLB instance status. Valid values:
         * <p>
         * 
         * *   **Inactive**: The NLB instance is disabled. The listeners of NLB instances in the Inactive state do not forward traffic.
         * *   **Active**: The NLB instance is running.
         * *   **Provisioning**: The NLB instance is being created.
         * *   **Configuring**: The NLB instance is being modified.
         * *   **CreateFailed**: The system failed to create the NLB instance. In this case, you are not charged for the NLB instance. You can only delete the NLB instance.
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * LoadBalancerType.
         */
        public Builder loadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * ModificationProtectionConfig.
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * The information about the locked NLB instance. This parameter is returned only when `LoadBalancerBussinessStatus` is **Abnormal**.
         */
        public Builder operationLocks(java.util.List < OperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }

        /**
         * The region ID of the NLB instance.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The ID of the security group associated with the NLB instance.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The VPC ID of the NLB instance.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The list of zones and vSwitches in the zones. You must specify 2 to 10 zones.
         */
        public Builder zoneMappings(java.util.List < ZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public GetLoadBalancerAttributeResponseBody build() {
            return new GetLoadBalancerAttributeResponseBody(this);
        } 

    } 

    public static class DeletionProtectionConfig extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("EnabledTime")
        private String enabledTime;

        @NameInMap("Reason")
        private String reason;

        private DeletionProtectionConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.enabledTime = builder.enabledTime;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeletionProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return enabledTime
         */
        public String getEnabledTime() {
            return this.enabledTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String enabledTime; 
            private String reason; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * EnabledTime.
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public DeletionProtectionConfig build() {
                return new DeletionProtectionConfig(this);
            } 

        } 

    }
    public static class LoadBalancerBillingConfig extends TeaModel {
        @NameInMap("PayType")
        private String payType;

        private LoadBalancerBillingConfig(Builder builder) {
            this.payType = builder.payType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerBillingConfig create() {
            return builder().build();
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        public static final class Builder {
            private String payType; 

            /**
             * The billing method of the NLB instance. Set the value to **PostPay**, which specifies the pay-as-you-go billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            public LoadBalancerBillingConfig build() {
                return new LoadBalancerBillingConfig(this);
            } 

        } 

    }
    public static class ModificationProtectionConfig extends TeaModel {
        @NameInMap("EnabledTime")
        private String enabledTime;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        private ModificationProtectionConfig(Builder builder) {
            this.enabledTime = builder.enabledTime;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModificationProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return enabledTime
         */
        public String getEnabledTime() {
            return this.enabledTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String enabledTime; 
            private String reason; 
            private String status; 

            /**
             * EnabledTime.
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ModificationProtectionConfig build() {
                return new ModificationProtectionConfig(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("LockType")
        private String lockType;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
            this.lockType = builder.lockType;
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
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return lockType
         */
        public String getLockType() {
            return this.lockType;
        }

        public static final class Builder {
            private String lockReason; 
            private String lockType; 

            /**
             * The reason why the NLB instance is locked.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The type of the lock. Valid values:
             * <p>
             * 
             * *   **SecurityLocked**: The NLB instance is locked due to security reasons.
             * *   **RelatedResourceLocked**: The NLB instance is locked due to other resources associated with the NLB instance.
             * *   **FinancialLocked**: The NLB instance is locked due to overdue payments.
             * *   **ResidualLocked**: The NLB instance is locked because the associated resources have overdue payments and the resources are released.
             */
            public Builder lockType(String lockType) {
                this.lockType = lockType;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
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
    public static class LoadBalancerAddresses extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("EniId")
        private String eniId;

        @NameInMap("Ipv6Address")
        private String ipv6Address;

        @NameInMap("PrivateIPv4Address")
        private String privateIPv4Address;

        @NameInMap("PrivateIPv4HcStatus")
        private String privateIPv4HcStatus;

        @NameInMap("PrivateIPv6HcStatus")
        private String privateIPv6HcStatus;

        @NameInMap("PublicIPv4Address")
        private String publicIPv4Address;

        private LoadBalancerAddresses(Builder builder) {
            this.allocationId = builder.allocationId;
            this.eniId = builder.eniId;
            this.ipv6Address = builder.ipv6Address;
            this.privateIPv4Address = builder.privateIPv4Address;
            this.privateIPv4HcStatus = builder.privateIPv4HcStatus;
            this.privateIPv6HcStatus = builder.privateIPv6HcStatus;
            this.publicIPv4Address = builder.publicIPv4Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerAddresses create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return privateIPv4Address
         */
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
        }

        /**
         * @return privateIPv4HcStatus
         */
        public String getPrivateIPv4HcStatus() {
            return this.privateIPv4HcStatus;
        }

        /**
         * @return privateIPv6HcStatus
         */
        public String getPrivateIPv6HcStatus() {
            return this.privateIPv6HcStatus;
        }

        /**
         * @return publicIPv4Address
         */
        public String getPublicIPv4Address() {
            return this.publicIPv4Address;
        }

        public static final class Builder {
            private String allocationId; 
            private String eniId; 
            private String ipv6Address; 
            private String privateIPv4Address; 
            private String privateIPv4HcStatus; 
            private String privateIPv6HcStatus; 
            private String publicIPv4Address; 

            /**
             * The ID of the elastic IP address (EIP).
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The ID of the elastic network interface (ENI).
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The IPv6 address of the NLB instance.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * The private IPv4 address of the NLB instance.
             */
            public Builder privateIPv4Address(String privateIPv4Address) {
                this.privateIPv4Address = privateIPv4Address;
                return this;
            }

            /**
             * The health status of the private IPv4 address of the NLB instance. Valid values:
             * <p>
             * 
             * *   **Healthy**
             * *   **Unhealthy**
             * 
             * > This parameter is returned only when the **Status** of the zone is **Active**.
             */
            public Builder privateIPv4HcStatus(String privateIPv4HcStatus) {
                this.privateIPv4HcStatus = privateIPv4HcStatus;
                return this;
            }

            /**
             * The health status of the IPv6 address of the NLB instance. Valid values:
             * <p>
             * 
             * *   **Healthy**
             * *   **Unhealthy**
             * 
             * > This parameter is returned only when the **Status** of the zone is **Active**.
             */
            public Builder privateIPv6HcStatus(String privateIPv6HcStatus) {
                this.privateIPv6HcStatus = privateIPv6HcStatus;
                return this;
            }

            /**
             * The public IPv4 address of the NLB instance.
             */
            public Builder publicIPv4Address(String publicIPv4Address) {
                this.publicIPv4Address = publicIPv4Address;
                return this;
            }

            public LoadBalancerAddresses build() {
                return new LoadBalancerAddresses(this);
            } 

        } 

    }
    public static class ZoneMappings extends TeaModel {
        @NameInMap("LoadBalancerAddresses")
        private java.util.List < LoadBalancerAddresses> loadBalancerAddresses;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.loadBalancerAddresses = builder.loadBalancerAddresses;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return loadBalancerAddresses
         */
        public java.util.List < LoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List < LoadBalancerAddresses> loadBalancerAddresses; 
            private String status; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The information about the IP addresses used by the NLB instance.
             */
            public Builder loadBalancerAddresses(java.util.List < LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * The zone status. Valid values:
             * <p>
             * 
             * *   **Active**: The zone is available.
             * *   **Stopped**: The zone is disabled. You can set the zone to this status only by using Cloud Architect Design Tools (CADT).
             * *   **Shifted**: The DNS record is removed.
             * *   **Starting**: The zone is being enabled. You can set the zone to this status only by using CADT.
             * *   **Stopping** You can set the zone to this status only by using CADT.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the vSwitch in the zone. By default, each zone contains one vSwitch and one subnet.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the zone. You can call the [DescribeZones](~~443890~~) operation to query the most recent zone list.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
}
