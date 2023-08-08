// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonBandwidthPackagesResponseBody</p>
 */
public class DescribeCommonBandwidthPackagesResponseBody extends TeaModel {
    @NameInMap("CommonBandwidthPackages")
    private CommonBandwidthPackages commonBandwidthPackages;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The details of the EIP bandwidth plan.
         */
        public Builder commonBandwidthPackages(CommonBandwidthPackages commonBandwidthPackages) {
            this.commonBandwidthPackages = commonBandwidthPackages;
            return this;
        }

        /**
         * The number of the returned page.
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

        public DescribeCommonBandwidthPackagesResponseBody build() {
            return new DescribeCommonBandwidthPackagesResponseBody(this);
        } 

    } 

    public static class PublicIpAddresse extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("BandwidthPackageIpRelationStatus")
        private String bandwidthPackageIpRelationStatus;

        @NameInMap("IpAddress")
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
             * Indicates whether the EIP is associated with the EIP bandwidth plan.
             * <p>
             * 
             * *   **BINDED**: The EIP is associated with the EIP bandwidth plan.
             * *   **BINDING**: The EIP is being associated with the EIP bandwidth plan.
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
        @NameInMap("PublicIpAddresse")
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
    public static class CommonBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("HasReservationData")
        private String hasReservationData;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublicIpAddresses")
        private PublicIpAddresses publicIpAddresses;

        @NameInMap("Ratio")
        private Integer ratio;

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

        @NameInMap("SecurityProtectionTypes")
        private SecurityProtectionTypes securityProtectionTypes;

        @NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Zone")
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
             * The maximum bandwidth of the EIP bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
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
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The service state of the EIP bandwidth plan.
             * <p>
             * 
             * *   **Normal**: The EIP bandwidth plan works as expected.
             * *   **FinancialLocked**: The EIP bandwidth plan has an overdue payment.
             * *   **Unactivated**: The EIP bandwidth plan is not activated.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The time when the EIP bandwidth plan was created. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether deletion protection was enabled.
             * <p>
             * 
             * *   **true**: Deletion protection was enabled.
             * *   **false**: Deletion protection was disabled.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The description of the EIP bandwidth plan.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the EIP bandwidth plan expired. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * Indicates whether the information about pending orders was returned.
             * <p>
             * 
             * *   **false**: The information about pending orders was not returned.
             * *   **true**: The information about pending orders was returned.
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * The line type.
             * <p>
             * 
             * *   **BGP**: BGP (Multi-ISP) lines. BGP (Multi-ISP) lines are available in all regions.
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines. BGP (Multi-ISP) Pro lines are available only in the China (Hong Kong), Singapore, Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions.
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
             * The billing method of the EIP bandwidth plan.
             * <p>
             * 
             * **PostPaid**: the pay-as-you-go billing method
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The metering method of the EIP bandwidth plan.
             * <p>
             * 
             * **PayByTraffic**: the pay-by-data-transfer metering method.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The name of the EIP bandwidth plan.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The elastic IP addresses (EIPs) associated with the EIP bandwidth plan.
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * The percentage of the minimum bandwidth commitment. **20** is returned.
             * <p>
             * 
             * >  This parameter is available only on the Alibaba Cloud China site.
             */
            public Builder ratio(Integer ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * The region ID of the EIP bandwidth plan.
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
             * The new maximum bandwidth. Unit: Mbit/s.
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * The new metering method.
             * <p>
             * 
             * **PayByTraffic**: the pay-by-data-transfer metering method
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * The renewal method.
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
             * The edition of Anti-DDoS. 
             * <p>
             * 
             * - If this parameter is empty, it indicates that Anti-DDoS Origin Basic was enabled.
             * - If **AntiDDoS_Enhanced** is returned, it indicates that Anti-DDoS Pro/Premium was enabled.
             */
            public Builder securityProtectionTypes(SecurityProtectionTypes securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * Indicates whether the EIP bandwidth plan was created by the service account.
             * <p>
             * 
             * *   **0**: The EIP bandwidth plan was not created by the service account.
             * *   **1**: The EIP bandwidth plan was created by the service account.
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The status of the EIP bandwidth plan. Valid values:
             * <p>
             * 
             * *   **Available**: The EIP bandwidth plan is available.
             * *   **Modifying**: The EIP bandwidth plan is being modified.
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
             * Zone.
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
        @NameInMap("CommonBandwidthPackage")
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
