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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCommonBandwidthPackagesResponseBody model) {
            this.commonBandwidthPackages = model.commonBandwidthPackages;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CommonBandwidthPackages.
         */
        public Builder commonBandwidthPackages(CommonBandwidthPackages commonBandwidthPackages) {
            this.commonBandwidthPackages = commonBandwidthPackages;
            return this;
        }

        /**
         * <p>The page number of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging queries.</p>
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
         * <p>20E6FD1C-7321-4DAD-BDFD-EC8769E4AA33</p>
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

        public DescribeCommonBandwidthPackagesResponseBody build() {
            return new DescribeCommonBandwidthPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonBandwidthPackagesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PublicIpAddresse model) {
                this.allocationId = model.allocationId;
                this.bandwidthPackageIpRelationStatus = model.bandwidthPackageIpRelationStatus;
                this.ipAddress = model.ipAddress;
            } 

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
    /**
     * 
     * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonBandwidthPackagesResponseBody</p>
     */
    public static class PublicIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublicIpAddresse")
        private java.util.List<PublicIpAddresse> publicIpAddresse;

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
        public java.util.List<PublicIpAddresse> getPublicIpAddresse() {
            return this.publicIpAddresse;
        }

        public static final class Builder {
            private java.util.List<PublicIpAddresse> publicIpAddresse; 

            private Builder() {
            } 

            private Builder(PublicIpAddresses model) {
                this.publicIpAddresse = model.publicIpAddresse;
            } 

            /**
             * PublicIpAddresse.
             */
            public Builder publicIpAddresse(java.util.List<PublicIpAddresse> publicIpAddresse) {
                this.publicIpAddresse = publicIpAddresse;
                return this;
            }

            public PublicIpAddresses build() {
                return new PublicIpAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonBandwidthPackagesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SecurityProtectionTypes model) {
                this.securityProtectionType = model.securityProtectionType;
            } 

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
     * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonBandwidthPackagesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
    /**
     * 
     * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonBandwidthPackagesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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
     * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonBandwidthPackagesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CommonBandwidthPackage model) {
                this.bandwidth = model.bandwidth;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bizType = model.bizType;
                this.businessStatus = model.businessStatus;
                this.creationTime = model.creationTime;
                this.deletionProtection = model.deletionProtection;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.hasReservationData = model.hasReservationData;
                this.ISP = model.ISP;
                this.instanceChargeType = model.instanceChargeType;
                this.internetChargeType = model.internetChargeType;
                this.name = model.name;
                this.publicIpAddresses = model.publicIpAddresses;
                this.ratio = model.ratio;
                this.regionId = model.regionId;
                this.reservationActiveTime = model.reservationActiveTime;
                this.reservationBandwidth = model.reservationBandwidth;
                this.reservationInternetChargeType = model.reservationInternetChargeType;
                this.reservationOrderType = model.reservationOrderType;
                this.resourceGroupId = model.resourceGroupId;
                this.securityProtectionTypes = model.securityProtectionTypes;
                this.serviceManaged = model.serviceManaged;
                this.status = model.status;
                this.tags = model.tags;
                this.zone = model.zone;
            } 

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
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
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
    /**
     * 
     * {@link DescribeCommonBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonBandwidthPackagesResponseBody</p>
     */
    public static class CommonBandwidthPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonBandwidthPackage")
        private java.util.List<CommonBandwidthPackage> commonBandwidthPackage;

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
        public java.util.List<CommonBandwidthPackage> getCommonBandwidthPackage() {
            return this.commonBandwidthPackage;
        }

        public static final class Builder {
            private java.util.List<CommonBandwidthPackage> commonBandwidthPackage; 

            private Builder() {
            } 

            private Builder(CommonBandwidthPackages model) {
                this.commonBandwidthPackage = model.commonBandwidthPackage;
            } 

            /**
             * CommonBandwidthPackage.
             */
            public Builder commonBandwidthPackage(java.util.List<CommonBandwidthPackage> commonBandwidthPackage) {
                this.commonBandwidthPackage = commonBandwidthPackage;
                return this;
            }

            public CommonBandwidthPackages build() {
                return new CommonBandwidthPackages(this);
            } 

        } 

    }
}
