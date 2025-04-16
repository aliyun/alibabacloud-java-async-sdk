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
 * {@link AllocateDedicatedHostsResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateDedicatedHostsResponseBody</p>
 */
public class AllocateDedicatedHostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHostIdSets")
    private DedicatedHostIdSets dedicatedHostIdSets;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocateDedicatedHostsResponseBody(Builder builder) {
        this.dedicatedHostIdSets = builder.dedicatedHostIdSets;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateDedicatedHostsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AllocateDedicatedHostsResponseBody model) {
            this.dedicatedHostIdSets = model.dedicatedHostIdSets;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of dedicated host IDs.</p>
         */
        public Builder dedicatedHostIdSets(DedicatedHostIdSets dedicatedHostIdSets) {
            this.dedicatedHostIdSets = dedicatedHostIdSets;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * <blockquote>
         * <p> This parameter has a return value only when the dedicated host is a subscription one (request parameter <strong>ChargeType set to PrePaid</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23841229****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E2A664A6-2933-4C64-88AE-5033D003****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateDedicatedHostsResponseBody build() {
            return new AllocateDedicatedHostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AllocateDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>AllocateDedicatedHostsResponseBody</p>
     */
    public static class DedicatedHostIdSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private java.util.List<String> dedicatedHostId;

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
        public java.util.List<String> getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private java.util.List<String> dedicatedHostId; 

            private Builder() {
            } 

            private Builder(DedicatedHostIdSets model) {
                this.dedicatedHostId = model.dedicatedHostId;
            } 

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(java.util.List<String> dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public DedicatedHostIdSets build() {
                return new DedicatedHostIdSets(this);
            } 

        } 

    }
}
