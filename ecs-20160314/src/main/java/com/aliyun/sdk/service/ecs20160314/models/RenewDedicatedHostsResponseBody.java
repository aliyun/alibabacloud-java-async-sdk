// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDedicatedHostsResponseBody} extends {@link TeaModel}
 *
 * <p>RenewDedicatedHostsResponseBody</p>
 */
public class RenewDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("DedicatedHostIdSets")
    private DedicatedHostIdSets dedicatedHostIdSets;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private RenewDedicatedHostsResponseBody(Builder builder) {
        this.dedicatedHostIdSets = builder.dedicatedHostIdSets;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewDedicatedHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostIdSets
     */
    public DedicatedHostIdSets getDedicatedHostIdSets() {
        return this.dedicatedHostIdSets;
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

    public static final class Builder {
        private DedicatedHostIdSets dedicatedHostIdSets; 
        private String orderId; 
        private String requestId; 

        /**
         * DedicatedHostIdSets.
         */
        public Builder dedicatedHostIdSets(DedicatedHostIdSets dedicatedHostIdSets) {
            this.dedicatedHostIdSets = dedicatedHostIdSets;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenewDedicatedHostsResponseBody build() {
            return new RenewDedicatedHostsResponseBody(this);
        } 

    } 

    public static class DedicatedHostIdSets extends TeaModel {
        @NameInMap("DedicatedHostId")
        private java.util.List < String > dedicatedHostId;

        private DedicatedHostIdSets(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostIdSets create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public java.util.List < String > getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private java.util.List < String > dedicatedHostId; 

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(java.util.List < String > dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public DedicatedHostIdSets build() {
                return new DedicatedHostIdSets(this);
            } 

        } 

    }
}
