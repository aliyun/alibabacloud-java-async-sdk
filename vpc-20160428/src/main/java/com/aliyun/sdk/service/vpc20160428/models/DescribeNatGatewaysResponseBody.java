// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatGatewaysResponseBody</p>
 */
public class DescribeNatGatewaysResponseBody extends TeaModel {
    @NameInMap("NatGateways")
    private NatGateways natGateways;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNatGatewaysResponseBody(Builder builder) {
        this.natGateways = builder.natGateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return natGateways
     */
    public NatGateways getNatGateways() {
        return this.natGateways;
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
        private NatGateways natGateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * NatGateways.
         */
        public Builder natGateways(NatGateways natGateways) {
            this.natGateways = natGateways;
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

        public DescribeNatGatewaysResponseBody build() {
            return new DescribeNatGatewaysResponseBody(this);
        } 

    } 

    public static class ForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        private java.util.List < String > forwardTableId;

        private ForwardTableIds(Builder builder) {
            this.forwardTableId = builder.forwardTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardTableIds create() {
            return builder().build();
        }

        /**
         * @return forwardTableId
         */
        public java.util.List < String > getForwardTableId() {
            return this.forwardTableId;
        }

        public static final class Builder {
            private java.util.List < String > forwardTableId; 

            /**
             * ForwardTableId.
             */
            public Builder forwardTableId(java.util.List < String > forwardTableId) {
                this.forwardTableId = forwardTableId;
                return this;
            }

            public ForwardTableIds build() {
                return new ForwardTableIds(this);
            } 

        } 

    }
    public static class FullNatTableIds extends TeaModel {
        @NameInMap("FullNatTableId")
        private java.util.List < String > fullNatTableId;

        private FullNatTableIds(Builder builder) {
            this.fullNatTableId = builder.fullNatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullNatTableIds create() {
            return builder().build();
        }

        /**
         * @return fullNatTableId
         */
        public java.util.List < String > getFullNatTableId() {
            return this.fullNatTableId;
        }

        public static final class Builder {
            private java.util.List < String > fullNatTableId; 

            /**
             * FullNatTableId.
             */
            public Builder fullNatTableId(java.util.List < String > fullNatTableId) {
                this.fullNatTableId = fullNatTableId;
                return this;
            }

            public FullNatTableIds build() {
                return new FullNatTableIds(this);
            } 

        } 

    }
    public static class IpList extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("SnatEntryEnabled")
        private Boolean snatEntryEnabled;

        @NameInMap("UsingStatus")
        private String usingStatus;

        private IpList(Builder builder) {
            this.allocationId = builder.allocationId;
            this.ipAddress = builder.ipAddress;
            this.privateIpAddress = builder.privateIpAddress;
            this.snatEntryEnabled = builder.snatEntryEnabled;
            this.usingStatus = builder.usingStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return snatEntryEnabled
         */
        public Boolean getSnatEntryEnabled() {
            return this.snatEntryEnabled;
        }

        /**
         * @return usingStatus
         */
        public String getUsingStatus() {
            return this.usingStatus;
        }

        public static final class Builder {
            private String allocationId; 
            private String ipAddress; 
            private String privateIpAddress; 
            private Boolean snatEntryEnabled; 
            private String usingStatus; 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * SnatEntryEnabled.
             */
            public Builder snatEntryEnabled(Boolean snatEntryEnabled) {
                this.snatEntryEnabled = snatEntryEnabled;
                return this;
            }

            /**
             * UsingStatus.
             */
            public Builder usingStatus(String usingStatus) {
                this.usingStatus = usingStatus;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
    public static class IpLists extends TeaModel {
        @NameInMap("IpList")
        private java.util.List < IpList> ipList;

        private IpLists(Builder builder) {
            this.ipList = builder.ipList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpLists create() {
            return builder().build();
        }

        /**
         * @return ipList
         */
        public java.util.List < IpList> getIpList() {
            return this.ipList;
        }

        public static final class Builder {
            private java.util.List < IpList> ipList; 

            /**
             * IpList.
             */
            public Builder ipList(java.util.List < IpList> ipList) {
                this.ipList = ipList;
                return this;
            }

            public IpLists build() {
                return new IpLists(this);
            } 

        } 

    }
    public static class NatGatewayPrivateInfo extends TeaModel {
        @NameInMap("EniInstanceId")
        private String eniInstanceId;

        @NameInMap("EniType")
        private String eniType;

        @NameInMap("IzNo")
        private String izNo;

        @NameInMap("MaxBandwidth")
        private Integer maxBandwidth;

        @NameInMap("MaxSessionEstablishRate")
        private Integer maxSessionEstablishRate;

        @NameInMap("MaxSessionQuota")
        private Integer maxSessionQuota;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("VswitchId")
        private String vswitchId;

        private NatGatewayPrivateInfo(Builder builder) {
            this.eniInstanceId = builder.eniInstanceId;
            this.eniType = builder.eniType;
            this.izNo = builder.izNo;
            this.maxBandwidth = builder.maxBandwidth;
            this.maxSessionEstablishRate = builder.maxSessionEstablishRate;
            this.maxSessionQuota = builder.maxSessionQuota;
            this.privateIpAddress = builder.privateIpAddress;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayPrivateInfo create() {
            return builder().build();
        }

        /**
         * @return eniInstanceId
         */
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        /**
         * @return eniType
         */
        public String getEniType() {
            return this.eniType;
        }

        /**
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
        }

        /**
         * @return maxBandwidth
         */
        public Integer getMaxBandwidth() {
            return this.maxBandwidth;
        }

        /**
         * @return maxSessionEstablishRate
         */
        public Integer getMaxSessionEstablishRate() {
            return this.maxSessionEstablishRate;
        }

        /**
         * @return maxSessionQuota
         */
        public Integer getMaxSessionQuota() {
            return this.maxSessionQuota;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String eniInstanceId; 
            private String eniType; 
            private String izNo; 
            private Integer maxBandwidth; 
            private Integer maxSessionEstablishRate; 
            private Integer maxSessionQuota; 
            private String privateIpAddress; 
            private String vswitchId; 

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * EniType.
             */
            public Builder eniType(String eniType) {
                this.eniType = eniType;
                return this;
            }

            /**
             * IzNo.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * MaxBandwidth.
             */
            public Builder maxBandwidth(Integer maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * MaxSessionEstablishRate.
             */
            public Builder maxSessionEstablishRate(Integer maxSessionEstablishRate) {
                this.maxSessionEstablishRate = maxSessionEstablishRate;
                return this;
            }

            /**
             * MaxSessionQuota.
             */
            public Builder maxSessionQuota(Integer maxSessionQuota) {
                this.maxSessionQuota = maxSessionQuota;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public NatGatewayPrivateInfo build() {
                return new NatGatewayPrivateInfo(this);
            } 

        } 

    }
    public static class SnatTableIds extends TeaModel {
        @NameInMap("SnatTableId")
        private java.util.List < String > snatTableId;

        private SnatTableIds(Builder builder) {
            this.snatTableId = builder.snatTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatTableIds create() {
            return builder().build();
        }

        /**
         * @return snatTableId
         */
        public java.util.List < String > getSnatTableId() {
            return this.snatTableId;
        }

        public static final class Builder {
            private java.util.List < String > snatTableId; 

            /**
             * SnatTableId.
             */
            public Builder snatTableId(java.util.List < String > snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            public SnatTableIds build() {
                return new SnatTableIds(this);
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
    public static class NatGateway extends TeaModel {
        @NameInMap("AutoPay")
        private Boolean autoPay;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsMetricEnabled")
        private Boolean ecsMetricEnabled;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("ForwardTableIds")
        private ForwardTableIds forwardTableIds;

        @NameInMap("FullNatTableIds")
        private FullNatTableIds fullNatTableIds;

        @NameInMap("IcmpReplyEnabled")
        private Boolean icmpReplyEnabled;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpLists")
        private IpLists ipLists;

        @NameInMap("Name")
        private String name;

        @NameInMap("NatGatewayId")
        private String natGatewayId;

        @NameInMap("NatGatewayPrivateInfo")
        private NatGatewayPrivateInfo natGatewayPrivateInfo;

        @NameInMap("NatType")
        private String natType;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("PrivateLinkEnabled")
        private Boolean privateLinkEnabled;

        @NameInMap("PrivateLinkMode")
        private String privateLinkMode;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityProtectionEnabled")
        private Boolean securityProtectionEnabled;

        @NameInMap("SnatTableIds")
        private SnatTableIds snatTableIds;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VpcId")
        private String vpcId;

        private NatGateway(Builder builder) {
            this.autoPay = builder.autoPay;
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.deletionProtection = builder.deletionProtection;
            this.description = builder.description;
            this.ecsMetricEnabled = builder.ecsMetricEnabled;
            this.expiredTime = builder.expiredTime;
            this.forwardTableIds = builder.forwardTableIds;
            this.fullNatTableIds = builder.fullNatTableIds;
            this.icmpReplyEnabled = builder.icmpReplyEnabled;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.ipLists = builder.ipLists;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayPrivateInfo = builder.natGatewayPrivateInfo;
            this.natType = builder.natType;
            this.networkType = builder.networkType;
            this.privateLinkEnabled = builder.privateLinkEnabled;
            this.privateLinkMode = builder.privateLinkMode;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityProtectionEnabled = builder.securityProtectionEnabled;
            this.snatTableIds = builder.snatTableIds;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateway create() {
            return builder().build();
        }

        /**
         * @return autoPay
         */
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsMetricEnabled
         */
        public Boolean getEcsMetricEnabled() {
            return this.ecsMetricEnabled;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return forwardTableIds
         */
        public ForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
        }

        /**
         * @return fullNatTableIds
         */
        public FullNatTableIds getFullNatTableIds() {
            return this.fullNatTableIds;
        }

        /**
         * @return icmpReplyEnabled
         */
        public Boolean getIcmpReplyEnabled() {
            return this.icmpReplyEnabled;
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
         * @return ipLists
         */
        public IpLists getIpLists() {
            return this.ipLists;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayPrivateInfo
         */
        public NatGatewayPrivateInfo getNatGatewayPrivateInfo() {
            return this.natGatewayPrivateInfo;
        }

        /**
         * @return natType
         */
        public String getNatType() {
            return this.natType;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return privateLinkEnabled
         */
        public Boolean getPrivateLinkEnabled() {
            return this.privateLinkEnabled;
        }

        /**
         * @return privateLinkMode
         */
        public String getPrivateLinkMode() {
            return this.privateLinkMode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityProtectionEnabled
         */
        public Boolean getSecurityProtectionEnabled() {
            return this.securityProtectionEnabled;
        }

        /**
         * @return snatTableIds
         */
        public SnatTableIds getSnatTableIds() {
            return this.snatTableIds;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Boolean autoPay; 
            private String businessStatus; 
            private String creationTime; 
            private Boolean deletionProtection; 
            private String description; 
            private Boolean ecsMetricEnabled; 
            private String expiredTime; 
            private ForwardTableIds forwardTableIds; 
            private FullNatTableIds fullNatTableIds; 
            private Boolean icmpReplyEnabled; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private IpLists ipLists; 
            private String name; 
            private String natGatewayId; 
            private NatGatewayPrivateInfo natGatewayPrivateInfo; 
            private String natType; 
            private String networkType; 
            private Boolean privateLinkEnabled; 
            private String privateLinkMode; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean securityProtectionEnabled; 
            private SnatTableIds snatTableIds; 
            private String spec; 
            private String status; 
            private Tags tags; 
            private String vpcId; 

            /**
             * AutoPay.
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EcsMetricEnabled.
             */
            public Builder ecsMetricEnabled(Boolean ecsMetricEnabled) {
                this.ecsMetricEnabled = ecsMetricEnabled;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ForwardTableIds.
             */
            public Builder forwardTableIds(ForwardTableIds forwardTableIds) {
                this.forwardTableIds = forwardTableIds;
                return this;
            }

            /**
             * FullNatTableIds.
             */
            public Builder fullNatTableIds(FullNatTableIds fullNatTableIds) {
                this.fullNatTableIds = fullNatTableIds;
                return this;
            }

            /**
             * IcmpReplyEnabled.
             */
            public Builder icmpReplyEnabled(Boolean icmpReplyEnabled) {
                this.icmpReplyEnabled = icmpReplyEnabled;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * IpLists.
             */
            public Builder ipLists(IpLists ipLists) {
                this.ipLists = ipLists;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * NatGatewayPrivateInfo.
             */
            public Builder natGatewayPrivateInfo(NatGatewayPrivateInfo natGatewayPrivateInfo) {
                this.natGatewayPrivateInfo = natGatewayPrivateInfo;
                return this;
            }

            /**
             * NatType.
             */
            public Builder natType(String natType) {
                this.natType = natType;
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
             * 默认不支持私网链接。设置为1则意味着支持私网链接
             */
            public Builder privateLinkEnabled(Boolean privateLinkEnabled) {
                this.privateLinkEnabled = privateLinkEnabled;
                return this;
            }

            /**
             * Fullnat：使用FullNat模式 Geneve：使用Geneve模式。 预估大部分场景都是非Geneve模式的。
             */
            public Builder privateLinkMode(String privateLinkMode) {
                this.privateLinkMode = privateLinkMode;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityProtectionEnabled.
             */
            public Builder securityProtectionEnabled(Boolean securityProtectionEnabled) {
                this.securityProtectionEnabled = securityProtectionEnabled;
                return this;
            }

            /**
             * SnatTableIds.
             */
            public Builder snatTableIds(SnatTableIds snatTableIds) {
                this.snatTableIds = snatTableIds;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NatGateway build() {
                return new NatGateway(this);
            } 

        } 

    }
    public static class NatGateways extends TeaModel {
        @NameInMap("NatGateway")
        private java.util.List < NatGateway> natGateway;

        private NatGateways(Builder builder) {
            this.natGateway = builder.natGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return natGateway
         */
        public java.util.List < NatGateway> getNatGateway() {
            return this.natGateway;
        }

        public static final class Builder {
            private java.util.List < NatGateway> natGateway; 

            /**
             * NatGateway.
             */
            public Builder natGateway(java.util.List < NatGateway> natGateway) {
                this.natGateway = natGateway;
                return this;
            }

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
}
