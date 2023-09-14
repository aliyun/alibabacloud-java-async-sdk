// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @NameInMap("AccessLogConfig")
    private AccessLogConfig accessLogConfig;

    @NameInMap("AddressAllocatedMode")
    private String addressAllocatedMode;

    @NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @NameInMap("AddressType")
    private String addressType;

    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DNSName")
    private String DNSName;

    @NameInMap("DeletionProtectionConfig")
    private DeletionProtectionConfig deletionProtectionConfig;

    @NameInMap("Ipv6AddressType")
    private String ipv6AddressType;

    @NameInMap("LoadBalancerBillingConfig")
    private LoadBalancerBillingConfig loadBalancerBillingConfig;

    @NameInMap("LoadBalancerBussinessStatus")
    private String loadBalancerBussinessStatus;

    @NameInMap("LoadBalancerEdition")
    private String loadBalancerEdition;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @NameInMap("LoadBalancerOperationLocks")
    private java.util.List < LoadBalancerOperationLocks> loadBalancerOperationLocks;

    @NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @NameInMap("ModificationProtectionConfig")
    private ModificationProtectionConfig modificationProtectionConfig;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneMappings")
    private java.util.List < ZoneMappings> zoneMappings;

    private GetLoadBalancerAttributeResponseBody(Builder builder) {
        this.accessLogConfig = builder.accessLogConfig;
        this.addressAllocatedMode = builder.addressAllocatedMode;
        this.addressIpVersion = builder.addressIpVersion;
        this.addressType = builder.addressType;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.createTime = builder.createTime;
        this.DNSName = builder.DNSName;
        this.deletionProtectionConfig = builder.deletionProtectionConfig;
        this.ipv6AddressType = builder.ipv6AddressType;
        this.loadBalancerBillingConfig = builder.loadBalancerBillingConfig;
        this.loadBalancerBussinessStatus = builder.loadBalancerBussinessStatus;
        this.loadBalancerEdition = builder.loadBalancerEdition;
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerOperationLocks = builder.loadBalancerOperationLocks;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.modificationProtectionConfig = builder.modificationProtectionConfig;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
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
     * @return accessLogConfig
     */
    public AccessLogConfig getAccessLogConfig() {
        return this.accessLogConfig;
    }

    /**
     * @return addressAllocatedMode
     */
    public String getAddressAllocatedMode() {
        return this.addressAllocatedMode;
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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return loadBalancerBussinessStatus
     */
    public String getLoadBalancerBussinessStatus() {
        return this.loadBalancerBussinessStatus;
    }

    /**
     * @return loadBalancerEdition
     */
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
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
     * @return loadBalancerOperationLocks
     */
    public java.util.List < LoadBalancerOperationLocks> getLoadBalancerOperationLocks() {
        return this.loadBalancerOperationLocks;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    /**
     * @return modificationProtectionConfig
     */
    public ModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
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
        private AccessLogConfig accessLogConfig; 
        private String addressAllocatedMode; 
        private String addressIpVersion; 
        private String addressType; 
        private String bandwidthPackageId; 
        private String createTime; 
        private String DNSName; 
        private DeletionProtectionConfig deletionProtectionConfig; 
        private String ipv6AddressType; 
        private LoadBalancerBillingConfig loadBalancerBillingConfig; 
        private String loadBalancerBussinessStatus; 
        private String loadBalancerEdition; 
        private String loadBalancerId; 
        private String loadBalancerName; 
        private java.util.List < LoadBalancerOperationLocks> loadBalancerOperationLocks; 
        private String loadBalancerStatus; 
        private ModificationProtectionConfig modificationProtectionConfig; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 
        private String vpcId; 
        private java.util.List < ZoneMappings> zoneMappings; 

        /**
         * The configuration of the access log feature.
         */
        public Builder accessLogConfig(AccessLogConfig accessLogConfig) {
            this.accessLogConfig = accessLogConfig;
            return this;
        }

        /**
         * The mode in which IP addresses are allocated. Valid values:
         * <p>
         * 
         * *   **Fixed**: allocates a static IP address to the ALB instance.
         * *   **Dynamic**: dynamically allocates an IP address to each zone of the ALB instance.
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * The IP version. Valid values:
         * <p>
         * 
         * *   **IPv4**
         * *   **DualStack**
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * The network type of the ALB instance. Valid values:
         * <p>
         * 
         * *   **Internet**: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.
         * *   **Intranet**: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the virtual private cloud (VPC) where the ALB instance is deployed.
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * The ID of the elastic IP address (EIP) bandwidth plan that is associated with the Internet-facing ALB instance.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The time when the resource was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The domain name of the ALB instance.
         */
        public Builder DNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }

        /**
         * The configuration of deletion protection.
         */
        public Builder deletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
            this.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }

        /**
         * The type of IPv6 address that is used by the ALB instance. Valid values:
         * <p>
         * 
         * *   **Internet**: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.
         * *   **Intranet**: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * The configuration of the billing method of the ALB instance.
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * The service status of the ALB instance. Valid values:
         * <p>
         * 
         * *   **Abnormal**
         * *   **Normal**
         */
        public Builder loadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
            this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            return this;
        }

        /**
         * The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values:
         * <p>
         * 
         * *   **Basic**
         * *   **Standard**
         * *   **StandardWithWaf**
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * The ALB instance ID.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The name of the ALB instance.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * The type of the lock. Valid values:
         * <p>
         * 
         * *   **SecurityLocked**: The ALB instance is locked due to security reasons.
         * *   **RelatedResourceLocked**: The ALB instance is locked due to association issues.
         * *   **FinancialLocked**: The ALB instance is locked due to overdue payments.
         * *   **ResidualLocked**: The ALB instance is locked because the associated resources have overdue payments and the resources are released.
         */
        public Builder loadBalancerOperationLocks(java.util.List < LoadBalancerOperationLocks> loadBalancerOperationLocks) {
            this.loadBalancerOperationLocks = loadBalancerOperationLocks;
            return this;
        }

        /**
         * The status of the ALB instance. Valid values:
         * <p>
         * 
         * *   **Inactive**: The ALB instance is disabled. ALB instances in the Inactive state do not forward traffic.
         * *   **Active**: The ALB instance is running.
         * *   **Provisioning**: The ALB instance is being created.
         * *   **Configuring**: The ALB instance is being modified.
         * *   **CreateFailed**: The system failed to create the ALB instance. In this case, you are not charged for the ALB instance. You can only delete the ALB instance.
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * The configuration of the configuration read-only mode.
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * The region ID of the ALB instance.
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
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tag value.
         * <p>
         * 
         * The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. The tag value cannot contain `http://` or `https://`.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the VPC in which the ALB instance is deployed.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The zone ID of the ALB instance.
         * <p>
         * 
         * You can call the [DescribeZones](~~189196~~) operation to query the zones of the ALB instance.
         */
        public Builder zoneMappings(java.util.List < ZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public GetLoadBalancerAttributeResponseBody build() {
            return new GetLoadBalancerAttributeResponseBody(this);
        } 

    } 

    public static class AccessLogConfig extends TeaModel {
        @NameInMap("LogProject")
        private String logProject;

        @NameInMap("LogStore")
        private String logStore;

        private AccessLogConfig(Builder builder) {
            this.logProject = builder.logProject;
            this.logStore = builder.logStore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogConfig create() {
            return builder().build();
        }

        /**
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        public static final class Builder {
            private String logProject; 
            private String logStore; 

            /**
             * The Log Service project.
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * The Logstore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            public AccessLogConfig build() {
                return new AccessLogConfig(this);
            } 

        } 

    }
    public static class DeletionProtectionConfig extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("EnabledTime")
        private String enabledTime;

        private DeletionProtectionConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.enabledTime = builder.enabledTime;
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

        public static final class Builder {
            private Boolean enabled; 
            private String enabledTime; 

            /**
             * Indicates whether the deletion protection feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The time when the deletion protection feature was enabled. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder enabledTime(String enabledTime) {
                this.enabledTime = enabledTime;
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
             * The billing method.
             * <p>
             * 
             * Only **PostPay** may be returned. The value indicates the pay-as-you-go billing method.
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
    public static class LoadBalancerOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("LockType")
        private String lockType;

        private LoadBalancerOperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
            this.lockType = builder.lockType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerOperationLocks create() {
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
             * The configuration of the configuration read-only mode.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The reason why the configuration read-only mode was enabled. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.
             * <p>
             * 
             * This parameter is valid only if you set the **ModificationProtectionStatus** parameter to **ConsoleProtection**.
             */
            public Builder lockType(String lockType) {
                this.lockType = lockType;
                return this;
            }

            public LoadBalancerOperationLocks build() {
                return new LoadBalancerOperationLocks(this);
            } 

        } 

    }
    public static class ModificationProtectionConfig extends TeaModel {
        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        private ModificationProtectionConfig(Builder builder) {
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
            private String reason; 
            private String status; 

            /**
             * The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.
             * <p>
             * 
             * This parameter is valid only if **ModificationProtectionStatus** is set to **ConsoleProtection**.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The status of the configuration read-only mode. Valid values:
             * <p>
             * 
             * *   **NonProtection**: The configuration read-only mode is disabled. In this case, you cannot specify ModificationProtectionReason. If you specify ModificationProtectionReason, the value of the parameter is cleared.
             * *   **ConsoleProtection**: The configuration read-only mode is enabled. In this case, you can specify ModificationProtectionReason.
             * 
             * > If you set this parameter to **ConsoleProtection**, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The zones and the vSwitches. You must specify at least two zones.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The IP addresses that are used by the ALB instance.
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
    public static class LoadBalancerAddresses extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("EipType")
        private String eipType;

        @NameInMap("Ipv6Address")
        private String ipv6Address;

        private LoadBalancerAddresses(Builder builder) {
            this.address = builder.address;
            this.allocationId = builder.allocationId;
            this.eipType = builder.eipType;
            this.ipv6Address = builder.ipv6Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerAddresses create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return eipType
         */
        public String getEipType() {
            return this.eipType;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private String address; 
            private String allocationId; 
            private String eipType; 
            private String ipv6Address; 

            /**
             * The ID of the zone where the ALB instance was deployed.
             * <p>
             * 
             * You can call the [DescribeZones](~~189196~~) operation to query the zones of the ALB instance.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * EipType.
             */
            public Builder eipType(String eipType) {
                this.eipType = eipType;
                return this;
            }

            /**
             * The protocol version. Valid values:
             * <p>
             * 
             * *   **IPv4:** IPv4.
             * *   **DualStack:** dual stack.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
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

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.loadBalancerAddresses = builder.loadBalancerAddresses;
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
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The ID of the vSwitch in the zone. Each zone can contain only one vSwitch and one subnet.
             */
            public Builder loadBalancerAddresses(java.util.List < LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * The type of IPv6 address that is used by the ALB instance. Valid values:
             * <p>
             * 
             * *   **Internet:** The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.
             * *   **Intranet:** The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
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
