// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipAddressesResponseBody</p>
 */
public class DescribeEipAddressesResponseBody extends TeaModel {
    @NameInMap("EipAddresses")
    private EipAddresses eipAddresses;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The details about the EIP.
         */
        public Builder eipAddresses(EipAddresses eipAddresses) {
            this.eipAddresses = eipAddresses;
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
         * The number of entries returned per page.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEipAddressesResponseBody build() {
            return new DescribeEipAddressesResponseBody(this);
        } 

    } 

    public static class LockReason extends TeaModel {
        @NameInMap("LockReason")
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
             * The reason why the EIP is locked. Valid values:
             * <p>
             * 
             * *   **financial**: The EIP is locked due to overdue payments.
             * *   **security**: The EIP is locked for security reasons.
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
    public static class OperationLocks extends TeaModel {
        @NameInMap("LockReason")
        private java.util.List < LockReason> lockReason;

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
        public java.util.List < LockReason> getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private java.util.List < LockReason> lockReason; 

            /**
             * The reason why the EIP is locked. Valid values:
             * <p>
             * 
             * *   **financial**: The EIP is locked due to overdue payments.
             * *   **security**: The EIP is locked for security reasons.
             */
            public Builder lockReason(java.util.List < LockReason> lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    public static class SecurityProtectionTypes extends TeaModel {
        @NameInMap("SecurityProtectionType")
        private java.util.List < String > securityProtectionType;

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
        public java.util.List < String > getSecurityProtectionType() {
            return this.securityProtectionType;
        }

        public static final class Builder {
            private java.util.List < String > securityProtectionType; 

            /**
             * SecurityProtectionType.
             */
            public Builder securityProtectionType(java.util.List < String > securityProtectionType) {
                this.securityProtectionType = securityProtectionType;
                return this;
            }

            public SecurityProtectionTypes build() {
                return new SecurityProtectionTypes(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key of the EIP.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the EIP.
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
    public static class EipAddress extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("AllocationTime")
        private String allocationTime;

        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("BandwidthPackageBandwidth")
        private String bandwidthPackageBandwidth;

        @NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @NameInMap("BandwidthPackageType")
        private String bandwidthPackageType;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @NameInMap("Description")
        private String description;

        @NameInMap("EipBandwidth")
        private String eipBandwidth;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("HDMonitorStatus")
        private String HDMonitorStatus;

        @NameInMap("HasReservationData")
        private String hasReservationData;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceRegionId")
        private String instanceRegionId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Name")
        private String name;

        @NameInMap("Netmode")
        private String netmode;

        @NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        private String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecondLimited")
        private Boolean secondLimited;

        @NameInMap("SecurityProtectionTypes")
        private SecurityProtectionTypes securityProtectionTypes;

        @NameInMap("SegmentInstanceId")
        private String segmentInstanceId;

        @NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("Zone")
        private String zone;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.allocationTime = builder.allocationTime;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageBandwidth = builder.bandwidthPackageBandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthPackageType = builder.bandwidthPackageType;
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
            this.name = builder.name;
            this.netmode = builder.netmode;
            this.operationLocks = builder.operationLocks;
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
            private String name; 
            private String netmode; 
            private OperationLocks operationLocks; 
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
            private Integer serviceManaged; 
            private String status; 
            private Tags tags; 
            private String vpcId; 
            private String zone; 

            /**
             * The ID of the EIP.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The time when the EIP was created. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * The maximum bandwidth of the EIP. Unit: Mbit/s.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The maximum bandwidth of the EIP bandwidth plan with which the EIP is associated. Unit: Mbit/s.
             */
            public Builder bandwidthPackageBandwidth(String bandwidthPackageBandwidth) {
                this.bandwidthPackageBandwidth = bandwidthPackageBandwidth;
                return this;
            }

            /**
             * The ID of the EIP bandwidth plan.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * The type of the bandwidth. Only **CommonBandwidthPackage** (EIP Bandwidth Plan) is returned.
             */
            public Builder bandwidthPackageType(String bandwidthPackageType) {
                this.bandwidthPackageType = bandwidthPackageType;
                return this;
            }

            /**
             * The service status of the EIP. Valid values:
             * <p>
             * 
             * *   **Normal**: active
             * *   **FinancialLocked**: locked
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The billing method of the EIP. Valid values:
             * <p>
             * 
             * *   **PostPaid**: pay-as-you-go
             * *   **PrePaid**: subscription
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Indicates whether deletion protection is enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The description of the EIP.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The maximum bandwidth of the EIP when it is not associated with an EIP bandwidth plan. Unit: Mbit/s.
             */
            public Builder eipBandwidth(String eipBandwidth) {
                this.eipBandwidth = eipBandwidth;
                return this;
            }

            /**
             * The time when the EIP expires. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * Indicates whether fine-grained monitoring is enabled for the EIP. Valid values:
             * <p>
             * 
             * *   **false**: no
             * *   **true**: yes
             */
            public Builder HDMonitorStatus(String HDMonitorStatus) {
                this.HDMonitorStatus = HDMonitorStatus;
                return this;
            }

            /**
             * Indicates whether renewal data is included.
             * <p>
             * 
             * *   **false**: no
             * *   **true**: yes This parameter returns **true** only when the **IncludeReservationData** parameter is set to **true** and some orders have not taken effect.
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * The line type.
             * <p>
             * 
             * *   **BGP**: BGP (Multi-ISP). All regions support BGP (Multi-ISP) EIPs.
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines. Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).
             * 
             * For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).
             * 
             * If you are allowed to use single-ISP bandwidth, one of the following values is returned:
             * 
             * *   **ChinaTelecom**: China Telecom
             * *   **ChinaUnicom**: China Unicom
             * *   **ChinaMobile**: China Mobile
             * *   **ChinaTelecom_L2**: China Telecom L2
             * *   **ChinaUnicom_L2**: China Unicom L2
             * *   **ChinaMobile_L2**: China Mobile L2
             * 
             * If your services are deployed in China East 1 Finance, **BGP_FinanceCloud** is returned.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The ID of the associated instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The region ID of the associated instance.
             */
            public Builder instanceRegionId(String instanceRegionId) {
                this.instanceRegionId = instanceRegionId;
                return this;
            }

            /**
             * The type of the associated instance. Valid values:
             * <p>
             * 
             * *   **EcsInstance**: an ECS instance in a VPC
             * *   **SlbInstance**: an SLB instance in a VPC
             * *   **Nat**: a NAT gateway
             * *   **HaVip**: an HAVIP
             * *   **NetworkInterface**: a secondary ENI
             * *   **IpAddress**: an IP address
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The metering method of the EIP. Valid values:
             * <p>
             * 
             * *   **PayByBandwidth**: pay-by-bandwidth
             * *   **PayByTraffic**: pay-by-data-transfer
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The IP address of the EIP.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The name of the EIP.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The network type. The value is set to **public**, which indicates the Internet.
             */
            public Builder netmode(String netmode) {
                this.netmode = netmode;
                return this;
            }

            /**
             * The details about the locked EIPs.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * The ID of the IP address pool to which the EIP belongs.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * The region ID of the EIP.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the renewal takes effect. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * The bandwidth after the renewal takes effect. Unit: Mbit/s.
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * The metering method that is used after the renewal takes effect. Valid values:
             * <p>
             * 
             * *   **PayByBandwidth**: pay-by-bandwidth
             * *   **PayByTraffic**: pay-by-data-transfer
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * The type of the renewal order. Valid values:
             * <p>
             * 
             * *   **RENEWCHANGE**: renewal with an upgrade or a downgrade
             * *   **TEMP_UPGRADE**: temporary upgrade
             * *   **UPGRADE**: upgrade
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
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
             * Indicates whether level-2 throttling is configured. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder secondLimited(Boolean secondLimited) {
                this.secondLimited = secondLimited;
                return this;
            }

            /**
             * The edition of Anti-DDoS. 
             * <p>
             * 
             * - If an empty value is returned, it indicates that Anti-DDoS Origin Basic is used.
             * - If **AntiDDoS_Enhanced** is returned, it indicates that Anti-DDoS Pro/Premium is used.
             */
            public Builder securityProtectionTypes(SecurityProtectionTypes securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * The IDs of contiguous EIPs.
             * <p>
             * 
             * This value is returned only when you query contiguous EIP groups.
             */
            public Builder segmentInstanceId(String segmentInstanceId) {
                this.segmentInstanceId = segmentInstanceId;
                return this;
            }

            /**
             * Indicates whether the resource is created by the service account.
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The status of the EIP. Valid values:
             * <p>
             * 
             * *   **Associating**: being associated
             * *   **Unassociating**: being disassociated
             * *   **InUse**: allocated
             * *   **Available**: available
             * *   **Releasing**: being released
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list of the EIP.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the VPC that has IPv4 gateways enabled and that is deployed in the same region as the EIP. 
             * <p>
             * 
             * When you associate an EIP with an IP address, the system can enable the IP address to access the Internet based on VPC route configurations. 
             * 
             * >  This parameter is returned if **InstanceType** is set to **IpAddress**. In this case, the EIP is associated with an IP address.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone of the EIP. 
             * <p>
             * 
             * This parameter is returned only if your account is included in the whitelist.
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
    public static class EipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        private java.util.List < EipAddress> eipAddress;

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
        public java.util.List < EipAddress> getEipAddress() {
            return this.eipAddress;
        }

        public static final class Builder {
            private java.util.List < EipAddress> eipAddress; 

            /**
             * EipAddress.
             */
            public Builder eipAddress(java.util.List < EipAddress> eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            public EipAddresses build() {
                return new EipAddresses(this);
            } 

        } 

    }
}
