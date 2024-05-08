// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
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
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
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

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class SpecAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SpecAttribute(Builder builder) {
            this.localName = builder.localName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecAttribute create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String localName; 
            private String value; 

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SpecAttribute build() {
                return new SpecAttribute(this);
            } 

        } 

    }
    public static class InstanceSpecAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecAttribute")
        private java.util.List < SpecAttribute> specAttribute;

        private InstanceSpecAttributes(Builder builder) {
            this.specAttribute = builder.specAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpecAttributes create() {
            return builder().build();
        }

        /**
         * @return specAttribute
         */
        public java.util.List < SpecAttribute> getSpecAttribute() {
            return this.specAttribute;
        }

        public static final class Builder {
            private java.util.List < SpecAttribute> specAttribute; 

            /**
             * SpecAttribute.
             */
            public Builder specAttribute(java.util.List < SpecAttribute> specAttribute) {
                this.specAttribute = specAttribute;
                return this;
            }

            public InstanceSpecAttributes build() {
                return new InstanceSpecAttributes(this);
            } 

        } 

    }
    public static class NetworkInterfaceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private NetworkInterfaceAttribute(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.securityGroupId = builder.securityGroupId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceAttribute create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String securityGroupId; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * vSwitch的网段。
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * 安全组的ID，同一个安全组内的服务可以互相访问。
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * 虚拟交换机ID
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * 可用区ID
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public NetworkInterfaceAttribute build() {
                return new NetworkInterfaceAttribute(this);
            } 

        } 

    }
    public static class NetworkInterfaceAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceAttribute")
        private java.util.List < NetworkInterfaceAttribute> networkInterfaceAttribute;

        private NetworkInterfaceAttributes(Builder builder) {
            this.networkInterfaceAttribute = builder.networkInterfaceAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceAttributes create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceAttribute
         */
        public java.util.List < NetworkInterfaceAttribute> getNetworkInterfaceAttribute() {
            return this.networkInterfaceAttribute;
        }

        public static final class Builder {
            private java.util.List < NetworkInterfaceAttribute> networkInterfaceAttribute; 

            /**
             * NetworkInterfaceAttribute.
             */
            public Builder networkInterfaceAttribute(java.util.List < NetworkInterfaceAttribute> networkInterfaceAttribute) {
                this.networkInterfaceAttribute = networkInterfaceAttribute;
                return this;
            }

            public NetworkInterfaceAttributes build() {
                return new NetworkInterfaceAttributes(this);
            } 

        } 

    }
    public static class PrivateDnsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateDns")
        private java.util.List < String > privateDns;

        private PrivateDnsList(Builder builder) {
            this.privateDns = builder.privateDns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateDnsList create() {
            return builder().build();
        }

        /**
         * @return privateDns
         */
        public java.util.List < String > getPrivateDns() {
            return this.privateDns;
        }

        public static final class Builder {
            private java.util.List < String > privateDns; 

            /**
             * PrivateDns.
             */
            public Builder privateDns(java.util.List < String > privateDns) {
                this.privateDns = privateDns;
                return this;
            }

            public PrivateDnsList build() {
                return new PrivateDnsList(this);
            } 

        } 

    }
    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List < TagInfo> tagInfo;

        private Tags(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List < TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List < TagInfo> tagInfo; 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class InstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclName")
        private String aclName;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("ClassicEgressAddress")
        private String classicEgressAddress;

        @com.aliyun.core.annotation.NameInMap("ConnectCidrBlocks")
        private String connectCidrBlocks;

        @com.aliyun.core.annotation.NameInMap("ConnectVpcId")
        private String connectVpcId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DedicatedInstanceType")
        private String dedicatedInstanceType;

        @com.aliyun.core.annotation.NameInMap("EgressIpv6Enable")
        private Boolean egressIpv6Enable;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("HttpsPolicies")
        private String httpsPolicies;

        @com.aliyun.core.annotation.NameInMap("IPV6AclId")
        private String IPV6AclId;

        @com.aliyun.core.annotation.NameInMap("IPV6AclName")
        private String IPV6AclName;

        @com.aliyun.core.annotation.NameInMap("IPV6AclStatus")
        private String IPV6AclStatus;

        @com.aliyun.core.annotation.NameInMap("IPV6AclType")
        private String IPV6AclType;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceCidrBlock")
        private String instanceCidrBlock;

        @com.aliyun.core.annotation.NameInMap("InstanceClusterId")
        private String instanceClusterId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceRpsLimit")
        private Integer instanceRpsLimit;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("InstanceSpecAttributes")
        private InstanceSpecAttributes instanceSpecAttributes;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetEgressAddress")
        private String internetEgressAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetSegments")
        private String intranetSegments;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceAttributes")
        private NetworkInterfaceAttributes networkInterfaceAttributes;

        @com.aliyun.core.annotation.NameInMap("PrivateDnsList")
        private PrivateDnsList privateDnsList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportIpv6")
        private Boolean supportIpv6;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UserVpcId")
        private String userVpcId;

        @com.aliyun.core.annotation.NameInMap("UserVswitchId")
        private String userVswitchId;

        @com.aliyun.core.annotation.NameInMap("VpcEgressAddress")
        private String vpcEgressAddress;

        @com.aliyun.core.annotation.NameInMap("VpcIntranetEnable")
        private Boolean vpcIntranetEnable;

        @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
        private Long vpcOwnerId;

        @com.aliyun.core.annotation.NameInMap("VpcSlbIntranetEnable")
        private Boolean vpcSlbIntranetEnable;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneLocalName")
        private String zoneLocalName;

        private InstanceAttribute(Builder builder) {
            this.aclId = builder.aclId;
            this.aclName = builder.aclName;
            this.aclStatus = builder.aclStatus;
            this.aclType = builder.aclType;
            this.classicEgressAddress = builder.classicEgressAddress;
            this.connectCidrBlocks = builder.connectCidrBlocks;
            this.connectVpcId = builder.connectVpcId;
            this.createdTime = builder.createdTime;
            this.dedicatedInstanceType = builder.dedicatedInstanceType;
            this.egressIpv6Enable = builder.egressIpv6Enable;
            this.expiredTime = builder.expiredTime;
            this.httpsPolicies = builder.httpsPolicies;
            this.IPV6AclId = builder.IPV6AclId;
            this.IPV6AclName = builder.IPV6AclName;
            this.IPV6AclStatus = builder.IPV6AclStatus;
            this.IPV6AclType = builder.IPV6AclType;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceCidrBlock = builder.instanceCidrBlock;
            this.instanceClusterId = builder.instanceClusterId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRpsLimit = builder.instanceRpsLimit;
            this.instanceSpec = builder.instanceSpec;
            this.instanceSpecAttributes = builder.instanceSpecAttributes;
            this.instanceType = builder.instanceType;
            this.internetEgressAddress = builder.internetEgressAddress;
            this.intranetSegments = builder.intranetSegments;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.networkInterfaceAttributes = builder.networkInterfaceAttributes;
            this.privateDnsList = builder.privateDnsList;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.supportIpv6 = builder.supportIpv6;
            this.tags = builder.tags;
            this.userVpcId = builder.userVpcId;
            this.userVswitchId = builder.userVswitchId;
            this.vpcEgressAddress = builder.vpcEgressAddress;
            this.vpcIntranetEnable = builder.vpcIntranetEnable;
            this.vpcOwnerId = builder.vpcOwnerId;
            this.vpcSlbIntranetEnable = builder.vpcSlbIntranetEnable;
            this.zoneId = builder.zoneId;
            this.zoneLocalName = builder.zoneLocalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return aclName
         */
        public String getAclName() {
            return this.aclName;
        }

        /**
         * @return aclStatus
         */
        public String getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return classicEgressAddress
         */
        public String getClassicEgressAddress() {
            return this.classicEgressAddress;
        }

        /**
         * @return connectCidrBlocks
         */
        public String getConnectCidrBlocks() {
            return this.connectCidrBlocks;
        }

        /**
         * @return connectVpcId
         */
        public String getConnectVpcId() {
            return this.connectVpcId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dedicatedInstanceType
         */
        public String getDedicatedInstanceType() {
            return this.dedicatedInstanceType;
        }

        /**
         * @return egressIpv6Enable
         */
        public Boolean getEgressIpv6Enable() {
            return this.egressIpv6Enable;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return httpsPolicies
         */
        public String getHttpsPolicies() {
            return this.httpsPolicies;
        }

        /**
         * @return IPV6AclId
         */
        public String getIPV6AclId() {
            return this.IPV6AclId;
        }

        /**
         * @return IPV6AclName
         */
        public String getIPV6AclName() {
            return this.IPV6AclName;
        }

        /**
         * @return IPV6AclStatus
         */
        public String getIPV6AclStatus() {
            return this.IPV6AclStatus;
        }

        /**
         * @return IPV6AclType
         */
        public String getIPV6AclType() {
            return this.IPV6AclType;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceCidrBlock
         */
        public String getInstanceCidrBlock() {
            return this.instanceCidrBlock;
        }

        /**
         * @return instanceClusterId
         */
        public String getInstanceClusterId() {
            return this.instanceClusterId;
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
         * @return instanceRpsLimit
         */
        public Integer getInstanceRpsLimit() {
            return this.instanceRpsLimit;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return instanceSpecAttributes
         */
        public InstanceSpecAttributes getInstanceSpecAttributes() {
            return this.instanceSpecAttributes;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetEgressAddress
         */
        public String getInternetEgressAddress() {
            return this.internetEgressAddress;
        }

        /**
         * @return intranetSegments
         */
        public String getIntranetSegments() {
            return this.intranetSegments;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        /**
         * @return networkInterfaceAttributes
         */
        public NetworkInterfaceAttributes getNetworkInterfaceAttributes() {
            return this.networkInterfaceAttributes;
        }

        /**
         * @return privateDnsList
         */
        public PrivateDnsList getPrivateDnsList() {
            return this.privateDnsList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportIpv6
         */
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return userVpcId
         */
        public String getUserVpcId() {
            return this.userVpcId;
        }

        /**
         * @return userVswitchId
         */
        public String getUserVswitchId() {
            return this.userVswitchId;
        }

        /**
         * @return vpcEgressAddress
         */
        public String getVpcEgressAddress() {
            return this.vpcEgressAddress;
        }

        /**
         * @return vpcIntranetEnable
         */
        public Boolean getVpcIntranetEnable() {
            return this.vpcIntranetEnable;
        }

        /**
         * @return vpcOwnerId
         */
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        /**
         * @return vpcSlbIntranetEnable
         */
        public Boolean getVpcSlbIntranetEnable() {
            return this.vpcSlbIntranetEnable;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneLocalName
         */
        public String getZoneLocalName() {
            return this.zoneLocalName;
        }

        public static final class Builder {
            private String aclId; 
            private String aclName; 
            private String aclStatus; 
            private String aclType; 
            private String classicEgressAddress; 
            private String connectCidrBlocks; 
            private String connectVpcId; 
            private String createdTime; 
            private String dedicatedInstanceType; 
            private Boolean egressIpv6Enable; 
            private String expiredTime; 
            private String httpsPolicies; 
            private String IPV6AclId; 
            private String IPV6AclName; 
            private String IPV6AclStatus; 
            private String IPV6AclType; 
            private String instanceChargeType; 
            private String instanceCidrBlock; 
            private String instanceClusterId; 
            private String instanceId; 
            private String instanceName; 
            private Integer instanceRpsLimit; 
            private String instanceSpec; 
            private InstanceSpecAttributes instanceSpecAttributes; 
            private String instanceType; 
            private String internetEgressAddress; 
            private String intranetSegments; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private NetworkInterfaceAttributes networkInterfaceAttributes; 
            private PrivateDnsList privateDnsList; 
            private String regionId; 
            private String status; 
            private Boolean supportIpv6; 
            private Tags tags; 
            private String userVpcId; 
            private String userVswitchId; 
            private String vpcEgressAddress; 
            private Boolean vpcIntranetEnable; 
            private Long vpcOwnerId; 
            private Boolean vpcSlbIntranetEnable; 
            private String zoneId; 
            private String zoneLocalName; 

            /**
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * AclName.
             */
            public Builder aclName(String aclName) {
                this.aclName = aclName;
                return this;
            }

            /**
             * AclStatus.
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * ClassicEgressAddress.
             */
            public Builder classicEgressAddress(String classicEgressAddress) {
                this.classicEgressAddress = classicEgressAddress;
                return this;
            }

            /**
             * ConnectCidrBlocks.
             */
            public Builder connectCidrBlocks(String connectCidrBlocks) {
                this.connectCidrBlocks = connectCidrBlocks;
                return this;
            }

            /**
             * VPC融合类型专享实例联通的用户VPC ID
             */
            public Builder connectVpcId(String connectVpcId) {
                this.connectVpcId = connectVpcId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * 专享实例类型
             * <p>
             * - vpc_connect：VPC融合类型专享实例
             * - normal：传统类型专享实例
             */
            public Builder dedicatedInstanceType(String dedicatedInstanceType) {
                this.dedicatedInstanceType = dedicatedInstanceType;
                return this;
            }

            /**
             * EgressIpv6Enable.
             */
            public Builder egressIpv6Enable(Boolean egressIpv6Enable) {
                this.egressIpv6Enable = egressIpv6Enable;
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
             * HttpsPolicies.
             */
            public Builder httpsPolicies(String httpsPolicies) {
                this.httpsPolicies = httpsPolicies;
                return this;
            }

            /**
             * IPV6AclId.
             */
            public Builder IPV6AclId(String IPV6AclId) {
                this.IPV6AclId = IPV6AclId;
                return this;
            }

            /**
             * IPV6AclName.
             */
            public Builder IPV6AclName(String IPV6AclName) {
                this.IPV6AclName = IPV6AclName;
                return this;
            }

            /**
             * IPV6AclStatus.
             */
            public Builder IPV6AclStatus(String IPV6AclStatus) {
                this.IPV6AclStatus = IPV6AclStatus;
                return this;
            }

            /**
             * IPV6AclType.
             */
            public Builder IPV6AclType(String IPV6AclType) {
                this.IPV6AclType = IPV6AclType;
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
             * 专享实例所在网段
             * <p>
             * - 172.16.0.0/12
             * - 192.168.0.0/16
             */
            public Builder instanceCidrBlock(String instanceCidrBlock) {
                this.instanceCidrBlock = instanceCidrBlock;
                return this;
            }

            /**
             * InstanceClusterId.
             */
            public Builder instanceClusterId(String instanceClusterId) {
                this.instanceClusterId = instanceClusterId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceRpsLimit.
             */
            public Builder instanceRpsLimit(Integer instanceRpsLimit) {
                this.instanceRpsLimit = instanceRpsLimit;
                return this;
            }

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * InstanceSpecAttributes.
             */
            public Builder instanceSpecAttributes(InstanceSpecAttributes instanceSpecAttributes) {
                this.instanceSpecAttributes = instanceSpecAttributes;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetEgressAddress.
             */
            public Builder internetEgressAddress(String internetEgressAddress) {
                this.internetEgressAddress = internetEgressAddress;
                return this;
            }

            /**
             * IntranetSegments.
             */
            public Builder intranetSegments(String intranetSegments) {
                this.intranetSegments = intranetSegments;
                return this;
            }

            /**
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * VPC融合类型专享实例连通的用户VPC内的网络信息
             */
            public Builder networkInterfaceAttributes(NetworkInterfaceAttributes networkInterfaceAttributes) {
                this.networkInterfaceAttributes = networkInterfaceAttributes;
                return this;
            }

            /**
             * PrivateDnsList.
             */
            public Builder privateDnsList(PrivateDnsList privateDnsList) {
                this.privateDnsList = privateDnsList;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupportIpv6.
             */
            public Builder supportIpv6(Boolean supportIpv6) {
                this.supportIpv6 = supportIpv6;
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
             * UserVpcId.
             */
            public Builder userVpcId(String userVpcId) {
                this.userVpcId = userVpcId;
                return this;
            }

            /**
             * UserVswitchId.
             */
            public Builder userVswitchId(String userVswitchId) {
                this.userVswitchId = userVswitchId;
                return this;
            }

            /**
             * VpcEgressAddress.
             */
            public Builder vpcEgressAddress(String vpcEgressAddress) {
                this.vpcEgressAddress = vpcEgressAddress;
                return this;
            }

            /**
             * VpcIntranetEnable.
             */
            public Builder vpcIntranetEnable(Boolean vpcIntranetEnable) {
                this.vpcIntranetEnable = vpcIntranetEnable;
                return this;
            }

            /**
             * VpcOwnerId.
             */
            public Builder vpcOwnerId(Long vpcOwnerId) {
                this.vpcOwnerId = vpcOwnerId;
                return this;
            }

            /**
             * VpcSlbIntranetEnable.
             */
            public Builder vpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
                this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
                return this;
            }

            /**
             * 可用区ID
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneLocalName.
             */
            public Builder zoneLocalName(String zoneLocalName) {
                this.zoneLocalName = zoneLocalName;
                return this;
            }

            public InstanceAttribute build() {
                return new InstanceAttribute(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceAttribute")
        private java.util.List < InstanceAttribute> instanceAttribute;

        private Instances(Builder builder) {
            this.instanceAttribute = builder.instanceAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceAttribute
         */
        public java.util.List < InstanceAttribute> getInstanceAttribute() {
            return this.instanceAttribute;
        }

        public static final class Builder {
            private java.util.List < InstanceAttribute> instanceAttribute; 

            /**
             * InstanceAttribute.
             */
            public Builder instanceAttribute(java.util.List < InstanceAttribute> instanceAttribute) {
                this.instanceAttribute = instanceAttribute;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
