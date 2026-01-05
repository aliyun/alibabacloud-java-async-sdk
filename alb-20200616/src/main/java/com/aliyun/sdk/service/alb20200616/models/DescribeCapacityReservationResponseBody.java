// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link DescribeCapacityReservationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityReservationResponseBody</p>
 */
public class DescribeCapacityReservationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapacityReservationState")
    private java.util.List<CapacityReservationState> capacityReservationState;

    @com.aliyun.core.annotation.NameInMap("DecreaseRequestsRemaining")
    private Integer decreaseRequestsRemaining;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("MinimumLoadBalancerCapacity")
    private MinimumLoadBalancerCapacity minimumLoadBalancerCapacity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCapacityReservationResponseBody(Builder builder) {
        this.capacityReservationState = builder.capacityReservationState;
        this.decreaseRequestsRemaining = builder.decreaseRequestsRemaining;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.minimumLoadBalancerCapacity = builder.minimumLoadBalancerCapacity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityReservationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityReservationState
     */
    public java.util.List<CapacityReservationState> getCapacityReservationState() {
        return this.capacityReservationState;
    }

    /**
     * @return decreaseRequestsRemaining
     */
    public Integer getDecreaseRequestsRemaining() {
        return this.decreaseRequestsRemaining;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return minimumLoadBalancerCapacity
     */
    public MinimumLoadBalancerCapacity getMinimumLoadBalancerCapacity() {
        return this.minimumLoadBalancerCapacity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CapacityReservationState> capacityReservationState; 
        private Integer decreaseRequestsRemaining; 
        private String lastModifiedTime; 
        private MinimumLoadBalancerCapacity minimumLoadBalancerCapacity; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCapacityReservationResponseBody model) {
            this.capacityReservationState = model.capacityReservationState;
            this.decreaseRequestsRemaining = model.decreaseRequestsRemaining;
            this.lastModifiedTime = model.lastModifiedTime;
            this.minimumLoadBalancerCapacity = model.minimumLoadBalancerCapacity;
            this.requestId = model.requestId;
        } 

        /**
         * CapacityReservationState.
         */
        public Builder capacityReservationState(java.util.List<CapacityReservationState> capacityReservationState) {
            this.capacityReservationState = capacityReservationState;
            return this;
        }

        /**
         * DecreaseRequestsRemaining.
         */
        public Builder decreaseRequestsRemaining(Integer decreaseRequestsRemaining) {
            this.decreaseRequestsRemaining = decreaseRequestsRemaining;
            return this;
        }

        /**
         * LastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * MinimumLoadBalancerCapacity.
         */
        public Builder minimumLoadBalancerCapacity(MinimumLoadBalancerCapacity minimumLoadBalancerCapacity) {
            this.minimumLoadBalancerCapacity = minimumLoadBalancerCapacity;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCapacityReservationResponseBody build() {
            return new DescribeCapacityReservationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCapacityReservationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationResponseBody</p>
     */
    public static class CapacityReservationState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("EffectiveCapacityUnits")
        private Double effectiveCapacityUnits;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CapacityReservationState(Builder builder) {
            this.availabilityZone = builder.availabilityZone;
            this.effectiveCapacityUnits = builder.effectiveCapacityUnits;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationState create() {
            return builder().build();
        }

        /**
         * @return availabilityZone
         */
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        /**
         * @return effectiveCapacityUnits
         */
        public Double getEffectiveCapacityUnits() {
            return this.effectiveCapacityUnits;
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
            private String availabilityZone; 
            private Double effectiveCapacityUnits; 
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(CapacityReservationState model) {
                this.availabilityZone = model.availabilityZone;
                this.effectiveCapacityUnits = model.effectiveCapacityUnits;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * AvailabilityZone.
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * EffectiveCapacityUnits.
             */
            public Builder effectiveCapacityUnits(Double effectiveCapacityUnits) {
                this.effectiveCapacityUnits = effectiveCapacityUnits;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CapacityReservationState build() {
                return new CapacityReservationState(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCapacityReservationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationResponseBody</p>
     */
    public static class MinimumLoadBalancerCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnits")
        private Integer capacityUnits;

        private MinimumLoadBalancerCapacity(Builder builder) {
            this.capacityUnits = builder.capacityUnits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MinimumLoadBalancerCapacity create() {
            return builder().build();
        }

        /**
         * @return capacityUnits
         */
        public Integer getCapacityUnits() {
            return this.capacityUnits;
        }

        public static final class Builder {
            private Integer capacityUnits; 

            private Builder() {
            } 

            private Builder(MinimumLoadBalancerCapacity model) {
                this.capacityUnits = model.capacityUnits;
            } 

            /**
             * CapacityUnits.
             */
            public Builder capacityUnits(Integer capacityUnits) {
                this.capacityUnits = capacityUnits;
                return this;
            }

            public MinimumLoadBalancerCapacity build() {
                return new MinimumLoadBalancerCapacity(this);
            } 

        } 

    }
}
