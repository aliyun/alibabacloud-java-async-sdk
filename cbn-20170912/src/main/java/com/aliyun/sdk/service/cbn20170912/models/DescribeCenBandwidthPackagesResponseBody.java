// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenBandwidthPackagesResponseBody</p>
 */
public class DescribeCenBandwidthPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenBandwidthPackages")
    private CenBandwidthPackages cenBandwidthPackages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenBandwidthPackagesResponseBody(Builder builder) {
        this.cenBandwidthPackages = builder.cenBandwidthPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenBandwidthPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenBandwidthPackages
     */
    public CenBandwidthPackages getCenBandwidthPackages() {
        return this.cenBandwidthPackages;
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
        private CenBandwidthPackages cenBandwidthPackages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details about the bandwidth plan.</p>
         */
        public Builder cenBandwidthPackages(CenBandwidthPackages cenBandwidthPackages) {
            this.cenBandwidthPackages = cenBandwidthPackages;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9D7E2400-2755-4AF5-9B73-12565E4F73A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenBandwidthPackagesResponseBody build() {
            return new DescribeCenBandwidthPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
     */
    public static class CenIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private java.util.List < String > cenId;

        private CenIds(Builder builder) {
            this.cenId = builder.cenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenIds create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public java.util.List < String > getCenId() {
            return this.cenId;
        }

        public static final class Builder {
            private java.util.List < String > cenId; 

            /**
             * CenId.
             */
            public Builder cenId(java.util.List < String > cenId) {
                this.cenId = cenId;
                return this;
            }

            public CenIds build() {
                return new CenIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
     */
    public static class OrginInterRegionBandwidthLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
        private String bandwidthLimit;

        @com.aliyun.core.annotation.NameInMap("GeographicSpanId")
        private String geographicSpanId;

        @com.aliyun.core.annotation.NameInMap("LocalRegionId")
        private String localRegionId;

        @com.aliyun.core.annotation.NameInMap("OppositeRegionId")
        private String oppositeRegionId;

        private OrginInterRegionBandwidthLimit(Builder builder) {
            this.bandwidthLimit = builder.bandwidthLimit;
            this.geographicSpanId = builder.geographicSpanId;
            this.localRegionId = builder.localRegionId;
            this.oppositeRegionId = builder.oppositeRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrginInterRegionBandwidthLimit create() {
            return builder().build();
        }

        /**
         * @return bandwidthLimit
         */
        public String getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        /**
         * @return geographicSpanId
         */
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        /**
         * @return localRegionId
         */
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        /**
         * @return oppositeRegionId
         */
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        public static final class Builder {
            private String bandwidthLimit; 
            private String geographicSpanId; 
            private String localRegionId; 
            private String oppositeRegionId; 

            /**
             * <p>The maximum bandwidth value for the inter-region connection.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bandwidthLimit(String bandwidthLimit) {
                this.bandwidthLimit = bandwidthLimit;
                return this;
            }

            /**
             * <p>The connected regions.</p>
             * 
             * <strong>example:</strong>
             * <p>north-america_china</p>
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
                return this;
            }

            /**
             * <p>The ID of the local region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder localRegionId(String localRegionId) {
                this.localRegionId = localRegionId;
                return this;
            }

            /**
             * <p>The ID of the peer region.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1</p>
             */
            public Builder oppositeRegionId(String oppositeRegionId) {
                this.oppositeRegionId = oppositeRegionId;
                return this;
            }

            public OrginInterRegionBandwidthLimit build() {
                return new OrginInterRegionBandwidthLimit(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
     */
    public static class OrginInterRegionBandwidthLimits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrginInterRegionBandwidthLimit")
        private java.util.List < OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit;

        private OrginInterRegionBandwidthLimits(Builder builder) {
            this.orginInterRegionBandwidthLimit = builder.orginInterRegionBandwidthLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrginInterRegionBandwidthLimits create() {
            return builder().build();
        }

        /**
         * @return orginInterRegionBandwidthLimit
         */
        public java.util.List < OrginInterRegionBandwidthLimit> getOrginInterRegionBandwidthLimit() {
            return this.orginInterRegionBandwidthLimit;
        }

        public static final class Builder {
            private java.util.List < OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit; 

            /**
             * OrginInterRegionBandwidthLimit.
             */
            public Builder orginInterRegionBandwidthLimit(java.util.List < OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit) {
                this.orginInterRegionBandwidthLimit = orginInterRegionBandwidthLimit;
                return this;
            }

            public OrginInterRegionBandwidthLimits build() {
                return new OrginInterRegionBandwidthLimits(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
     */
    public static class CenBandwidthPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageChargeType")
        private String bandwidthPackageChargeType;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CenBandwidthPackageId")
        private String cenBandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("CenIds")
        private CenIds cenIds;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GeographicRegionAId")
        private String geographicRegionAId;

        @com.aliyun.core.annotation.NameInMap("GeographicRegionBId")
        private String geographicRegionBId;

        @com.aliyun.core.annotation.NameInMap("GeographicSpanId")
        private String geographicSpanId;

        @com.aliyun.core.annotation.NameInMap("HasReservationData")
        private String hasReservationData;

        @com.aliyun.core.annotation.NameInMap("IsCrossBorder")
        private Boolean isCrossBorder;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrginInterRegionBandwidthLimits")
        private OrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private CenBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageChargeType = builder.bandwidthPackageChargeType;
            this.businessStatus = builder.businessStatus;
            this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
            this.cenIds = builder.cenIds;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.geographicRegionAId = builder.geographicRegionAId;
            this.geographicRegionBId = builder.geographicRegionBId;
            this.geographicSpanId = builder.geographicSpanId;
            this.hasReservationData = builder.hasReservationData;
            this.isCrossBorder = builder.isCrossBorder;
            this.name = builder.name;
            this.orginInterRegionBandwidthLimits = builder.orginInterRegionBandwidthLimits;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackageChargeType
         */
        public String getBandwidthPackageChargeType() {
            return this.bandwidthPackageChargeType;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return cenBandwidthPackageId
         */
        public String getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

        /**
         * @return cenIds
         */
        public CenIds getCenIds() {
            return this.cenIds;
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return geographicRegionAId
         */
        public String getGeographicRegionAId() {
            return this.geographicRegionAId;
        }

        /**
         * @return geographicRegionBId
         */
        public String getGeographicRegionBId() {
            return this.geographicRegionBId;
        }

        /**
         * @return geographicSpanId
         */
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        /**
         * @return hasReservationData
         */
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        /**
         * @return isCrossBorder
         */
        public Boolean getIsCrossBorder() {
            return this.isCrossBorder;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orginInterRegionBandwidthLimits
         */
        public OrginInterRegionBandwidthLimits getOrginInterRegionBandwidthLimits() {
            return this.orginInterRegionBandwidthLimits;
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

        public static final class Builder {
            private Long bandwidth; 
            private String bandwidthPackageChargeType; 
            private String businessStatus; 
            private String cenBandwidthPackageId; 
            private CenIds cenIds; 
            private String creationTime; 
            private String description; 
            private String expiredTime; 
            private String geographicRegionAId; 
            private String geographicRegionBId; 
            private String geographicSpanId; 
            private String hasReservationData; 
            private Boolean isCrossBorder; 
            private String name; 
            private OrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits; 
            private String reservationActiveTime; 
            private String reservationBandwidth; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 

            /**
             * <p>The maximum bandwidth of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The billing method of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder bandwidthPackageChargeType(String bandwidthPackageChargeType) {
                this.bandwidthPackageChargeType = bandwidthPackageChargeType;
                return this;
            }

            /**
             * <p>The status of the bandwidth plan. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: running as expected.</li>
             * <li><strong>FinancialLocked</strong>: locked due to overdue payments.</li>
             * <li><strong>SecurityLocked</strong>: locked due to security reasons</li>
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
             * <p>The ID of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>cenbwp-4c2zaavbvh5x****</p>
             */
            public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
                this.cenBandwidthPackageId = cenBandwidthPackageId;
                return this;
            }

            /**
             * <p>A list of CEN instances that are associated with the bandwidth plan.</p>
             */
            public Builder cenIds(CenIds cenIds) {
                this.cenIds = cenIds;
                return this;
            }

            /**
             * <p>The time when the bandwidth plan was created. The time is displayed in the ISO8601 standard in the YYYY-MM-DDThh:mmZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-01T11:14Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>cen</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the bandwidth plan expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T16:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The ID of the area that you want to query. Valid values:</p>
             * <ul>
             * <li><strong>china</strong>: Chinese mainland.</li>
             * <li><strong>asia-pacific</strong>: Asia Pacific</li>
             * <li><strong>europe</strong>: Europe</li>
             * <li><strong>australia</strong>: Australia</li>
             * <li><strong>north-america</strong>: North America</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>china</p>
             */
            public Builder geographicRegionAId(String geographicRegionAId) {
                this.geographicRegionAId = geographicRegionAId;
                return this;
            }

            /**
             * <p>The ID of the other area connected by the bandwidth plan. Valid values:</p>
             * <ul>
             * <li><strong>china</strong>: Chinese mainland.</li>
             * <li><strong>asia-pacific</strong>: Asia Pacific</li>
             * <li><strong>europe</strong>: Europe</li>
             * <li><strong>australia</strong>: Australia</li>
             * <li><strong>north-america</strong>: North America</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>north-america</p>
             */
            public Builder geographicRegionBId(String geographicRegionBId) {
                this.geographicRegionBId = geographicRegionBId;
                return this;
            }

            /**
             * <p>The ID of the connected area.</p>
             * 
             * <strong>example:</strong>
             * <p>north-america_china</p>
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
                return this;
            }

            /**
             * <p>Indicates whether renewal data is included.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter returns <strong>true</strong> only when the <strong>IncludeReservationData</strong> parameter is set to <strong>true</strong> and a pending order exists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * <p>Indicates whether the bandwidth plan supports cross-border communication.</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCrossBorder(Boolean isCrossBorder) {
                this.isCrossBorder = isCrossBorder;
                return this;
            }

            /**
             * <p>The name of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The details about the connected regions.</p>
             */
            public Builder orginInterRegionBandwidthLimits(OrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits) {
                this.orginInterRegionBandwidthLimits = orginInterRegionBandwidthLimits;
                return this;
            }

            /**
             * <p>The expiration time of the temporary upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-30T16:00Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The bandwidth value to which the bandwidth plan is restored when the temporary upgrade ends.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * <p>The new billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * <p>The renewal method.</p>
             * <ul>
             * <li><strong>TEMP_UPGRADE</strong>: temporary upgrade</li>
             * <li><strong>UPGRADE</strong>: upgrade</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPGRADE</p>
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the ACL belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzoyr5k36****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the bandwidth plan is associated with a CEN instance.</p>
             * <ul>
             * <li><strong>Idle</strong></li>
             * <li><strong>InUse</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the bandwidth plan.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public CenBandwidthPackage build() {
                return new CenBandwidthPackage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
     */
    public static class CenBandwidthPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenBandwidthPackage")
        private java.util.List < CenBandwidthPackage> cenBandwidthPackage;

        private CenBandwidthPackages(Builder builder) {
            this.cenBandwidthPackage = builder.cenBandwidthPackage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenBandwidthPackages create() {
            return builder().build();
        }

        /**
         * @return cenBandwidthPackage
         */
        public java.util.List < CenBandwidthPackage> getCenBandwidthPackage() {
            return this.cenBandwidthPackage;
        }

        public static final class Builder {
            private java.util.List < CenBandwidthPackage> cenBandwidthPackage; 

            /**
             * CenBandwidthPackage.
             */
            public Builder cenBandwidthPackage(java.util.List < CenBandwidthPackage> cenBandwidthPackage) {
                this.cenBandwidthPackage = cenBandwidthPackage;
                return this;
            }

            public CenBandwidthPackages build() {
                return new CenBandwidthPackages(this);
            } 

        } 

    }
}
