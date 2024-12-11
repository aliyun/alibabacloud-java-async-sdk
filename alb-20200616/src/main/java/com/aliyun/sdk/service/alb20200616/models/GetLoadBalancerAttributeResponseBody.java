// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoadBalancerAttributeResponseBody</p>
 */
public class GetLoadBalancerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessLogConfig")
    private AccessLogConfig accessLogConfig;

    @com.aliyun.core.annotation.NameInMap("AddressAllocatedMode")
    private String addressAllocatedMode;

    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DNSName")
    private String DNSName;

    @com.aliyun.core.annotation.NameInMap("DeletionProtectionConfig")
    private DeletionProtectionConfig deletionProtectionConfig;

    @com.aliyun.core.annotation.NameInMap("Ipv6AddressType")
    private String ipv6AddressType;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerBillingConfig")
    private LoadBalancerBillingConfig loadBalancerBillingConfig;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerBussinessStatus")
    private String loadBalancerBussinessStatus;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerEdition")
    private String loadBalancerEdition;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerOperationLocks")
    private java.util.List < LoadBalancerOperationLocks> loadBalancerOperationLocks;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.NameInMap("ModificationProtectionConfig")
    private ModificationProtectionConfig modificationProtectionConfig;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
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
        private java.util.List < String > securityGroupIds; 
        private java.util.List < Tags> tags; 
        private String vpcId; 
        private java.util.List < ZoneMappings> zoneMappings; 

        /**
         * <p>The configuration of the access log feature.</p>
         */
        public Builder accessLogConfig(AccessLogConfig accessLogConfig) {
            this.accessLogConfig = accessLogConfig;
            return this;
        }

        /**
         * <p>The mode in which IP addresses are allocated. Valid values:</p>
         * <ul>
         * <li><strong>Fixed</strong>: allocates a static IP address to the ALB instance.</li>
         * <li><strong>Dynamic</strong>: dynamically allocates an IP address to each zone of the ALB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dynamic</p>
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong></li>
         * <li><strong>DualStack</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DualStack</p>
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The network type of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</li>
         * <li><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the virtual private cloud (VPC) where the ALB instance is deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The ID of the elastic IP address (EIP) bandwidth plan that is associated with the Internet-facing ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1vevu8h3ieh****</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>The time when the resource was created. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-02T02:49:05Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The domain name of the ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
         */
        public Builder DNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }

        /**
         * <p>The configuration of deletion protection.</p>
         */
        public Builder deletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
            this.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }

        /**
         * <p>The type of IPv6 address that is used by the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</li>
         * <li><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * <p>The billing method of the ALB instance.</p>
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * <p>The service status of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal</strong></li>
         * <li><strong>Normal</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder loadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
            this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            return this;
        }

        /**
         * <p>The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong></li>
         * <li><strong>Standard</strong></li>
         * <li><strong>StandardWithWaf</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * <p>The ALB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-o9ulmq5hgn68jk****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The name of the ALB instance.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>alb1</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The type of the lock. Valid values:</p>
         * <ul>
         * <li><strong>SecurityLocked</strong>: The ALB instance is locked due to security reasons.</li>
         * <li><strong>RelatedResourceLocked</strong>: The ALB instance is locked due to association issues.</li>
         * <li><strong>FinancialLocked</strong>: The ALB instance is locked due to overdue payments.</li>
         * <li><strong>ResidualLocked</strong>: The ALB instance is locked because the associated resources have overdue payments and the resources are released.</li>
         * </ul>
         */
        public Builder loadBalancerOperationLocks(java.util.List < LoadBalancerOperationLocks> loadBalancerOperationLocks) {
            this.loadBalancerOperationLocks = loadBalancerOperationLocks;
            return this;
        }

        /**
         * <p>The status of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Inactive</strong>: The ALB instance is disabled. ALB instances in the Inactive state do not forward traffic.</li>
         * <li><strong>Active</strong>: The ALB instance is running.</li>
         * <li><strong>Provisioning</strong>: The ALB instance is being created.</li>
         * <li><strong>Configuring</strong>: The ALB instance is being modified.</li>
         * <li><strong>CreateFailed</strong>: The system failed to create the ALB instance. In this case, you are not charged for the ALB instance. You can only delete the ALB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * <p>The configuration of the configuration read-only mode.</p>
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * <p>The region ID of the ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The IDs of the security groups to which the ALB instance is added.</p>
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the VPC in which the ALB instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b49rqrybk45nio****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The mappings between zones and vSwitches. At most 10 zones are returned. If the current region supports two or more zones, at least two zones are returned.</p>
         */
        public Builder zoneMappings(java.util.List < ZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public GetLoadBalancerAttributeResponseBody build() {
            return new GetLoadBalancerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class AccessLogConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogProject")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("LogStore")
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
             * <p>The Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>sls-setter</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class DeletionProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EnabledTime")
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
             * <p>Indicates whether the deletion protection feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The time when the deletion protection feature was enabled. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-02T02:49:05Z</p>
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
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class LoadBalancerBillingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PayType")
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
             * <p>The billing method.</p>
             * <p>Only <strong>PostPay</strong> is returned, which indicates the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPay</p>
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
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class LoadBalancerOperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("LockType")
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
             * <p>The reason why the ALB instance is locked. This parameter is valid only if <strong>LoadBalancerBussinessStatus</strong> is set to <strong>Abnormal</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>nolock</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The lock type. Valid values:</p>
             * <ul>
             * <li><strong>SecurityLocked</strong>: The ALB instance is locked due to security reasons.</li>
             * <li><strong>RelatedResourceLocked</strong>: The ALB instance is locked due to other resources that are associated with the ALB instance.</li>
             * <li><strong>FinancialLocked</strong>: The ALB instance is locked due to overdue payments.</li>
             * <li><strong>ResidualLocked</strong>: The ALB instance is locked because the associated resources have overdue payments and the resources are released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FinancialLocked</p>
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
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class ModificationProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
             * <p>This parameter is valid only if <strong>ModificationProtectionStatus</strong> is set to <strong>ConsoleProtection</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the configuration read-only mode. Valid values:</p>
             * <ul>
             * <li><strong>NonProtection</strong>: The configuration read-only mode is disabled. In this case, you cannot specify ModificationProtectionReason. If you specify ModificationProtectionReason, the value of the parameter is cleared.</li>
             * <li><strong>ConsoleProtection</strong>: The configuration read-only mode is enabled. In this case, you can specify ModificationProtectionReason.</li>
             * </ul>
             * <blockquote>
             * <p>If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ConsoleProtection</p>
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
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * <p>The tag key can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class LoadBalancerAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("EipType")
        private String eipType;

        @com.aliyun.core.annotation.NameInMap("IntranetAddress")
        private String intranetAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetAddressHcStatus")
        private String intranetAddressHcStatus;

        @com.aliyun.core.annotation.NameInMap("Ipv4LocalAddresses")
        private java.util.List < String > ipv4LocalAddresses;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Ipv6AddressHcStatus")
        private String ipv6AddressHcStatus;

        @com.aliyun.core.annotation.NameInMap("Ipv6LocalAddresses")
        private java.util.List < String > ipv6LocalAddresses;

        private LoadBalancerAddresses(Builder builder) {
            this.address = builder.address;
            this.allocationId = builder.allocationId;
            this.eipType = builder.eipType;
            this.intranetAddress = builder.intranetAddress;
            this.intranetAddressHcStatus = builder.intranetAddressHcStatus;
            this.ipv4LocalAddresses = builder.ipv4LocalAddresses;
            this.ipv6Address = builder.ipv6Address;
            this.ipv6AddressHcStatus = builder.ipv6AddressHcStatus;
            this.ipv6LocalAddresses = builder.ipv6LocalAddresses;
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
         * @return intranetAddress
         */
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        /**
         * @return intranetAddressHcStatus
         */
        public String getIntranetAddressHcStatus() {
            return this.intranetAddressHcStatus;
        }

        /**
         * @return ipv4LocalAddresses
         */
        public java.util.List < String > getIpv4LocalAddresses() {
            return this.ipv4LocalAddresses;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return ipv6AddressHcStatus
         */
        public String getIpv6AddressHcStatus() {
            return this.ipv6AddressHcStatus;
        }

        /**
         * @return ipv6LocalAddresses
         */
        public java.util.List < String > getIpv6LocalAddresses() {
            return this.ipv6LocalAddresses;
        }

        public static final class Builder {
            private String address; 
            private String allocationId; 
            private String eipType; 
            private String intranetAddress; 
            private String intranetAddressHcStatus; 
            private java.util.List < String > ipv4LocalAddresses; 
            private String ipv6Address; 
            private String ipv6AddressHcStatus; 
            private java.util.List < String > ipv6LocalAddresses; 

            /**
             * <p>An IPv4 address.</p>
             * <p>This parameter takes effect when <strong>AddressIPVersion</strong> is set to <strong>IPv4</strong> or <strong>DualStack</strong>. The network type is determined by the value of <strong>AddressType</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.1</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The elastic IP address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>eip-uf6wm****1zj9</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The type of EIP. Valid values:</p>
             * <ul>
             * <li><strong>Common</strong>: an EIP.</li>
             * <li><strong>Anycast</strong>: an Anycast EIP.</li>
             * </ul>
             * <blockquote>
             * <p> For more information about the regions in which ALB supports Anycast EIPs, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder eipType(String eipType) {
                this.eipType = eipType;
                return this;
            }

            /**
             * <p>The private IPv4 address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.1.181</p>
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * <p>The health status of the private IPv4 address of the ALB instance. 
             * This parameter is returned only when the Status of the zone is Active.Valid values:</p>
             * <ul>
             * <li><p><strong>Healthy</strong></p>
             * </li>
             * <li><p><strong>Unhealthy</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder intranetAddressHcStatus(String intranetAddressHcStatus) {
                this.intranetAddressHcStatus = intranetAddressHcStatus;
                return this;
            }

            /**
             * <p>The IPv4 link-local addresses. The IP addresses that the ALB instance uses to communicate with the backend servers.</p>
             */
            public Builder ipv4LocalAddresses(java.util.List < String > ipv4LocalAddresses) {
                this.ipv4LocalAddresses = ipv4LocalAddresses;
                return this;
            }

            /**
             * <p>An IPv6 address.</p>
             * <p>This parameter takes effect only when <strong>AddressIPVersion</strong> is set to <strong>DualStack</strong>. The network type is determined by the value of <strong>Ipv6AddressType</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:XXXX:39d:eb00::/56</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The health status of the private IPv6 address of the ALB instance. 
             * This parameter is returned only when the Status of the zone is Active.Valid values:</p>
             * <ul>
             * <li><p><strong>Healthy</strong></p>
             * </li>
             * <li><p><strong>Unhealthy</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Healthy</p>
             */
            public Builder ipv6AddressHcStatus(String ipv6AddressHcStatus) {
                this.ipv6AddressHcStatus = ipv6AddressHcStatus;
                return this;
            }

            /**
             * <p>The IPv6 link-local addresses. The IP addresses that the ALB instance uses to communicate with the backend servers.</p>
             */
            public Builder ipv6LocalAddresses(java.util.List < String > ipv6LocalAddresses) {
                this.ipv6LocalAddresses = ipv6LocalAddresses;
                return this;
            }

            public LoadBalancerAddresses build() {
                return new LoadBalancerAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLoadBalancerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoadBalancerAttributeResponseBody</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerAddresses")
        private java.util.List < LoadBalancerAddresses> loadBalancerAddresses;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The address of the ALB instance.</p>
             */
            public Builder loadBalancerAddresses(java.util.List < LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * <p>The zone status. Valid values:</p>
             * <ul>
             * <li><p><strong>Active</strong>: The ALB instance is running.</p>
             * </li>
             * <li><p><strong>Stopped</strong>: The ALB instance is disabled. </p>
             * </li>
             * <li><p><strong>Shifted</strong>: The ALB instance is removed.</p>
             * </li>
             * <li><p><strong>Starting</strong>: The ALB instance is starting.</p>
             * </li>
             * <li><p><strong>Stopping</strong>: The ALB instance is stopping.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp12mw1f8k3jgy****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID of the ALB instance.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation to query the most recent zone list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
