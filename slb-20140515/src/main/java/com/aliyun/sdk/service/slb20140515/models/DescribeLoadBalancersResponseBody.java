// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancersResponseBody</p>
 */
public class DescribeLoadBalancersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadBalancers")
    private LoadBalancers loadBalancers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLoadBalancersResponseBody(Builder builder) {
        this.loadBalancers = builder.loadBalancers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancersResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancers
     */
    public LoadBalancers getLoadBalancers() {
        return this.loadBalancers;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private LoadBalancers loadBalancers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array of CLB instances.
         */
        public Builder loadBalancers(LoadBalancers loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on the current page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of instances returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadBalancersResponseBody build() {
            return new DescribeLoadBalancersResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    public static class LoadBalancer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @com.aliyun.core.annotation.NameInMap("DeleteProtection")
        private String deleteProtection;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeTypeAlias")
        private String internetChargeTypeAlias;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
        private String loadBalancerSpec;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
        private String loadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("MasterZoneId")
        private String masterZoneId;

        @com.aliyun.core.annotation.NameInMap("ModificationProtectionReason")
        private String modificationProtectionReason;

        @com.aliyun.core.annotation.NameInMap("ModificationProtectionStatus")
        private String modificationProtectionStatus;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionIdAlias")
        private String regionIdAlias;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SlaveZoneId")
        private String slaveZoneId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private LoadBalancer(Builder builder) {
            this.address = builder.address;
            this.addressIPVersion = builder.addressIPVersion;
            this.addressType = builder.addressType;
            this.bandwidth = builder.bandwidth;
            this.createTime = builder.createTime;
            this.createTimeStamp = builder.createTimeStamp;
            this.deleteProtection = builder.deleteProtection;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.internetChargeTypeAlias = builder.internetChargeTypeAlias;
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
            this.resourceGroupId = builder.resourceGroupId;
            this.slaveZoneId = builder.slaveZoneId;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancer create() {
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
         * @return internetChargeTypeAlias
         */
        public String getInternetChargeTypeAlias() {
            return this.internetChargeTypeAlias;
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
            private Integer bandwidth; 
            private String createTime; 
            private Long createTimeStamp; 
            private String deleteProtection; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private String internetChargeTypeAlias; 
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
            private String resourceGroupId; 
            private String slaveZoneId; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The endpoint of the CLB instance.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The IP version that is used by the CLB instance. Valid values: **ipv4** and **ipv6**.
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * The network type of the CLB instance. Valid values:
             * <p>
             * 
             * *   **internet:** After an Internet-facing CLB instance is created, the system assigns a public IP address to the CLB instance. Then, the CLB instance can forward requests over the Internet.
             * *   **intranet:** After an internal-facing CLB instance is created, the system assigns a private IP address to the CLB instance. Then, the CLB instance can forward requests only over internal networks.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:
             * <p>
             * 
             * *   **-1:** For a pay-by-data-transfer Internet-facing CLB instance, this value is set to -1. This indicates that the bandwidth is unlimited.
             * *   **1 to 5120:** For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth for each listener. The sum of the maximum bandwidth of all listeners cannot exceed the maximum bandwidth of the CLB instance.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The time when the CLB instance was created. The time follows the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The timestamp when the instance was created.
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * Indicates whether deletion protection is enabled for the CLB instance. Valid values:
             * <p>
             * 
             * *   **on:** Deletion protection is enabled.
             * *   **off:** Deletion protection is disabled.
             */
            public Builder deleteProtection(String deleteProtection) {
                this.deleteProtection = deleteProtection;
                return this;
            }

            /**
             * The metering method of the CLB instance. Valid values:
             * <p>
             * 
             * *   **PayBySpec:** pay-by-specification.
             * *   **PayByCLCU:** pay-by-LCU.
             * 
             * >  This parameter takes effect only for accounts registered on the China site (aliyun.com) and when the **PayType** parameter is set to **PayOnDemand**.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The metering method of the Internet-facing CLB instance. Valid values:
             * <p>
             * 
             * *   **3:** pay-by-bandwidth (**paybybandwidth**).
             * *   **4:** pay-by-data-transfer (**paybytraffic**).
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The metering method of Internet data transfer. Valid values:
             * <p>
             * 
             * *   **paybybandwidth:** pay-by-bandwidth.
             * *   **paybytraffic:** pay-by-data-transfer.
             */
            public Builder internetChargeTypeAlias(String internetChargeTypeAlias) {
                this.internetChargeTypeAlias = internetChargeTypeAlias;
                return this;
            }

            /**
             * The ID of the CLB instance.
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
             * *   **inactive:** The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.
             * *   **active:** The CLB instance runs as expected. By default, newly created CLB instances are in the **active** state.
             * *   **locked:** The CLB instance is locked.
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
             * The reason why the configuration read-only mode was enabled. The reason must be 1 to 80 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.
             * <p>
             * 
             * > This parameter takes effect only when you set the `ModificationProtectionStatus` parameter to **ConsoleProtection**.
             */
            public Builder modificationProtectionReason(String modificationProtectionReason) {
                this.modificationProtectionReason = modificationProtectionReason;
                return this;
            }

            /**
             * Indicates whether the configuration read-only mode is enabled for the CLB instance. Valid values:
             * <p>
             * 
             * *   **NonProtection:** The configuration read-only mode is disabled. In this case, you cannot specify the ModificationProtectionReason parameter. If you specify the `ModificationProtectionReason` parameter, the value is cleared.
             * *   **ConsoleProtection:** The configuration read-only mode is enabled.
             * 
             * >  If you set this parameter to **ConsoleProtection**, you cannot modify the configurations of the CLB instance in the CLB console. However, you can call API operations to modify the configurations of the CLB instance.
             */
            public Builder modificationProtectionStatus(String modificationProtectionStatus) {
                this.modificationProtectionStatus = modificationProtectionStatus;
                return this;
            }

            /**
             * The network type of the internal-facing CLB instance. Valid values:
             * <p>
             * 
             * *   **vpc:** VPC.
             * *   **classic:** classic network.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The billing method of the CLB instance.
             * <p>
             * 
             * *   **PayOnDemand** is returned, which indicates the pay-as-you-go billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The ID of the region where the CLB instance was deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The region where the CLB instance was deployed.
             */
            public Builder regionIdAlias(String regionIdAlias) {
                this.regionIdAlias = regionIdAlias;
                return this;
            }

            /**
             * The ID of the resource group.
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
             * The tags of the CLB instance.
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
             * The ID of the VPC in which the internal-facing CLB instance was deployed.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public LoadBalancer build() {
                return new LoadBalancer(this);
            } 

        } 

    }
    public static class LoadBalancers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancer")
        private java.util.List < LoadBalancer> loadBalancer;

        private LoadBalancers(Builder builder) {
            this.loadBalancer = builder.loadBalancer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancers create() {
            return builder().build();
        }

        /**
         * @return loadBalancer
         */
        public java.util.List < LoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

        public static final class Builder {
            private java.util.List < LoadBalancer> loadBalancer; 

            /**
             * LoadBalancer.
             */
            public Builder loadBalancer(java.util.List < LoadBalancer> loadBalancer) {
                this.loadBalancer = loadBalancer;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
}
