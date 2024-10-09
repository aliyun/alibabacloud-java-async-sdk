// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyReservedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyReservedInstancesResponseBody</p>
 */
public class ModifyReservedInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservedInstanceIdSets")
    private ReservedInstanceIdSets reservedInstanceIdSets;

    private ModifyReservedInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.reservedInstanceIdSets = builder.reservedInstanceIdSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReservedInstancesResponseBody create() {
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
         * <p>Details about the reserved instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ED9E4A5F-FF4D-4C96-BE80-6B4227060DD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the reserved instances.</p>
         */
        public Builder reservedInstanceIdSets(ReservedInstanceIdSets reservedInstanceIdSets) {
            this.reservedInstanceIdSets = reservedInstanceIdSets;
            return this;
        }

        public ModifyReservedInstancesResponseBody build() {
            return new ModifyReservedInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyReservedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyReservedInstancesResponseBody</p>
     */
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
