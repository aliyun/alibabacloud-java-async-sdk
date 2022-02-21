// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancersResponseBody</p>
 */
public class DescribeLoadBalancersResponseBody extends TeaModel {
    @NameInMap("LoadBalancers")
    private LoadBalancers loadBalancers;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * LoadBalancers.
         */
        public Builder loadBalancers(LoadBalancers loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
    public static class LoadBalancer extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @NameInMap("AddressType")
        private String addressType;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @NameInMap("DeleteProtection")
        private String deleteProtection;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("InternetChargeTypeAlias")
        private String internetChargeTypeAlias;

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

        private LoadBalancer(Builder builder) {
            this.address = builder.address;
            this.addressIPVersion = builder.addressIPVersion;
            this.addressType = builder.addressType;
            this.bandwidth = builder.bandwidth;
            this.createTime = builder.createTime;
            this.createTimeStamp = builder.createTimeStamp;
            this.deleteProtection = builder.deleteProtection;
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
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * InternetChargeTypeAlias.
             */
            public Builder internetChargeTypeAlias(String internetChargeTypeAlias) {
                this.internetChargeTypeAlias = internetChargeTypeAlias;
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
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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

            public LoadBalancer build() {
                return new LoadBalancer(this);
            } 

        } 

    }
    public static class LoadBalancers extends TeaModel {
        @NameInMap("LoadBalancer")
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
