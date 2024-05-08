// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewReservedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RenewReservedInstancesResponseBody</p>
 */
public class RenewReservedInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservedInstanceIdSets")
    private ReservedInstanceIdSets reservedInstanceIdSets;

    private RenewReservedInstancesResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.reservedInstanceIdSets = builder.reservedInstanceIdSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewReservedInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reservedInstanceIdSets
     */
    public ReservedInstanceIdSets getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private ReservedInstanceIdSets reservedInstanceIdSets; 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The IDs of the reserved instances.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the reserved instance.
         */
        public Builder reservedInstanceIdSets(ReservedInstanceIdSets reservedInstanceIdSets) {
            this.reservedInstanceIdSets = reservedInstanceIdSets;
            return this;
        }

        public RenewReservedInstancesResponseBody build() {
            return new RenewReservedInstancesResponseBody(this);
        } 

    } 

    public static class ReservedInstanceIdSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReservedInstanceId")
        private java.util.List < String > reservedInstanceId;

        private ReservedInstanceIdSets(Builder builder) {
            this.reservedInstanceId = builder.reservedInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstanceIdSets create() {
            return builder().build();
        }

        /**
         * @return reservedInstanceId
         */
        public java.util.List < String > getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > reservedInstanceId; 

            /**
             * ReservedInstanceId.
             */
            public Builder reservedInstanceId(java.util.List < String > reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            public ReservedInstanceIdSets build() {
                return new ReservedInstanceIdSets(this);
            } 

        } 

    }
}
