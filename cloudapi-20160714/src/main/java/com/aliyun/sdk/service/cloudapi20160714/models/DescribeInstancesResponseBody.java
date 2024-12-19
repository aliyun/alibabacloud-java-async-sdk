// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
         * <p>The information about the instances.</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEB6EC62-B6C7-5082-A45A-45A204724AC2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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
             * <p>The variable name.</p>
             * 
             * <strong>example:</strong>
             * <p>SLA</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The variable value.</p>
             * 
             * <strong>example:</strong>
             * <p>99.95%</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class InstanceSpecAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecAttribute")
        private java.util.List<SpecAttribute> specAttribute;

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
        public java.util.List<SpecAttribute> getSpecAttribute() {
            return this.specAttribute;
        }

        public static final class Builder {
            private java.util.List<SpecAttribute> specAttribute; 

            /**
             * SpecAttribute.
             */
            public Builder specAttribute(java.util.List<SpecAttribute> specAttribute) {
                this.specAttribute = specAttribute;
                return this;
            }

            public InstanceSpecAttributes build() {
                return new InstanceSpecAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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
             * <p>The CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.17.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The security group ID. Services in the same security group can access each other.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2zeehz13zcyj1kfk3o85</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zeqals6rbj51bhjn8b89</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen-d</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class NetworkInterfaceAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceAttribute")
        private java.util.List<NetworkInterfaceAttribute> networkInterfaceAttribute;

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
        public java.util.List<NetworkInterfaceAttribute> getNetworkInterfaceAttribute() {
            return this.networkInterfaceAttribute;
        }

        public static final class Builder {
            private java.util.List<NetworkInterfaceAttribute> networkInterfaceAttribute; 

            /**
             * NetworkInterfaceAttribute.
             */
            public Builder networkInterfaceAttribute(java.util.List<NetworkInterfaceAttribute> networkInterfaceAttribute) {
                this.networkInterfaceAttribute = networkInterfaceAttribute;
                return this;
            }

            public NetworkInterfaceAttributes build() {
                return new NetworkInterfaceAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class PrivateDnsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateDns")
        private java.util.List<String> privateDns;

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
        public java.util.List<String> getPrivateDns() {
            return this.privateDns;
        }

        public static final class Builder {
            private java.util.List<String> privateDns; 

            /**
             * PrivateDns.
             */
            public Builder privateDns(java.util.List<String> privateDns) {
                this.privateDns = privateDns;
                return this;
            }

            public PrivateDnsList build() {
                return new PrivateDnsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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
             * <p>The tag key of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Cookie</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List<TagInfo> tagInfo;

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
        public java.util.List<TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List<TagInfo> tagInfo; 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List<TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("NewVpcEgressAddress")
        private String newVpcEgressAddress;

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
            this.newVpcEgressAddress = builder.newVpcEgressAddress;
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
         * @return newVpcEgressAddress
         */
        public String getNewVpcEgressAddress() {
            return this.newVpcEgressAddress;
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
            private String newVpcEgressAddress; 
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
             * <p>The ACL ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-uf6f9zfxfxtp5j9ng3yv4</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The name of the access control list (ACL).</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder aclName(String aclName) {
                this.aclName = aclName;
                return this;
            }

            /**
             * <p>Indicates whether the ACL is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * <p>The ACL type. Valid values:</p>
             * <ul>
             * <li>black: blacklist</li>
             * <li>white: whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>The egress IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1</p>
             */
            public Builder classicEgressAddress(String classicEgressAddress) {
                this.classicEgressAddress = classicEgressAddress;
                return this;
            }

            /**
             * <p>The internal CIDR block of the user&quot;s VPC that can be accessed if the instance is a VPC integration instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;172.16.0.0/24&quot;,&quot;172.16.1.0/24&quot;]</p>
             */
            public Builder connectCidrBlocks(String connectCidrBlocks) {
                this.connectCidrBlocks = connectCidrBlocks;
                return this;
            }

            /**
             * <p>The ID of the user&quot;s VPC if the instance is a VPC integration instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5eo7khlb4h4f8y9egsdg</p>
             */
            public Builder connectVpcId(String connectVpcId) {
                this.connectVpcId = connectVpcId;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-22 15:36:53.0</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The type of the dedicated instance. Valid values:</p>
             * <ul>
             * <li>vpc_connect: VPC integration instance</li>
             * <li>normal: conventional dedicated instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc_connect</p>
             */
            public Builder dedicatedInstanceType(String dedicatedInstanceType) {
                this.dedicatedInstanceType = dedicatedInstanceType;
                return this;
            }

            /**
             * <p>Indicates whether outbound IPv6 traffic is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder egressIpv6Enable(Boolean egressIpv6Enable) {
                this.egressIpv6Enable = egressIpv6Enable;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1659801600000</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The HTTPS security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS2_TLS1_2</p>
             */
            public Builder httpsPolicies(String httpsPolicies) {
                this.httpsPolicies = httpsPolicies;
                return this;
            }

            /**
             * <p>The ID of the IPv6 ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-124resFfs235</p>
             */
            public Builder IPV6AclId(String IPV6AclId) {
                this.IPV6AclId = IPV6AclId;
                return this;
            }

            /**
             * <p>The name of the IPv6 ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>testIPV6</p>
             */
            public Builder IPV6AclName(String IPV6AclName) {
                this.IPV6AclName = IPV6AclName;
                return this;
            }

            /**
             * <p>Indicates whether the IPv6 ACL is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder IPV6AclStatus(String IPV6AclStatus) {
                this.IPV6AclStatus = IPV6AclStatus;
                return this;
            }

            /**
             * <p>The type of the IPv6 ACL. Valid values:</p>
             * <ul>
             * <li>black: blacklist</li>
             * <li>white: whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>black</p>
             */
            public Builder IPV6AclType(String IPV6AclType) {
                this.IPV6AclType = IPV6AclType;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li>PrePaid: subscription</li>
             * <li>PayAsYouGo: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The CIDR block of the dedicated instance.</p>
             * <ul>
             * <li>172.16.0.0/12</li>
             * <li>192.168.0.0/16</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder instanceCidrBlock(String instanceCidrBlock) {
                this.instanceCidrBlock = instanceCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the cluster to which the dedicated instance cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>apigateway-cluster-sh-1523cafbgffd</p>
             */
            public Builder instanceClusterId(String instanceClusterId) {
                this.instanceClusterId = instanceClusterId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>api-shared-vpc-020</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The requests per second (RPS) limit on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder instanceRpsLimit(Integer instanceRpsLimit) {
                this.instanceRpsLimit = instanceRpsLimit;
                return this;
            }

            /**
             * <p>The instance specification.</p>
             * 
             * <strong>example:</strong>
             * <p>api.s1.small</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The instance specification details.</p>
             */
            public Builder instanceSpecAttributes(InstanceSpecAttributes instanceSpecAttributes) {
                this.instanceSpecAttributes = instanceSpecAttributes;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>VPC_SHARED: shared instance (VPC)</li>
             * <li>VPC_DEDICATED: dedicated instance (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC_SHARED</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The outbound public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.241.89.244</p>
             */
            public Builder internetEgressAddress(String internetEgressAddress) {
                this.internetEgressAddress = internetEgressAddress;
                return this;
            }

            /**
             * <p>The internal CIDR block that is allowed to access the API Gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;172.36.0.0/16&quot;,&quot;172.31.16.0/20&quot;]</p>
             */
            public Builder intranetSegments(String intranetSegments) {
                this.intranetSegments = intranetSegments;
                return this;
            }

            /**
             * <p>The end time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>01:00Z</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>22:00Z</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The network information of the user&quot;s VPC if the instance is a VPC integration instance.</p>
             */
            public Builder networkInterfaceAttributes(NetworkInterfaceAttributes networkInterfaceAttributes) {
                this.networkInterfaceAttributes = networkInterfaceAttributes;
                return this;
            }

            /**
             * <p>The new VPC egress CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.253.0/26</p>
             */
            public Builder newVpcEgressAddress(String newVpcEgressAddress) {
                this.newVpcEgressAddress = newVpcEgressAddress;
                return this;
            }

            /**
             * <p>The private DNS list.</p>
             */
            public Builder privateDnsList(PrivateDnsList privateDnsList) {
                this.privateDnsList = privateDnsList;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 traffic is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportIpv6(Boolean supportIpv6) {
                this.supportIpv6 = supportIpv6;
                return this;
            }

            /**
             * <p>The tags of the instance.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The user VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-t<em><strong>hx</strong></em><em>yu9</em>***t0g4</p>
             */
            public Builder userVpcId(String userVpcId) {
                this.userVpcId = userVpcId;
                return this;
            }

            /**
             * <p>The user vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-t4<em><strong>eh</strong></em><em>d7q</em>***i2f</p>
             */
            public Builder userVswitchId(String userVswitchId) {
                this.userVswitchId = userVswitchId;
                return this;
            }

            /**
             * <p>The VPC egress CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.254.0/26</p>
             */
            public Builder vpcEgressAddress(String vpcEgressAddress) {
                this.vpcEgressAddress = vpcEgressAddress;
                return this;
            }

            /**
             * <p>Indicates whether VPC access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder vpcIntranetEnable(Boolean vpcIntranetEnable) {
                this.vpcIntranetEnable = vpcIntranetEnable;
                return this;
            }

            /**
             * <p>The ID of the account to which the VPC-based instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1408453217640291****</p>
             */
            public Builder vpcOwnerId(Long vpcOwnerId) {
                this.vpcOwnerId = vpcOwnerId;
                return this;
            }

            /**
             * <p>Indicates whether virtual private cloud (VPC) Server Load Balancer (SLB) is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder vpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
                this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-MAZ5(g,h)</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Multi-Availability Zone 3(b,c,a)</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceAttribute")
        private java.util.List<InstanceAttribute> instanceAttribute;

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
        public java.util.List<InstanceAttribute> getInstanceAttribute() {
            return this.instanceAttribute;
        }

        public static final class Builder {
            private java.util.List<InstanceAttribute> instanceAttribute; 

            /**
             * InstanceAttribute.
             */
            public Builder instanceAttribute(java.util.List<InstanceAttribute> instanceAttribute) {
                this.instanceAttribute = instanceAttribute;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
