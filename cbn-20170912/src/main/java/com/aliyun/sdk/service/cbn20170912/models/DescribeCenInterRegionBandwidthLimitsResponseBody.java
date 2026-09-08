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
 * {@link DescribeCenInterRegionBandwidthLimitsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenInterRegionBandwidthLimitsResponseBody</p>
 */
public class DescribeCenInterRegionBandwidthLimitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenInterRegionBandwidthLimits")
    private CenInterRegionBandwidthLimits cenInterRegionBandwidthLimits;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCenInterRegionBandwidthLimitsResponseBody model) {
            this.cenInterRegionBandwidthLimits = model.cenInterRegionBandwidthLimits;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CenInterRegionBandwidthLimits.
         */
        public Builder cenInterRegionBandwidthLimits(CenInterRegionBandwidthLimits cenInterRegionBandwidthLimits) {
            this.cenInterRegionBandwidthLimits = cenInterRegionBandwidthLimits;
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
         * <p>The number of entries per page when using paging.</p>
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
         * <p>7A30C665-8766-5AAA-9274-C97380E2D850</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenInterRegionBandwidthLimitsResponseBody build() {
            return new DescribeCenInterRegionBandwidthLimitsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenInterRegionBandwidthLimitsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenInterRegionBandwidthLimitsResponseBody</p>
     */
    public static class CenInterRegionBandwidthLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
        private Long bandwidthLimit;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private String bandwidthType;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("GeographicSpanId")
        private String geographicSpanId;

        @com.aliyun.core.annotation.NameInMap("LocalRegionId")
        private String localRegionId;

        @com.aliyun.core.annotation.NameInMap("OppositeRegionId")
        private String oppositeRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CenInterRegionBandwidthLimit(Builder builder) {
            this.bandwidthLimit = builder.bandwidthLimit;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthType = builder.bandwidthType;
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
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
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
            private String bandwidthType; 
            private String cenId; 
            private String geographicSpanId; 
            private String localRegionId; 
            private String oppositeRegionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(CenInterRegionBandwidthLimit model) {
                this.bandwidthLimit = model.bandwidthLimit;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bandwidthType = model.bandwidthType;
                this.cenId = model.cenId;
                this.geographicSpanId = model.geographicSpanId;
                this.localRegionId = model.localRegionId;
                this.oppositeRegionId = model.oppositeRegionId;
                this.status = model.status;
            } 

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
             * BandwidthType.
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
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
    /**
     * 
     * {@link DescribeCenInterRegionBandwidthLimitsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenInterRegionBandwidthLimitsResponseBody</p>
     */
    public static class CenInterRegionBandwidthLimits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenInterRegionBandwidthLimit")
        private java.util.List<CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit;

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
        public java.util.List<CenInterRegionBandwidthLimit> getCenInterRegionBandwidthLimit() {
            return this.cenInterRegionBandwidthLimit;
        }

        public static final class Builder {
            private java.util.List<CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit; 

            private Builder() {
            } 

            private Builder(CenInterRegionBandwidthLimits model) {
                this.cenInterRegionBandwidthLimit = model.cenInterRegionBandwidthLimit;
            } 

            /**
             * CenInterRegionBandwidthLimit.
             */
            public Builder cenInterRegionBandwidthLimit(java.util.List<CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimit) {
                this.cenInterRegionBandwidthLimit = cenInterRegionBandwidthLimit;
                return this;
            }

            public CenInterRegionBandwidthLimits build() {
                return new CenInterRegionBandwidthLimits(this);
            } 

        } 

    }
}
