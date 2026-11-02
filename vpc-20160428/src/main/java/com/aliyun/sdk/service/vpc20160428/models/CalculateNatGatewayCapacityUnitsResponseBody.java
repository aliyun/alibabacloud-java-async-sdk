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
 * {@link CalculateNatGatewayCapacityUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>CalculateNatGatewayCapacityUnitsResponseBody</p>
 */
public class CalculateNatGatewayCapacityUnitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatGatewayCapacity")
    private NatGatewayCapacity natGatewayCapacity;

    @com.aliyun.core.annotation.NameInMap("NatGatewayPerformanceValues")
    private NatGatewayPerformanceValues natGatewayPerformanceValues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CalculateNatGatewayCapacityUnitsResponseBody(Builder builder) {
        this.natGatewayCapacity = builder.natGatewayCapacity;
        this.natGatewayPerformanceValues = builder.natGatewayPerformanceValues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CalculateNatGatewayCapacityUnitsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGatewayCapacity
     */
    public NatGatewayCapacity getNatGatewayCapacity() {
        return this.natGatewayCapacity;
    }

    /**
     * @return natGatewayPerformanceValues
     */
    public NatGatewayPerformanceValues getNatGatewayPerformanceValues() {
        return this.natGatewayPerformanceValues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NatGatewayCapacity natGatewayCapacity; 
        private NatGatewayPerformanceValues natGatewayPerformanceValues; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CalculateNatGatewayCapacityUnitsResponseBody model) {
            this.natGatewayCapacity = model.natGatewayCapacity;
            this.natGatewayPerformanceValues = model.natGatewayPerformanceValues;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the calculated equivalent resource reservation CUs.</p>
         */
        public Builder natGatewayCapacity(NatGatewayCapacity natGatewayCapacity) {
            this.natGatewayCapacity = natGatewayCapacity;
            return this;
        }

        /**
         * <p>The details of the calculated equivalent resource reservation metrics.</p>
         */
        public Builder natGatewayPerformanceValues(NatGatewayPerformanceValues natGatewayPerformanceValues) {
            this.natGatewayPerformanceValues = natGatewayPerformanceValues;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CalculateNatGatewayCapacityUnitsResponseBody build() {
            return new CalculateNatGatewayCapacityUnitsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CalculateNatGatewayCapacityUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>CalculateNatGatewayCapacityUnitsResponseBody</p>
     */
    public static class NatGatewayCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnits")
        private Double capacityUnits;

        private NatGatewayCapacity(Builder builder) {
            this.capacityUnits = builder.capacityUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayCapacity create() {
            return builder().build();
        }

        /**
         * @return capacityUnits
         */
        public Double getCapacityUnits() {
            return this.capacityUnits;
        }

        public static final class Builder {
            private Double capacityUnits; 

            private Builder() {
            } 

            private Builder(NatGatewayCapacity model) {
                this.capacityUnits = model.capacityUnits;
            } 

            /**
             * <p>The number of reserved LCUs per hour.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacityUnits(Double capacityUnits) {
                this.capacityUnits = capacityUnits;
                return this;
            }

            public NatGatewayCapacity build() {
                return new NatGatewayCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link CalculateNatGatewayCapacityUnitsResponseBody} extends {@link TeaModel}
     *
     * <p>CalculateNatGatewayCapacityUnitsResponseBody</p>
     */
    public static class NatGatewayPerformanceValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Integer cps;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Integer pps;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Integer sessionCount;

        private NatGatewayPerformanceValues(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.cps = builder.cps;
            this.pps = builder.pps;
            this.sessionCount = builder.sessionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayPerformanceValues create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return cps
         */
        public Integer getCps() {
            return this.cps;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        /**
         * @return sessionCount
         */
        public Integer getSessionCount() {
            return this.sessionCount;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private Integer cps; 
            private Integer pps; 
            private Integer sessionCount; 

            private Builder() {
            } 

            private Builder(NatGatewayPerformanceValues model) {
                this.bandwidth = model.bandwidth;
                this.cps = model.cps;
                this.pps = model.pps;
                this.sessionCount = model.sessionCount;
            } 

            /**
             * <p>The bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The maximum number of new connections per second.</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The number of packets. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>160000</p>
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder sessionCount(Integer sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            public NatGatewayPerformanceValues build() {
                return new NatGatewayPerformanceValues(this);
            } 

        } 

    }
}
