// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionBandwidthQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionBandwidthQuotaResponseBody</p>
 */
public class DescribeRegionBandwidthQuotaResponseBody extends TeaModel {
    @NameInMap("BandwidthQuota")
    private java.util.List < BandwidthQuota> bandwidthQuota;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRegionBandwidthQuotaResponseBody(Builder builder) {
        this.bandwidthQuota = builder.bandwidthQuota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionBandwidthQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthQuota
     */
    public java.util.List < BandwidthQuota> getBandwidthQuota() {
        return this.bandwidthQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BandwidthQuota> bandwidthQuota; 
        private String requestId; 

        /**
         * BandwidthQuota.
         */
        public Builder bandwidthQuota(java.util.List < BandwidthQuota> bandwidthQuota) {
            this.bandwidthQuota = bandwidthQuota;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionBandwidthQuotaResponseBody build() {
            return new DescribeRegionBandwidthQuotaResponseBody(this);
        } 

    } 

    public static class BandwidthInfo extends TeaModel {
        @NameInMap("MonthAverageQuota")
        private Long monthAverageQuota;

        @NameInMap("MonthMax")
        private Long monthMax;

        @NameInMap("WeekAverageQuota")
        private Long weekAverageQuota;

        @NameInMap("WeekMax")
        private Long weekMax;

        private BandwidthInfo(Builder builder) {
            this.monthAverageQuota = builder.monthAverageQuota;
            this.monthMax = builder.monthMax;
            this.weekAverageQuota = builder.weekAverageQuota;
            this.weekMax = builder.weekMax;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthInfo create() {
            return builder().build();
        }

        /**
         * @return monthAverageQuota
         */
        public Long getMonthAverageQuota() {
            return this.monthAverageQuota;
        }

        /**
         * @return monthMax
         */
        public Long getMonthMax() {
            return this.monthMax;
        }

        /**
         * @return weekAverageQuota
         */
        public Long getWeekAverageQuota() {
            return this.weekAverageQuota;
        }

        /**
         * @return weekMax
         */
        public Long getWeekMax() {
            return this.weekMax;
        }

        public static final class Builder {
            private Long monthAverageQuota; 
            private Long monthMax; 
            private Long weekAverageQuota; 
            private Long weekMax; 

            /**
             * MonthAverageQuota.
             */
            public Builder monthAverageQuota(Long monthAverageQuota) {
                this.monthAverageQuota = monthAverageQuota;
                return this;
            }

            /**
             * MonthMax.
             */
            public Builder monthMax(Long monthMax) {
                this.monthMax = monthMax;
                return this;
            }

            /**
             * WeekAverageQuota.
             */
            public Builder weekAverageQuota(Long weekAverageQuota) {
                this.weekAverageQuota = weekAverageQuota;
                return this;
            }

            /**
             * WeekMax.
             */
            public Builder weekMax(Long weekMax) {
                this.weekMax = weekMax;
                return this;
            }

            public BandwidthInfo build() {
                return new BandwidthInfo(this);
            } 

        } 

    }
    public static class InstanceInfo extends TeaModel {
        @NameInMap("InstanceNumber")
        private Long instanceNumber;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        private InstanceInfo(Builder builder) {
            this.instanceNumber = builder.instanceNumber;
            this.instanceSpec = builder.instanceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return instanceNumber
         */
        public Long getInstanceNumber() {
            return this.instanceNumber;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public static final class Builder {
            private Long instanceNumber; 
            private String instanceSpec; 

            /**
             * InstanceNumber.
             */
            public Builder instanceNumber(Long instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
    public static class BandwidthQuota extends TeaModel {
        @NameInMap("BandwidthInfo")
        private BandwidthInfo bandwidthInfo;

        @NameInMap("Date")
        private String date;

        @NameInMap("InstanceInfo")
        private java.util.List < InstanceInfo> instanceInfo;

        @NameInMap("RegionId")
        private String regionId;

        private BandwidthQuota(Builder builder) {
            this.bandwidthInfo = builder.bandwidthInfo;
            this.date = builder.date;
            this.instanceInfo = builder.instanceInfo;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthQuota create() {
            return builder().build();
        }

        /**
         * @return bandwidthInfo
         */
        public BandwidthInfo getBandwidthInfo() {
            return this.bandwidthInfo;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return instanceInfo
         */
        public java.util.List < InstanceInfo> getInstanceInfo() {
            return this.instanceInfo;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private BandwidthInfo bandwidthInfo; 
            private String date; 
            private java.util.List < InstanceInfo> instanceInfo; 
            private String regionId; 

            /**
             * BandwidthInfo.
             */
            public Builder bandwidthInfo(BandwidthInfo bandwidthInfo) {
                this.bandwidthInfo = bandwidthInfo;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * InstanceInfo.
             */
            public Builder instanceInfo(java.util.List < InstanceInfo> instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public BandwidthQuota build() {
                return new BandwidthQuota(this);
            } 

        } 

    }
}
