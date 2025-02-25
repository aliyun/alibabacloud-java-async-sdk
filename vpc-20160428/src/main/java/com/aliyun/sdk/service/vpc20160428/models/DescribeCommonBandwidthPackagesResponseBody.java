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
         * <p>The details of the Internet Shared Bandwidth instance.</p>
         */
        public Builder commonBandwidthPackages(CommonBandwidthPackages commonBandwidthPackages) {
            this.commonBandwidthPackages = commonBandwidthPackages;
            return this;
        }

        /**
         * <p>The page number.</p>
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

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp13e9i2qst4g6jzi****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>Indicates whether the EIP is associated with the Internet Shared Bandwidth instance. Valid values:</p>
             * <ul>
             * <li><strong>BINDED</strong></li>
             * <li><strong>BINDING</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BINDED</p>
             */
            public Builder bandwidthPackageIpRelationStatus(String bandwidthPackageIpRelationStatus) {
                this.bandwidthPackageIpRelationStatus = bandwidthPackageIpRelationStatus;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.95.XX.XX</p>
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

            /**
             * <p>The tag key that is added to the Internet Shared Bandwidth instance.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value that is added to the Internet Shared Bandwidth instance.</p>
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

            /**
             * <p>The maximum bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The ID of the Internet Shared Bandwidth instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-bp1t3sm1ffzmshdki****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The service type of the Internet Shared Bandwidth instance. Valid values:</p>
             * <ul>
             * <li><strong>CloudBox</strong> The cloud box. Only cloud box users can select this type.</li>
             * <li><strong>Default</strong> (default): The general service type.</li>
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
             * <p>The service status of the Internet Shared Bandwidth instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The Internet Shared Bandwidth instance runs as expected.</li>
             * <li><strong>FinancialLocked</strong>: An overdue payment occurs in the Internet Shared Bandwidth instance</li>
             * <li><strong>Unactivated</strong>: The Internet Shared Bandwidth instance is not activated.</li>
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
             * <p>The time when the Internet Shared Bandwidth instance was created. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-28T06:39:20Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * <p>The description of the Internet Shared Bandwidth instance.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the Internet Shared Bandwidth instance expired. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-15T03:08:37Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>Indicates whether the information about pending orders is returned. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
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
             * <li><strong>BGP</strong>: BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.</li>
             * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro line The BGP (Multi-ISP) Pro line is supported in the China (Hong Kong), Singapore (Singapore), Japan (Tokyo), Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions.</li>
             * </ul>
             * <p>If you are allowed to use single-ISP bandwidth, one of the following values is returned:</p>
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
             * <p>The billing method of the Internet Shared Bandwidth instance. Valid value:</p>
             * <p><strong>PostPaid</strong>: pay-as-you-go</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The metering method of the Internet Shared Bandwidth instance. Valid value:</p>
             * <p><strong>PayByTraffic</strong></p>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The name of the Internet Shared Bandwidth instance.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The elastic IP addresses (EIPs) that are associated with the Internet Shared Bandwidth instance.</p>
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * <p>The percentage of the minimum bandwidth commitment. Only <strong>20</strong> is returned.</p>
             * <blockquote>
             * <p> This parameter is supported only on the Alibaba Cloud China site.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ratio(Integer ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>The ID of the region where the Internet Shared Bandwidth instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the renewal took effect. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-30T16:00:00Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The new maximum bandwidth after the configurations are changed. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * <p>The metering method after the configurations are changed. Valid value:</p>
             * <p><strong>PayByTraffic</strong></p>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * <p>The renewal method. Valid values:</p>
             * <ul>
             * <li><strong>RENEWCHANGE</strong>: renewal with a specification change</li>
             * <li><strong>TEMP_UPGRADE</strong>: renewal with a temporary upgrade</li>
             * <li><strong>UPGRADE</strong>: renewal with an upgrade</li>
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
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The editions of Anti-DDoS.</p>
             * <ul>
             * <li>If this parameter is empty, Anti-DDoS Origin Basic is enabled.</li>
             * <li>If <strong>AntiDDoS_Enhanced</strong> is returned, Anti-DDoS Pro/Premium is enabled.</li>
             * </ul>
             */
            public Builder securityProtectionTypes(SecurityProtectionTypes securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * <p>Indicates whether the resource is created by the service account. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The resource is not created by the service account.</li>
             * <li><strong>1</strong>: The resource is created by the service account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The status of the Internet Shared Bandwidth instance. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong>: The Internet Shared Bandwidth instance is available.</li>
             * <li><strong>Modifying</strong>: The Internet Shared Bandwidth instance is being modified.</li>
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
             * <p>The tag that is added to the Internet Shared Bandwidth instance.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The zone of the Internet Shared Bandwidth instance. This parameter is returned only when BizType is set to CloudBox. If BizType is set to Default, an empty value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1-lzdvn-cb</p>
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
