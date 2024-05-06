// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonBandwidthPackagesResponseBody</p>
 */
public class DescribeCommonBandwidthPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommonBandwidthPackages")
    private CommonBandwidthPackages commonBandwidthPackages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCommonBandwidthPackagesResponseBody(Builder builder) {
        this.commonBandwidthPackages = builder.commonBandwidthPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonBandwidthPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return commonBandwidthPackages
     */
    public CommonBandwidthPackages getCommonBandwidthPackages() {
        return this.commonBandwidthPackages;
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
        private CommonBandwidthPackages commonBandwidthPackages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the Internet Shared Bandwidth instance.
         */
        public Builder commonBandwidthPackages(CommonBandwidthPackages commonBandwidthPackages) {
            this.commonBandwidthPackages = commonBandwidthPackages;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
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

        public DescribeCommonBandwidthPackagesResponseBody build() {
            return new DescribeCommonBandwidthPackagesResponseBody(this);
        } 

    } 

    public static class PublicIpAddresse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageIpRelationStatus")
        private String bandwidthPackageIpRelationStatus;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        private PublicIpAddresse(Builder builder) {
            this.allocationId = builder.allocationId;
            this.bandwidthPackageIpRelationStatus = builder.bandwidthPackageIpRelationStatus;
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddresse create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return bandwidthPackageIpRelationStatus
         */
        public String getBandwidthPackageIpRelationStatus() {
            return this.bandwidthPackageIpRelationStatus;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private String allocationId; 
            private String bandwidthPackageIpRelationStatus; 
            private String ipAddress; 

            /**
             * The ID of the EIP.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * Indicates whether the EIP is associated with the Internet Shared Bandwidth instance. Valid values:
             * <p>
             * 
             * *   **BINDED**
             * *   **BINDING**
             */
            public Builder bandwidthPackageIpRelationStatus(String bandwidthPackageIpRelationStatus) {
                this.bandwidthPackageIpRelationStatus = bandwidthPackageIpRelationStatus;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PublicIpAddresse build() {
                return new PublicIpAddresse(this);
            } 

        } 

    }
    public static class PublicIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublicIpAddresse")
        private java.util.List < PublicIpAddresse> publicIpAddresse;

        private PublicIpAddresses(Builder builder) {
            this.publicIpAddresse = builder.publicIpAddresse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddresses create() {
            return builder().build();
        }

        /**
         * @return publicIpAddresse
         */
        public java.util.List < PublicIpAddresse> getPublicIpAddresse() {
            return this.publicIpAddresse;
        }

        public static final class Builder {
            private java.util.List < PublicIpAddresse> publicIpAddresse; 

            /**
             * PublicIpAddresse.
             */
            public Builder publicIpAddresse(java.util.List < PublicIpAddresse> publicIpAddresse) {
                this.publicIpAddresse = publicIpAddresse;
                return this;
            }

            public PublicIpAddresses build() {
                return new PublicIpAddresses(this);
            } 

        } 

    }
    public static class SecurityProtectionTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityProtectionType")
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
             * The tag key that is added to the Internet Shared Bandwidth instance.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value that is added to the Internet Shared Bandwidth instance.
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
    public static class CommonBandwidthPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("HasReservationData")
        private String hasReservationData;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddresses")
        private PublicIpAddresses publicIpAddresses;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private Integer ratio;

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

        @com.aliyun.core.annotation.NameInMap("SecurityProtectionTypes")
        private SecurityProtectionTypes securityProtectionTypes;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private CommonBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bizType = builder.bizType;
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.deletionProtection = builder.deletionProtection;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.hasReservationData = builder.hasReservationData;
            this.ISP = builder.ISP;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.name = builder.name;
            this.publicIpAddresses = builder.publicIpAddresses;
            this.ratio = builder.ratio;
            this.regionId = builder.regionId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityProtectionTypes = builder.securityProtectionTypes;
            this.serviceManaged = builder.serviceManaged;
            this.status = builder.status;
            this.tags = builder.tags;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publicIpAddresses
         */
        public PublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        /**
         * @return ratio
         */
        public Integer getRatio() {
            return this.ratio;
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
         * @return securityProtectionTypes
         */
        public SecurityProtectionTypes getSecurityProtectionTypes() {
            return this.securityProtectionTypes;
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
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String bandwidth; 
            private String bandwidthPackageId; 
            private String bizType; 
            private String businessStatus; 
            private String creationTime; 
            private Boolean deletionProtection; 
            private String description; 
            private String expiredTime; 
            private String hasReservationData; 
            private String ISP; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private String name; 
            private PublicIpAddresses publicIpAddresses; 
            private Integer ratio; 
            private String regionId; 
            private String reservationActiveTime; 
            private String reservationBandwidth; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String resourceGroupId; 
            private SecurityProtectionTypes securityProtectionTypes; 
            private Integer serviceManaged; 
            private String status; 
            private Tags tags; 
            private String zone; 

            /**
             * The maximum bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The ID of the Internet Shared Bandwidth instance.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * The service type of the Internet Shared Bandwidth instance. Valid values:
             * <p>
             * 
             * *   **CloudBox** The cloud box. Only cloud box users can select this type.
             * *   **Default** (default): The general service type.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The service status of the Internet Shared Bandwidth instance. Valid values:
             * <p>
             * 
             * *   **Normal**: The Internet Shared Bandwidth instance runs as expected.
             * *   **FinancialLocked**: An overdue payment occurs in the Internet Shared Bandwidth instance
             * *   **Unactivated**: The Internet Shared Bandwidth instance is not activated.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The time when the Internet Shared Bandwidth instance was created. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether deletion protection is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The description of the Internet Shared Bandwidth instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the Internet Shared Bandwidth instance expired. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * Indicates whether the information about pending orders is returned. Valid values:
             * <p>
             * 
             * *   **false**
             * *   **true**
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * The line type. Valid values:
             * <p>
             * 
             * *   **BGP**: BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro line The BGP (Multi-ISP) Pro line is supported in the China (Hong Kong), Singapore (Singapore), Japan (Tokyo), Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions.
             * 
             * If you are allowed to use single-ISP bandwidth, one of the following values is returned:
             * 
             * *   **ChinaTelecom**
             * *   **ChinaUnicom**
             * *   **ChinaMobile**
             * *   **ChinaTelecom_L2**
             * *   **ChinaUnicom_L2**
             * *   **ChinaMobile_L2**
             * 
             * If your services are deployed in China East 1 Finance, **BGP_FinanceCloud** is returned.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The billing method of the Internet Shared Bandwidth instance. Valid value:
             * <p>
             * 
             * **PostPaid**: pay-as-you-go
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The metering method of the Internet Shared Bandwidth instance. Valid value:
             * <p>
             * 
             * **PayByTraffic**
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The name of the Internet Shared Bandwidth instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The elastic IP addresses (EIPs) that are associated with the Internet Shared Bandwidth instance.
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * The percentage of the minimum bandwidth commitment. Only **20** is returned.
             * <p>
             * 
             * >  This parameter is supported only on the Alibaba Cloud China site.
             */
            public Builder ratio(Integer ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * The ID of the region where the Internet Shared Bandwidth instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the renewal took effect. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * The new maximum bandwidth after the configurations are changed. Unit: Mbit/s.
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * The metering method after the configurations are changed. Valid value:
             * <p>
             * 
             * **PayByTraffic**
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * The renewal method. Valid values:
             * <p>
             * 
             * *   **RENEWCHANGE**: renewal with a specification change
             * *   **TEMP_UPGRADE**: renewal with a temporary upgrade
             * *   **UPGRADE**: renewal with an upgrade
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
             * The editions of Anti-DDoS.
             * <p>
             * 
             * *   If this parameter is empty, Anti-DDoS Origin Basic is enabled.
             * *   If **AntiDDoS_Enhanced** is returned, Anti-DDoS Pro/Premium is enabled.
             */
            public Builder securityProtectionTypes(SecurityProtectionTypes securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * Indicates whether the resource is created by the service account. Valid values:
             * <p>
             * 
             * *   **0**: The resource is not created by the service account.
             * *   **1**: The resource is created by the service account.
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The status of the Internet Shared Bandwidth instance. Valid values:
             * <p>
             * 
             * *   **Available**: The Internet Shared Bandwidth instance is available.
             * *   **Modifying**: The Internet Shared Bandwidth instance is being modified.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag that is added to the Internet Shared Bandwidth instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The zone of the Internet Shared Bandwidth instance. This parameter is returned only when BizType is set to CloudBox. If BizType is set to Default, an empty value is returned.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public CommonBandwidthPackage build() {
                return new CommonBandwidthPackage(this);
            } 

        } 

    }
    public static class CommonBandwidthPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonBandwidthPackage")
        private java.util.List < CommonBandwidthPackage> commonBandwidthPackage;

        private CommonBandwidthPackages(Builder builder) {
            this.commonBandwidthPackage = builder.commonBandwidthPackage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonBandwidthPackages create() {
            return builder().build();
        }

        /**
         * @return commonBandwidthPackage
         */
        public java.util.List < CommonBandwidthPackage> getCommonBandwidthPackage() {
            return this.commonBandwidthPackage;
        }

        public static final class Builder {
            private java.util.List < CommonBandwidthPackage> commonBandwidthPackage; 

            /**
             * CommonBandwidthPackage.
             */
            public Builder commonBandwidthPackage(java.util.List < CommonBandwidthPackage> commonBandwidthPackage) {
                this.commonBandwidthPackage = commonBandwidthPackage;
                return this;
            }

            public CommonBandwidthPackages build() {
                return new CommonBandwidthPackages(this);
            } 

        } 

    }
}
