// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipAddressesResponseBody</p>
 */
public class DescribeEipAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipAddresses")
    private EipAddresses eipAddresses;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEipAddressesResponseBody(Builder builder) {
        this.eipAddresses = builder.eipAddresses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipAddressesResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipAddresses
     */
    public EipAddresses getEipAddresses() {
        return this.eipAddresses;
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
        private EipAddresses eipAddresses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Details of the EIPs.</p>
         */
        public Builder eipAddresses(EipAddresses eipAddresses) {
            this.eipAddresses = eipAddresses;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEipAddressesResponseBody build() {
            return new DescribeEipAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class LockReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        private LockReason(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LockReason create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * <p>The reason why the EIP is locked. Valid values:</p>
             * <ul>
             * <li><strong>financial</strong>: The EIP is locked due to overdue payments.</li>
             * <li><strong>security</strong>: The EIP is locked for security reasons.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public LockReason build() {
                return new LockReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private java.util.List<LockReason> lockReason;

        private OperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public java.util.List<LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List<LockReason> lockReason; 

            /**
             * <p>The reason why the EIP is locked. Valid values:</p>
             * <ul>
             * <li><strong>financial</strong>: The EIP is locked due to overdue payments.</li>
             * <li><strong>security</strong>: The EIP is locked for security reasons.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>financial</p>
             */
            public Builder lockReason(java.util.List<LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class SecurityProtectionTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityProtectionType")
        private java.util.List<String> securityProtectionType;

        private SecurityProtectionTypes(Builder builder) {
            this.securityProtectionType = builder.securityProtectionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityProtectionTypes create() {
            return builder().build();
        }

        /**
         * @return securityProtectionType
         */
        public java.util.List<String> getSecurityProtectionType() {
            return this.securityProtectionType;
        }

        public static final class Builder {
            private java.util.List<String> securityProtectionType; 

            /**
             * SecurityProtectionType.
             */
            public Builder securityProtectionType(java.util.List<String> securityProtectionType) {
                this.securityProtectionType = securityProtectionType;
                return this;
            }

            public SecurityProtectionTypes build() {
                return new SecurityProtectionTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * <p>The tag key of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>ValueTest</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
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
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class EipAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("AllocationTime")
        private String allocationTime;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageBandwidth")
        private String bandwidthPackageBandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageType")
        private String bandwidthPackageType;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EipBandwidth")
        private String eipBandwidth;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("HDMonitorStatus")
        private String HDMonitorStatus;

        @com.aliyun.core.annotation.NameInMap("HasReservationData")
        private String hasReservationData;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceRegionId")
        private String instanceRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Netmode")
        private String netmode;

        @com.aliyun.core.annotation.NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @com.aliyun.core.annotation.NameInMap("ReservationBandwidth")
        private String reservationBandwidth;

        @com.aliyun.core.annotation.NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @com.aliyun.core.annotation.NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondLimited")
        private Boolean secondLimited;

        @com.aliyun.core.annotation.NameInMap("SecurityProtectionTypes")
        private SecurityProtectionTypes securityProtectionTypes;

        @com.aliyun.core.annotation.NameInMap("SegmentInstanceId")
        private String segmentInstanceId;

        @com.aliyun.core.annotation.NameInMap("ServiceID")
        private Long serviceID;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.allocationTime = builder.allocationTime;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageBandwidth = builder.bandwidthPackageBandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthPackageType = builder.bandwidthPackageType;
            this.bizType = builder.bizType;
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.deletionProtection = builder.deletionProtection;
            this.description = builder.description;
            this.eipBandwidth = builder.eipBandwidth;
            this.expiredTime = builder.expiredTime;
            this.HDMonitorStatus = builder.HDMonitorStatus;
            this.hasReservationData = builder.hasReservationData;
            this.ISP = builder.ISP;
            this.instanceId = builder.instanceId;
            this.instanceRegionId = builder.instanceRegionId;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.mode = builder.mode;
            this.name = builder.name;
            this.netmode = builder.netmode;
            this.operationLocks = builder.operationLocks;
            this.privateIpAddress = builder.privateIpAddress;
            this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
            this.regionId = builder.regionId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondLimited = builder.secondLimited;
            this.securityProtectionTypes = builder.securityProtectionTypes;
            this.segmentInstanceId = builder.segmentInstanceId;
            this.serviceID = builder.serviceID;
            this.serviceManaged = builder.serviceManaged;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return allocationTime
         */
        public String getAllocationTime() {
            return this.allocationTime;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackageBandwidth
         */
        public String getBandwidthPackageBandwidth() {
            return this.bandwidthPackageBandwidth;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return bandwidthPackageType
         */
        public String getBandwidthPackageType() {
            return this.bandwidthPackageType;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return eipBandwidth
         */
        public String getEipBandwidth() {
            return this.eipBandwidth;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return HDMonitorStatus
         */
        public String getHDMonitorStatus() {
            return this.HDMonitorStatus;
        }

        /**
         * @return hasReservationData
         */
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceRegionId
         */
        public String getInstanceRegionId() {
            return this.instanceRegionId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netmode
         */
        public String getNetmode() {
            return this.netmode;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return publicIpAddressPoolId
         */
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservationActiveTime
         */
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        /**
         * @return reservationBandwidth
         */
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        /**
         * @return reservationInternetChargeType
         */
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        /**
         * @return reservationOrderType
         */
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return secondLimited
         */
        public Boolean getSecondLimited() {
            return this.secondLimited;
        }

        /**
         * @return securityProtectionTypes
         */
        public SecurityProtectionTypes getSecurityProtectionTypes() {
            return this.securityProtectionTypes;
        }

        /**
         * @return segmentInstanceId
         */
        public String getSegmentInstanceId() {
            return this.segmentInstanceId;
        }

        /**
         * @return serviceID
         */
        public Long getServiceID() {
            return this.serviceID;
        }

        /**
         * @return serviceManaged
         */
        public Integer getServiceManaged() {
            return this.serviceManaged;
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

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String allocationId; 
            private String allocationTime; 
            private String bandwidth; 
            private String bandwidthPackageBandwidth; 
            private String bandwidthPackageId; 
            private String bandwidthPackageType; 
            private String bizType; 
            private String businessStatus; 
            private String chargeType; 
            private Boolean deletionProtection; 
            private String description; 
            private String eipBandwidth; 
            private String expiredTime; 
            private String HDMonitorStatus; 
            private String hasReservationData; 
            private String ISP; 
            private String instanceId; 
            private String instanceRegionId; 
            private String instanceType; 
            private String internetChargeType; 
            private String ipAddress; 
            private String mode; 
            private String name; 
            private String netmode; 
            private OperationLocks operationLocks; 
            private String privateIpAddress; 
            private String publicIpAddressPoolId; 
            private String regionId; 
            private String reservationActiveTime; 
            private String reservationBandwidth; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String resourceGroupId; 
            private Boolean secondLimited; 
            private SecurityProtectionTypes securityProtectionTypes; 
            private String segmentInstanceId; 
            private Long serviceID; 
            private Integer serviceManaged; 
            private String status; 
            private Tags tags; 
            private String vpcId; 
            private String zone; 

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-2zeerraiwb7ujcdvf****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The time when the EIP was created. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-23T01:37:38Z</p>
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the Internet Shared Bandwidth instance with which the EIP is associated. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
                this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
                return this;
            }

            /**
             * <p>The ID of the Internet Shared Bandwidth instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-bp1ego3i4j07ccdvf****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The type of the bandwidth. Only <strong>CommonBandwidthPackage</strong> may be returned, which indicates Internet Shared Bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>CommonBandwidthPackage</p>
             */
            public Builder bandwidthPackageType(String bandwidthPackageType) {
                this.bandwidthPackageType = bandwidthPackageType;
                return this;
            }

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li><strong>CloudBox</strong> Only cloud box users can select this type.</li>
             * <li><strong>Default</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudBox</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The service state of the EIP. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The billing method of the EIP. Valid values:</p>
             * <ul>
             * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
             * <li><strong>PrePaid</strong>: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The description of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the EIP when it is not associated with an Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder eipBandwidth(String eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * <p>The time when the EIP expires. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T02:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>Indicates whether fine-grained monitoring is enabled for the EIP. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder HDMonitorStatus(String HDMonitorStatus) {
                this.HDMonitorStatus = HDMonitorStatus;
                return this;
            }

            /**
             * <p>Indicates whether renewal data is included. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong> A value of <strong>true</strong> is returned only when <strong>IncludeReservationData</strong> is set to <strong>true</strong> and some orders have not taken effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * <p>The line type. Valid values:</p>
             * <ul>
             * <li><strong>BGP</strong>: BGP (Multi-ISP). The BGP (Multi-ISP) line is supported in all regions.</li>
             * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines. BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
             * </ul>
             * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see the <a href="https://help.aliyun.com/document_detail/32321.html">Line types</a> section of the &quot;What is EIP?&quot; topic.</p>
             * <p>If you are allowed to use single-ISP bandwidth, one of the following values may be returned:</p>
             * <ul>
             * <li><strong>ChinaTelecom</strong></li>
             * <li><strong>ChinaUnicom</strong></li>
             * <li><strong>ChinaMobile</strong></li>
             * <li><strong>ChinaTelecom_L2</strong></li>
             * <li><strong>ChinaUnicom_L2</strong></li>
             * <li><strong>ChinaMobile_L2</strong></li>
             * </ul>
             * <p>If your services are deployed in China East 1 Finance, <strong>BGP_FinanceCloud</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * <p>The ID of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp15zckdt37cdvf****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder instanceRegionId(String instanceRegionId) {
                this.instanceRegionId = instanceRegionId;
                return this;
            }

            /**
             * <p>The type of the associated instance. Valid values:</p>
             * <ul>
             * <li><strong>EcsInstance</strong>: an ECS instance in a VPC.</li>
             * <li><strong>SlbInstance</strong>: a CLB instance in a VPC.</li>
             * <li><strong>Nat</strong>: a NAT gateway.</li>
             * <li><strong>HaVip</strong>: an HAVIP.</li>
             * <li><strong>NetworkInterface</strong>: a secondary ENI.</li>
             * <li><strong>IpAddress</strong>: an IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EcsInstance</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The metering method of the EIP. Valid values:</p>
             * <ul>
             * <li><strong>PayByBandwidth</strong></li>
             * <li><strong>PayByTraffic</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>47.75.XX.XX</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The association mode. Valid values:</p>
             * <ul>
             * <li><strong>NAT</strong>: NAT mode</li>
             * <li><strong>MULTI_BINDED</strong>: multi-EIP-to-ENI mode</li>
             * <li><strong>BINDED</strong>: cut-through mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NAT</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The name of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>EIP-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network type. Only <strong>public</strong> may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder netmode(String netmode) {
                this.netmode = netmode;
                return this;
            }

            /**
             * <p>The details about the locked EIP.</p>
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * <p>The private IP address of the secondary ENI with which the EIP is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The ID of the IP address pool to which the EIP belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pippool-2vc0kxcedhquybdsz****</p>
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * <p>The region ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the renewal took effect. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T16:00:00Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * <p>The metering method that is used after the renewal takes effect. Valid values:</p>
             * <ul>
             * <li><strong>PayByBandwidth</strong></li>
             * <li><strong>PayByTraffic</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * <p>The type of the renewal order. Valid values:</p>
             * <ul>
             * <li><strong>RENEWCHANGE</strong>: renewal with an upgrade or a downgrade.</li>
             * <li><strong>TEMP_UPGRADE</strong>: temporary upgrade.</li>
             * <li><strong>UPGRADE</strong>: upgrade.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RENEWCHANGE</p>
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazcdxs****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether level-2 throttling is configured. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder secondLimited(Boolean secondLimited) {
                this.secondLimited = secondLimited;
                return this;
            }

            /**
             * <p>The edition of Anti-DDoS.</p>
             * <ul>
             * <li>If an empty value is returned, it indicates that Anti-DDoS Origin Basic is used.</li>
             * <li>If <strong>AntiDDoS_Enhanced</strong> is returned, it indicates that Anti-DDoS Pro/Premium is used.</li>
             * </ul>
             */
            public Builder securityProtectionTypes(SecurityProtectionTypes securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * <p>The ID of the contiguous EIP group.</p>
             * <p>This value is returned only when you query contiguous EIPs.</p>
             * 
             * <strong>example:</strong>
             * <p>eipsg-t4nr90yik5oy38xd****</p>
             */
            public Builder segmentInstanceId(String segmentInstanceId) {
                this.segmentInstanceId = segmentInstanceId;
                return this;
            }

            /**
             * <p>The ID of the service provider to which the managed instance belongs.</p>
             * <blockquote>
             * <p>This is only valid when the ServiceManaged parameter is set to True.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>197*************</p>
             */
            public Builder serviceID(Long serviceID) {
                this.serviceID = serviceID;
                return this;
            }

            /**
             * <p>Indicates whether the instance is managed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The status of the EIP. Valid values:</p>
             * <ul>
             * <li><strong>Associating</strong></li>
             * <li><strong>Unassociating</strong></li>
             * <li><strong>InUse</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Releasing</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the EIP.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC in which an IPv4 gateway is created and that is deployed in the same region as the EIP.</p>
             * <p>When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations.</p>
             * <blockquote>
             * <p> This parameter is returned if the value of <strong>InstanceType</strong> is <strong>IpAddress</strong>. In this case, the EIP is associated with an IP address.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp15zckdt37pq72zv****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone of the EIP.</p>
             * <p>This parameter is returned only when the service type is CloudBox.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipAddressesResponseBody</p>
     */
    public static class EipAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private java.util.List<EipAddress> eipAddress;

        private EipAddresses(Builder builder) {
            this.eipAddress = builder.eipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddresses create() {
            return builder().build();
        }

        /**
         * @return eipAddress
         */
        public java.util.List<EipAddress> getEipAddress() {
            return this.eipAddress;
        }

        public static final class Builder {
            private java.util.List<EipAddress> eipAddress; 

            /**
             * EipAddress.
             */
            public Builder eipAddress(java.util.List<EipAddress> eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            public EipAddresses build() {
                return new EipAddresses(this);
            } 

        } 

    }
}
