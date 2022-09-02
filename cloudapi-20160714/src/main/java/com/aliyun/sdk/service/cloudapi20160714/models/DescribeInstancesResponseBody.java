// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("Value")
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
        @NameInMap("SpecAttribute")
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
    public static class InstanceAttribute extends TeaModel {
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("AclName")
        private String aclName;

        @NameInMap("AclStatus")
        private String aclStatus;

        @NameInMap("AclType")
        private String aclType;

        @NameInMap("ClassicEgressAddress")
        private String classicEgressAddress;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("EgressIpv6Enable")
        private Boolean egressIpv6Enable;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("HttpsPolicies")
        private String httpsPolicies;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceRpsLimit")
        private Integer instanceRpsLimit;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("InstanceSpecAttributes")
        private InstanceSpecAttributes instanceSpecAttributes;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetEgressAddress")
        private String internetEgressAddress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportIpv6")
        private Boolean supportIpv6;

        @NameInMap("UserVpcId")
        private String userVpcId;

        @NameInMap("UserVswitchId")
        private String userVswitchId;

        @NameInMap("VipTypeList")
        private String vipTypeList;

        @NameInMap("VpcEgressAddress")
        private String vpcEgressAddress;

        @NameInMap("VpcIntranetEnable")
        private Boolean vpcIntranetEnable;

        @NameInMap("VpcOwnerId")
        private Long vpcOwnerId;

        @NameInMap("VpcSlbIntranetEnable")
        private Boolean vpcSlbIntranetEnable;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneLocalName")
        private String zoneLocalName;

        private InstanceAttribute(Builder builder) {
            this.aclId = builder.aclId;
            this.aclName = builder.aclName;
            this.aclStatus = builder.aclStatus;
            this.aclType = builder.aclType;
            this.classicEgressAddress = builder.classicEgressAddress;
            this.createdTime = builder.createdTime;
            this.egressIpv6Enable = builder.egressIpv6Enable;
            this.expiredTime = builder.expiredTime;
            this.httpsPolicies = builder.httpsPolicies;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceRpsLimit = builder.instanceRpsLimit;
            this.instanceSpec = builder.instanceSpec;
            this.instanceSpecAttributes = builder.instanceSpecAttributes;
            this.instanceType = builder.instanceType;
            this.internetEgressAddress = builder.internetEgressAddress;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.supportIpv6 = builder.supportIpv6;
            this.userVpcId = builder.userVpcId;
            this.userVswitchId = builder.userVswitchId;
            this.vipTypeList = builder.vipTypeList;
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
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
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
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
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
         * @return vipTypeList
         */
        public String getVipTypeList() {
            return this.vipTypeList;
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
            private String createdTime; 
            private Boolean egressIpv6Enable; 
            private String expiredTime; 
            private String httpsPolicies; 
            private String instanceChargeType; 
            private String instanceId; 
            private String instanceName; 
            private Integer instanceRpsLimit; 
            private String instanceSpec; 
            private InstanceSpecAttributes instanceSpecAttributes; 
            private String instanceType; 
            private String internetEgressAddress; 
            private String regionId; 
            private String status; 
            private Boolean supportIpv6; 
            private String userVpcId; 
            private String userVswitchId; 
            private String vipTypeList; 
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
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * VipTypeList.
             */
            public Builder vipTypeList(String vipTypeList) {
                this.vipTypeList = vipTypeList;
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
             * ZoneId.
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
        @NameInMap("InstanceAttribute")
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
