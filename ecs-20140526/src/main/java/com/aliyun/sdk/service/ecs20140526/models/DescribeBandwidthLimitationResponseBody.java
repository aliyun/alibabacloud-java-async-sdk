// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthLimitationResponseBody</p>
 */
public class DescribeBandwidthLimitationResponseBody extends TeaModel {
    @NameInMap("Bandwidths")
    private Bandwidths bandwidths;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBandwidthLimitationResponseBody(Builder builder) {
        this.bandwidths = builder.bandwidths;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthLimitationResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidths
     */
    public Bandwidths getBandwidths() {
        return this.bandwidths;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Bandwidths bandwidths; 
        private String requestId; 

        /**
         * Details about the maximum public bandwidth.
         */
        public Builder bandwidths(Bandwidths bandwidths) {
            this.bandwidths = bandwidths;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBandwidthLimitationResponseBody build() {
            return new DescribeBandwidthLimitationResponseBody(this);
        } 

    } 

    public static class Bandwidth extends TeaModel {
        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("Max")
        private Integer max;

        @NameInMap("Min")
        private Integer min;

        @NameInMap("Unit")
        private String unit;

        private Bandwidth(Builder builder) {
            this.internetChargeType = builder.internetChargeType;
            this.max = builder.max;
            this.min = builder.min;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidth create() {
            return builder().build();
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String internetChargeType; 
            private Integer max; 
            private Integer min; 
            private String unit; 

            /**
             * The billing method for network usage. Valid values:
             * <p>
             * 
             * *   PayByBandwidth
             * *   PayByTraffic
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The maximum public bandwidth.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * The minimum public bandwidth.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * The unit of the public bandwidth.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Bandwidth build() {
                return new Bandwidth(this);
            } 

        } 

    }
    public static class Bandwidths extends TeaModel {
        @NameInMap("Bandwidth")
        private java.util.List < Bandwidth> bandwidth;

        private Bandwidths(Builder builder) {
            this.bandwidth = builder.bandwidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidths create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public java.util.List < Bandwidth> getBandwidth() {
            return this.bandwidth;
        }

        public static final class Builder {
            private java.util.List < Bandwidth> bandwidth; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(java.util.List < Bandwidth> bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            public Bandwidths build() {
                return new Bandwidths(this);
            } 

        } 

    }
}
