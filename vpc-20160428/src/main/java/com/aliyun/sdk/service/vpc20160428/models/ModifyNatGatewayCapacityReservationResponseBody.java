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
 * {@link ModifyNatGatewayCapacityReservationResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyNatGatewayCapacityReservationResponseBody</p>
 */
public class ModifyNatGatewayCapacityReservationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapacityReservationStatus")
    private CapacityReservationStatus capacityReservationStatus;

    @com.aliyun.core.annotation.NameInMap("DecreaseRequestsRemaining")
    private Integer decreaseRequestsRemaining;

    @com.aliyun.core.annotation.NameInMap("NatGatewayCapacity")
    private NatGatewayCapacity natGatewayCapacity;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NatGatewayPerformanceValues")
    private NatGatewayPerformanceValues natGatewayPerformanceValues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyNatGatewayCapacityReservationResponseBody(Builder builder) {
        this.capacityReservationStatus = builder.capacityReservationStatus;
        this.decreaseRequestsRemaining = builder.decreaseRequestsRemaining;
        this.natGatewayCapacity = builder.natGatewayCapacity;
        this.natGatewayId = builder.natGatewayId;
        this.natGatewayPerformanceValues = builder.natGatewayPerformanceValues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNatGatewayCapacityReservationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityReservationStatus
     */
    public CapacityReservationStatus getCapacityReservationStatus() {
        return this.capacityReservationStatus;
    }

    /**
     * @return decreaseRequestsRemaining
     */
    public Integer getDecreaseRequestsRemaining() {
        return this.decreaseRequestsRemaining;
    }

    /**
     * @return natGatewayCapacity
     */
    public NatGatewayCapacity getNatGatewayCapacity() {
        return this.natGatewayCapacity;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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
        private CapacityReservationStatus capacityReservationStatus; 
        private Integer decreaseRequestsRemaining; 
        private NatGatewayCapacity natGatewayCapacity; 
        private String natGatewayId; 
        private NatGatewayPerformanceValues natGatewayPerformanceValues; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyNatGatewayCapacityReservationResponseBody model) {
            this.capacityReservationStatus = model.capacityReservationStatus;
            this.decreaseRequestsRemaining = model.decreaseRequestsRemaining;
            this.natGatewayCapacity = model.natGatewayCapacity;
            this.natGatewayId = model.natGatewayId;
            this.natGatewayPerformanceValues = model.natGatewayPerformanceValues;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of the resource reservation.</p>
         */
        public Builder capacityReservationStatus(CapacityReservationStatus capacityReservationStatus) {
            this.capacityReservationStatus = capacityReservationStatus;
            return this;
        }

        /**
         * <p>The remaining number of times that you can downgrade the configuration or cancel the resource reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder decreaseRequestsRemaining(Integer decreaseRequestsRemaining) {
            this.decreaseRequestsRemaining = decreaseRequestsRemaining;
            return this;
        }

        /**
         * <p>The number of capacity units (CUs) for the NAT resource reservation.</p>
         */
        public Builder natGatewayCapacity(NatGatewayCapacity natGatewayCapacity) {
            this.natGatewayCapacity = natGatewayCapacity;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-112za33e4****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The performance metrics of the NAT resource reservation.</p>
         */
        public Builder natGatewayPerformanceValues(NatGatewayPerformanceValues natGatewayPerformanceValues) {
            this.natGatewayPerformanceValues = natGatewayPerformanceValues;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B400EF57-60E3-4D61-B8FB-7FA8F72DF5A6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyNatGatewayCapacityReservationResponseBody build() {
            return new ModifyNatGatewayCapacityReservationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyNatGatewayCapacityReservationResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyNatGatewayCapacityReservationResponseBody</p>
     */
    public static class CapacityReservationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CapacityReservationStatus(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationStatus create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(CapacityReservationStatus model) {
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The reason for the processing failure.</p>
             * 
             * <strong>example:</strong>
             * <p>No Available Resource</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the resource reservation. Valid values:</p>
             * <ul>
             * <li><p>pending: The reservation is in progress.</p>
             * </li>
             * <li><p>provisioned: The reservation is completed.</p>
             * </li>
             * <li><p>failed: The reservation failed.</p>
             * </li>
             * <li><p>deleting: The reservation is being deleted.</p>
             * </li>
             * <li><p>deleted: The reservation is deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CapacityReservationStatus build() {
                return new CapacityReservationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyNatGatewayCapacityReservationResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyNatGatewayCapacityReservationResponseBody</p>
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
             * <p>The number of LCUs reserved per hour.</p>
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
     * {@link ModifyNatGatewayCapacityReservationResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyNatGatewayCapacityReservationResponseBody</p>
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
             * <p>The bandwidth value. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The number of new connections.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The number of packets. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>3200000</p>
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>2000000</p>
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
