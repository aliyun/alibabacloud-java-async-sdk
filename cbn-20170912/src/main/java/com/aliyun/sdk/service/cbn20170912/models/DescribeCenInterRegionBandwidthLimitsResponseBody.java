// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenInterRegionBandwidthLimitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenInterRegionBandwidthLimitsResponseBody</p>
 */
public class DescribeCenInterRegionBandwidthLimitsResponseBody extends TeaModel {
    @NameInMap("CenInterRegionBandwidthLimits")
    private CenInterRegionBandwidthLimits cenInterRegionBandwidthLimits;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenInterRegionBandwidthLimitsResponseBody(Builder builder) {
        this.cenInterRegionBandwidthLimits = builder.cenInterRegionBandwidthLimits;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenInterRegionBandwidthLimitsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenInterRegionBandwidthLimits
     */
    public CenInterRegionBandwidthLimits getCenInterRegionBandwidthLimits() {
        return this.cenInterRegionBandwidthLimits;
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
        private CenInterRegionBandwidthLimits cenInterRegionBandwidthLimits; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CenInterRegionBandwidthLimits.
         */
        public Builder cenInterRegionBandwidthLimits(CenInterRegionBandwidthLimits cenInterRegionBandwidthLimits) {
            this.cenInterRegionBandwidthLimits = cenInterRegionBandwidthLimits;
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

        public DescribeCenInterRegionBandwidthLimitsResponseBody build() {
            return new DescribeCenInterRegionBandwidthLimitsResponseBody(this);
        } 

    } 

    public static class CenInterRegionBandwidthLimit extends TeaModel {
        @NameInMap("BandwidthLimit")
        private Long bandwidthLimit;

        @NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("GeographicSpanId")
        private String geographicSpanId;

        @NameInMap("LocalRegionId")
        private String localRegionId;

        @NameInMap("OppositeRegionId")
        private String oppositeRegionId;

        @NameInMap("Status")
        private String status;

        private CenInterRegionBandwidthLimit(Builder builder) {
            this.bandwidthLimit = builder.bandwidthLimit;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.cenId = builder.cenId;
            this.geographicSpanId = builder.geographicSpanId;
            this.localRegionId = builder.localRegionId;
            this.oppositeRegionId = builder.oppositeRegionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenInterRegionBandwidthLimit create() {
            return builder().build();
        }

        /**
         * @return bandwidthLimit
         */
        public Long getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long bandwidthLimit; 
            private String bandwidthPackageId; 
            private String cenId; 
            private String geographicSpanId; 
            private String localRegionId; 
            private String oppositeRegionId; 
            private String status; 

            /**
             * BandwidthLimit.
             */
            public Builder bandwidthLimit(Long bandwidthLimit) {
                this.bandwidthLimit = bandwidthLimit;
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
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
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

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CenInterRegionBandwidthLimit build() {
                return new CenInterRegionBandwidthLimit(this);
            } 

        } 

    }
    public static class CenInterRegionBandwidthLimits extends TeaModel {
        @NameInMap("CenInterRegionBandwidthLimit")
        private java.util.List < CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit;

        private CenInterRegionBandwidthLimits(Builder builder) {
            this.cenInterRegionBandwidthLimit = builder.cenInterRegionBandwidthLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenInterRegionBandwidthLimits create() {
            return builder().build();
        }

        /**
         * @return cenInterRegionBandwidthLimit
         */
        public java.util.List < CenInterRegionBandwidthLimit> getCenInterRegionBandwidthLimit() {
            return this.cenInterRegionBandwidthLimit;
        }

        public static final class Builder {
            private java.util.List < CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit; 

            /**
             * CenInterRegionBandwidthLimit.
             */
            public Builder cenInterRegionBandwidthLimit(java.util.List < CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit) {
                this.cenInterRegionBandwidthLimit = cenInterRegionBandwidthLimit;
                return this;
            }

            public CenInterRegionBandwidthLimits build() {
                return new CenInterRegionBandwidthLimits(this);
            } 

        } 

    }
}
