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
         * <p>A list of inter-region connections.</p>
         */
        public Builder cenInterRegionBandwidthLimits(CenInterRegionBandwidthLimits cenInterRegionBandwidthLimits) {
            this.cenInterRegionBandwidthLimits = cenInterRegionBandwidthLimits;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>The total number of entries returned.</p>
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

            /**
             * <p>The maximum bandwidth of the inter-region connection. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bandwidthLimit(Long bandwidthLimit) {
                this.bandwidthLimit = bandwidthLimit;
                return this;
            }

            /**
             * <p>The ID of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>cenbwp-uenczwb592fnvv****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The bandwidth allocation method. Valid values:</p>
             * <ul>
             * <li><strong>BandwidthPackage</strong>: allocates bandwidth from a bandwidth plan.</li>
             * <li><strong>DataTransfer</strong>: bandwidth is billed based on the pay-by-data-transfer metering method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BandwidthPackage</p>
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-pfa6ugf3xl0qsd****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The IDs of the local and peer regions.</p>
             * 
             * <strong>example:</strong>
             * <p>china_china</p>
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
                return this;
            }

            /**
             * <p>The ID of the local region.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-cn-shanghai</p>
             */
            public Builder localRegionId(String localRegionId) {
                this.localRegionId = localRegionId;
                return this;
            }

            /**
             * <p>The ID of the peer region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder oppositeRegionId(String oppositeRegionId) {
                this.oppositeRegionId = oppositeRegionId;
                return this;
            }

            /**
             * <p>The bandwidth status of the inter-region connection. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
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
