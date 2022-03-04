// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackagesResponseBody</p>
 */
public class DescribeBandwidthPackagesResponseBody extends TeaModel {
    @NameInMap("BandwidthPackages")
    private BandwidthPackages bandwidthPackages;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBandwidthPackagesResponseBody(Builder builder) {
        this.bandwidthPackages = builder.bandwidthPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthPackages
     */
    public BandwidthPackages getBandwidthPackages() {
        return this.bandwidthPackages;
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
        private BandwidthPackages bandwidthPackages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BandwidthPackages.
         */
        public Builder bandwidthPackages(BandwidthPackages bandwidthPackages) {
            this.bandwidthPackages = bandwidthPackages;
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

        public DescribeBandwidthPackagesResponseBody build() {
            return new DescribeBandwidthPackagesResponseBody(this);
        } 

    } 

    public static class PublicIpAddresse extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("IpAddress")
        private String ipAddress;

        private PublicIpAddresse(Builder builder) {
            this.allocationId = builder.allocationId;
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
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        public static final class Builder {
            private String allocationId; 
            private String ipAddress; 

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
    public static class BandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpCount")
        private String ipCount;

        @NameInMap("Name")
        private String name;

        @NameInMap("NatGatewayId")
        private String natGatewayId;

        @NameInMap("PublicIpAddresses")
        private PublicIpAddresses publicIpAddresses;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneId")
        private String zoneId;

        private BandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ISP = builder.ISP;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.ipCount = builder.ipCount;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.publicIpAddresses = builder.publicIpAddresses;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthPackage create() {
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return ipCount
         */
        public String getIpCount() {
            return this.ipCount;
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
         * @return publicIpAddresses
         */
        public PublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String bandwidth; 
            private String bandwidthPackageId; 
            private String businessStatus; 
            private String creationTime; 
            private String description; 
            private String ISP; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private String ipCount; 
            private String name; 
            private String natGatewayId; 
            private PublicIpAddresses publicIpAddresses; 
            private String regionId; 
            private String status; 
            private String zoneId; 

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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * IpCount.
             */
            public Builder ipCount(String ipCount) {
                this.ipCount = ipCount;
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
             * PublicIpAddresses.
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public BandwidthPackage build() {
                return new BandwidthPackage(this);
            } 

        } 

    }
    public static class BandwidthPackages extends TeaModel {
        @NameInMap("BandwidthPackage")
        private java.util.List < BandwidthPackage> bandwidthPackage;

        private BandwidthPackages(Builder builder) {
            this.bandwidthPackage = builder.bandwidthPackage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthPackages create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackage
         */
        public java.util.List < BandwidthPackage> getBandwidthPackage() {
            return this.bandwidthPackage;
        }

        public static final class Builder {
            private java.util.List < BandwidthPackage> bandwidthPackage; 

            /**
             * BandwidthPackage.
             */
            public Builder bandwidthPackage(java.util.List < BandwidthPackage> bandwidthPackage) {
                this.bandwidthPackage = bandwidthPackage;
                return this;
            }

            public BandwidthPackages build() {
                return new BandwidthPackages(this);
            } 

        } 

    }
}
