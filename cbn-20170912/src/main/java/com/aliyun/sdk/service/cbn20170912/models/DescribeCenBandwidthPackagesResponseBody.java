// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCenBandwidthPackagesResponseBody model) {
            this.cenBandwidthPackages = model.cenBandwidthPackages;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CenBandwidthPackages.
         */
        public Builder cenBandwidthPackages(CenBandwidthPackages cenBandwidthPackages) {
            this.cenBandwidthPackages = cenBandwidthPackages;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The total number of entries.</p>
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
        private java.util.List<String> cenId;

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
        public java.util.List<String> getCenId() {
            return this.cenId;
        }

        public static final class Builder {
            private java.util.List<String> cenId; 

            private Builder() {
            } 

            private Builder(CenIds model) {
                this.cenId = model.cenId;
            } 

            /**
             * CenId.
             */
            public Builder cenId(java.util.List<String> cenId) {
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

            private Builder() {
            } 

            private Builder(OrginInterRegionBandwidthLimit model) {
                this.bandwidthLimit = model.bandwidthLimit;
                this.geographicSpanId = model.geographicSpanId;
                this.localRegionId = model.localRegionId;
                this.oppositeRegionId = model.oppositeRegionId;
            } 

            /**
             * BandwidthLimit.
             */
            public Builder bandwidthLimit(String bandwidthLimit) {
                this.bandwidthLimit = bandwidthLimit;
                return this;
            }

            /**
             * GeographicSpanId.
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
                return this;
            }

            /**
             * LocalRegionId.
             */
            public Builder localRegionId(String localRegionId) {
                this.localRegionId = localRegionId;
                return this;
            }

            /**
             * OppositeRegionId.
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
        private java.util.List<OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit;

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
        public java.util.List<OrginInterRegionBandwidthLimit> getOrginInterRegionBandwidthLimit() {
            return this.orginInterRegionBandwidthLimit;
        }

        public static final class Builder {
            private java.util.List<OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit; 

            private Builder() {
            } 

            private Builder(OrginInterRegionBandwidthLimits model) {
                this.orginInterRegionBandwidthLimit = model.orginInterRegionBandwidthLimit;
            } 

            /**
             * OrginInterRegionBandwidthLimit.
             */
            public Builder orginInterRegionBandwidthLimit(java.util.List<OrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit) {
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
     * {@link DescribeCenBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenBandwidthPackagesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CenBandwidthPackage model) {
                this.bandwidth = model.bandwidth;
                this.bandwidthPackageChargeType = model.bandwidthPackageChargeType;
                this.businessStatus = model.businessStatus;
                this.cenBandwidthPackageId = model.cenBandwidthPackageId;
                this.cenIds = model.cenIds;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.geographicRegionAId = model.geographicRegionAId;
                this.geographicRegionBId = model.geographicRegionBId;
                this.geographicSpanId = model.geographicSpanId;
                this.hasReservationData = model.hasReservationData;
                this.isCrossBorder = model.isCrossBorder;
                this.name = model.name;
                this.orginInterRegionBandwidthLimits = model.orginInterRegionBandwidthLimits;
                this.reservationActiveTime = model.reservationActiveTime;
                this.reservationBandwidth = model.reservationBandwidth;
                this.reservationInternetChargeType = model.reservationInternetChargeType;
                this.reservationOrderType = model.reservationOrderType;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BandwidthPackageChargeType.
             */
            public Builder bandwidthPackageChargeType(String bandwidthPackageChargeType) {
                this.bandwidthPackageChargeType = bandwidthPackageChargeType;
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
             * CenBandwidthPackageId.
             */
            public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
                this.cenBandwidthPackageId = cenBandwidthPackageId;
                return this;
            }

            /**
             * CenIds.
             */
            public Builder cenIds(CenIds cenIds) {
                this.cenIds = cenIds;
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GeographicRegionAId.
             */
            public Builder geographicRegionAId(String geographicRegionAId) {
                this.geographicRegionAId = geographicRegionAId;
                return this;
            }

            /**
             * GeographicRegionBId.
             */
            public Builder geographicRegionBId(String geographicRegionBId) {
                this.geographicRegionBId = geographicRegionBId;
                return this;
            }

            /**
             * GeographicSpanId.
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
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
             * IsCrossBorder.
             */
            public Builder isCrossBorder(Boolean isCrossBorder) {
                this.isCrossBorder = isCrossBorder;
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
             * OrginInterRegionBandwidthLimits.
             */
            public Builder orginInterRegionBandwidthLimits(OrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits) {
                this.orginInterRegionBandwidthLimits = orginInterRegionBandwidthLimits;
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
        private java.util.List<CenBandwidthPackage> cenBandwidthPackage;

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
        public java.util.List<CenBandwidthPackage> getCenBandwidthPackage() {
            return this.cenBandwidthPackage;
        }

        public static final class Builder {
            private java.util.List<CenBandwidthPackage> cenBandwidthPackage; 

            private Builder() {
            } 

            private Builder(CenBandwidthPackages model) {
                this.cenBandwidthPackage = model.cenBandwidthPackage;
            } 

            /**
             * CenBandwidthPackage.
             */
            public Builder cenBandwidthPackage(java.util.List<CenBandwidthPackage> cenBandwidthPackage) {
                this.cenBandwidthPackage = cenBandwidthPackage;
                return this;
            }

            public CenBandwidthPackages build() {
                return new CenBandwidthPackages(this);
            } 

        } 

    }
}
