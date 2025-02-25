// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
         * <p>An array of CLB instances.</p>
         */
        public Builder loadBalancers(LoadBalancers loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8B9DB03B-ED39-5DB8-9C9F-1ED5F548D61E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadBalancersResponseBody build() {
            return new DescribeLoadBalancersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancersResponseBody</p>
     */
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
    /**
     * 
     * {@link DescribeLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancersResponseBody</p>
     */
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
             * <p>The endpoint of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100.XX.XX.28</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The IP version that is used by the CLB instance. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * <p>The network type of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>internet:</strong> After an Internet-facing CLB instance is created, the system assigns a public IP address to the CLB instance. Then, the CLB instance can forward requests over the Internet.</li>
             * <li><strong>intranet:</strong> After an internal-facing CLB instance is created, the system assigns a private IP address to the CLB instance. Then, the CLB instance can forward requests only over internal networks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The time when the CLB instance was created. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-02T02:49:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The timestamp when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1504147745000</p>
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled for the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>on:</strong> Deletion protection is enabled.</li>
             * <li><strong>off:</strong> Deletion protection is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder deleteProtection(String deleteProtection) {
                this.deleteProtection = deleteProtection;
                return this;
            }

            /**
             * <p>The metering method of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>PayBySpec:</strong> pay-by-specification.</li>
             * <li><strong>PayByCLCU:</strong> pay-by-LCU.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only for accounts registered on the China site (aliyun.com) and when the <strong>PayType</strong> parameter is set to <strong>PayOnDemand</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>PayBySpec</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The metering method of the Internet-facing CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>3:</strong> pay-by-bandwidth (<strong>paybybandwidth</strong>).</li>
             * <li><strong>4:</strong> pay-by-data-transfer (<strong>paybytraffic</strong>).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The metering method of Internet data transfer. Valid values:</p>
             * <ul>
             * <li><strong>paybybandwidth:</strong> pay-by-bandwidth.</li>
             * <li><strong>paybytraffic:</strong> pay-by-data-transfer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>paybybandwidth</p>
             */
            public Builder internetChargeTypeAlias(String internetChargeTypeAlias) {
                this.internetChargeTypeAlias = internetChargeTypeAlias;
                return this;
            }

            /**
             * <p>The ID of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1b6c719dfa****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1o94dp5i6ea****</p>
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * <p>The specification of the CLB instance.</p>
             * <blockquote>
             * <p> Pay-as-you-go CLB instances are not subject to specifications. <strong>slb.lcu.elastic</strong> is returned by default.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>slb.s1.small</p>
             */
            public Builder loadBalancerSpec(String loadBalancerSpec) {
                this.loadBalancerSpec = loadBalancerSpec;
                return this;
            }

            /**
             * <p>The status of the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>inactive:</strong> The CLB instance is disabled. CLB instances in the inactive state do not forward traffic.</li>
             * <li><strong>active:</strong> The CLB instance runs as expected. By default, newly created CLB instances are in the <strong>active</strong> state.</li>
             * <li><strong>locked:</strong> The CLB instance is locked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder loadBalancerStatus(String loadBalancerStatus) {
                this.loadBalancerStatus = loadBalancerStatus;
                return this;
            }

            /**
             * <p>The ID of the primary zone to which the CLB instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder masterZoneId(String masterZoneId) {
                this.masterZoneId = masterZoneId;
                return this;
            }

            /**
             * <p>The reason why the configuration read-only mode was enabled. The reason must be 1 to 80 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
             * <blockquote>
             * <p>This parameter takes effect only when you set the <code>ModificationProtectionStatus</code> parameter to <strong>ConsoleProtection</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ManagedInstance</p>
             */
            public Builder modificationProtectionReason(String modificationProtectionReason) {
                this.modificationProtectionReason = modificationProtectionReason;
                return this;
            }

            /**
             * <p>Indicates whether the configuration read-only mode is enabled for the CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>NonProtection:</strong> The configuration read-only mode is disabled. In this case, you cannot specify the ModificationProtectionReason parameter. If you specify the <code>ModificationProtectionReason</code> parameter, the value is cleared.</li>
             * <li><strong>ConsoleProtection:</strong> The configuration read-only mode is enabled.</li>
             * </ul>
             * <blockquote>
             * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot modify the configurations of the CLB instance in the CLB console. However, you can call API operations to modify the configurations of the CLB instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ConsoleProtection</p>
             */
            public Builder modificationProtectionStatus(String modificationProtectionStatus) {
                this.modificationProtectionStatus = modificationProtectionStatus;
                return this;
            }

            /**
             * <p>The network type of the internal-facing CLB instance. Valid values:</p>
             * <ul>
             * <li><strong>vpc:</strong> VPC.</li>
             * <li><strong>classic:</strong> classic network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The billing method of the CLB instance.</p>
             * <ul>
             * <li><strong>PayOnDemand</strong> is returned, which indicates the pay-as-you-go billing method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayOnDemand</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The ID of the region where the CLB instance was deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region where the CLB instance was deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou</p>
             */
            public Builder regionIdAlias(String regionIdAlias) {
                this.regionIdAlias = regionIdAlias;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3r****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the secondary zone to which the CLB instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-d</p>
             */
            public Builder slaveZoneId(String slaveZoneId) {
                this.slaveZoneId = slaveZoneId;
                return this;
            }

            /**
             * <p>The tags of the CLB instance.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the internal-facing CLB instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-255ecr****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC in which the internal-facing CLB instance was deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-25dvzy9f8****</p>
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
    /**
     * 
     * {@link DescribeLoadBalancersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancersResponseBody</p>
     */
    public static class LoadBalancers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancer")
        private java.util.List<LoadBalancer> loadBalancer;

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
        public java.util.List<LoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

        public static final class Builder {
            private java.util.List<LoadBalancer> loadBalancer; 

            /**
             * LoadBalancer.
             */
            public Builder loadBalancer(java.util.List<LoadBalancer> loadBalancer) {
                this.loadBalancer = loadBalancer;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
}
