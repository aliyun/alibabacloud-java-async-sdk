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
         * CommonBandwidthPackages.
         */
        public Builder commonBandwidthPackages(CommonBandwidthPackages commonBandwidthPackages) {
            this.commonBandwidthPackages = commonBandwidthPackages;
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
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * BandwidthPackageIpRelationStatus.
             */
            public Builder bandwidthPackageIpRelationStatus(String bandwidthPackageIpRelationStatus) {
                this.bandwidthPackageIpRelationStatus = bandwidthPackageIpRelationStatus;
                return this;
            }

            /**
             * IpAddress.
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
    public static class CommonBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

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

        private CommonBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
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

        public static final class Builder {
            private String bandwidth; 
            private String bandwidthPackageId; 
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

            /**
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BandwidthPackageId.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * HasReservationData.
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PublicIpAddresses.
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(Integer ratio) {
                this.ratio = ratio;
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
             * ReservationActiveTime.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * ReservationBandwidth.
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * ReservationInternetChargeType.
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * ReservationOrderType.
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
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
             * SecurityProtectionTypes.
             */
            public Builder securityProtectionTypes(SecurityProtectionTypes securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * ServiceManaged.
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
