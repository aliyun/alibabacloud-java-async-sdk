// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBandwidthackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBandwidthackagesResponseBody</p>
 */
public class ListBandwidthackagesResponseBody extends TeaModel {
    @NameInMap("BandwidthPackages")
    private java.util.List < BandwidthPackages> bandwidthPackages;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListBandwidthackagesResponseBody(Builder builder) {
        this.bandwidthPackages = builder.bandwidthPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBandwidthackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthPackages
     */
    public java.util.List < BandwidthPackages> getBandwidthPackages() {
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
        private java.util.List < BandwidthPackages> bandwidthPackages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BandwidthPackages.
         */
        public Builder bandwidthPackages(java.util.List < BandwidthPackages> bandwidthPackages) {
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

        public ListBandwidthackagesResponseBody build() {
            return new ListBandwidthackagesResponseBody(this);
        } 

    } 

    public static class BandwidthPackages extends TeaModel {
        @NameInMap("Accelerators")
        private java.util.List < String > accelerators;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("State")
        private String state;

        private BandwidthPackages(Builder builder) {
            this.accelerators = builder.accelerators;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthPackages create() {
            return builder().build();
        }

        /**
         * @return accelerators
         */
        public java.util.List < String > getAccelerators() {
            return this.accelerators;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private java.util.List < String > accelerators; 
            private Integer bandwidth; 
            private String bandwidthPackageId; 
            private String chargeType; 
            private String createTime; 
            private String description; 
            private String expiredTime; 
            private String name; 
            private String regionId; 
            private String state; 

            /**
             * Accelerators.
             */
            public Builder accelerators(java.util.List < String > accelerators) {
                this.accelerators = accelerators;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
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
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public BandwidthPackages build() {
                return new BandwidthPackages(this);
            } 

        } 

    }
}
