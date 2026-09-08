// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeBandwidthLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthLimitationResponseBody</p>
 */
public class DescribeBandwidthLimitationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bandwidths")
    private Bandwidths bandwidths;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBandwidthLimitationResponseBody model) {
            this.bandwidths = model.bandwidths;
            this.requestId = model.requestId;
        } 

        /**
         * Bandwidths.
         */
        public Builder bandwidths(Bandwidths bandwidths) {
            this.bandwidths = bandwidths;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBandwidthLimitationResponseBody build() {
            return new DescribeBandwidthLimitationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBandwidthLimitationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBandwidthLimitationResponseBody</p>
     */
    public static class Bandwidth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Unit")
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

            private Builder() {
            } 

            private Builder(Bandwidth model) {
                this.internetChargeType = model.internetChargeType;
                this.max = model.max;
                this.min = model.min;
                this.unit = model.unit;
            } 

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Unit.
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
    /**
     * 
     * {@link DescribeBandwidthLimitationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBandwidthLimitationResponseBody</p>
     */
    public static class Bandwidths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private java.util.List<Bandwidth> bandwidth;

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
        public java.util.List<Bandwidth> getBandwidth() {
            return this.bandwidth;
        }

        public static final class Builder {
            private java.util.List<Bandwidth> bandwidth; 

            private Builder() {
            } 

            private Builder(Bandwidths model) {
                this.bandwidth = model.bandwidth;
            } 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(java.util.List<Bandwidth> bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            public Bandwidths build() {
                return new Bandwidths(this);
            } 

        } 

    }
}
