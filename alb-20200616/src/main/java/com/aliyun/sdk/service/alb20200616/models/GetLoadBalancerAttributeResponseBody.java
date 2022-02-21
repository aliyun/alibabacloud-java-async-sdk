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
         * 访问日志属性
         */
        public Builder accessLogConfig(AccessLogConfig accessLogConfig) {
            this.accessLogConfig = accessLogConfig;
            return this;
        }

        /**
         * 地址分配方式
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * 协议版本
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * 地址类型
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * 带宽包ID
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * 资源创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DNS域名
         */
        public Builder DNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }

        /**
         * 负载均衡删除保护相关信息
         */
        public Builder deletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
            this.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }

        /**
         * IPV6地址类型
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * 计费相关属性
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * 实例业务状态
         */
        public Builder loadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
            this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            return this;
        }

        /**
         * 负载均衡的版本
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * 负载均衡标识
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * 锁定原因
         */
        public Builder loadBalancerOperationLocks(java.util.List < LoadBalancerOperationLocks> loadBalancerOperationLocks) {
            this.loadBalancerOperationLocks = loadBalancerOperationLocks;
            return this;
        }

        /**
         * 实例状态
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * 负载均衡修改保护相关信息
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 企业资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 标签列表
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Vpc网络ID
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 负载均衡的可用区资源
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
             * 访问日志投递的logProject
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * 删除保护开启时间
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
             * 删除保护状态
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * 删除保护开启时间
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
             * 实例的计费类型
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
             * 锁定原因
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * 锁定类型
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
             * 设置修改保护状态的原因
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * 负载均衡修改保护状态
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
             * 实例的标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 实例的标签值
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

        @NameInMap("Ipv6Address")
        private String ipv6Address;

        private LoadBalancerAddresses(Builder builder) {
            this.address = builder.address;
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
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public static final class Builder {
            private String address; 
            private String ipv6Address; 

            /**
             * IP地址
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Ipv6地址
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
             * 固定VIP模式下，负载均衡在此可用区中的地址列表
             */
            public Builder loadBalancerAddresses(java.util.List < LoadBalancerAddresses> loadBalancerAddresses) {
                this.loadBalancerAddresses = loadBalancerAddresses;
                return this;
            }

            /**
             * 交换机标识
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * 可用区标识
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
