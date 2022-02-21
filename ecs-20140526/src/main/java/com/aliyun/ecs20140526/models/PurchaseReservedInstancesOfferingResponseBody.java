// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseReservedInstancesOfferingResponseBody} extends {@link TeaModel}
 *
 * <p>PurchaseReservedInstancesOfferingResponseBody</p>
 */
public class PurchaseReservedInstancesOfferingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ReservedInstanceIdSets")
    private ReservedInstanceIdSets reservedInstanceIdSets;

    private PurchaseReservedInstancesOfferingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.reservedInstanceIdSets = builder.reservedInstanceIdSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseReservedInstancesOfferingResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private ReservedInstanceIdSets reservedInstanceIdSets; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReservedInstanceIdSets.
         */
        public Builder reservedInstanceIdSets(ReservedInstanceIdSets reservedInstanceIdSets) {
            this.reservedInstanceIdSets = reservedInstanceIdSets;
            return this;
        }

        public PurchaseReservedInstancesOfferingResponseBody build() {
            return new PurchaseReservedInstancesOfferingResponseBody(this);
        } 

    } 

    public static class ReservedInstanceIdSets extends TeaModel {
        @NameInMap("ReservedInstanceId")
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
