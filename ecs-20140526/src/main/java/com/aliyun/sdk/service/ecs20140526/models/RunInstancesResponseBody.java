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
 * {@link RunInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RunInstancesResponseBody</p>
 */
public class RunInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIdSets")
    private InstanceIdSets instanceIdSets;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TradePrice")
    private Float tradePrice;

    private RunInstancesResponseBody(Builder builder) {
        this.instanceIdSets = builder.instanceIdSets;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdSets
     */
    public InstanceIdSets getInstanceIdSets() {
        return this.instanceIdSets;
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
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private InstanceIdSets instanceIdSets; 
        private String orderId; 
        private String requestId; 
        private Float tradePrice; 

        private Builder() {
        } 

        private Builder(RunInstancesResponseBody model) {
            this.instanceIdSets = model.instanceIdSets;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
            this.tradePrice = model.tradePrice;
        } 

        /**
         * <p>The IDs of the instances (<code>InstanceIdSet</code>).</p>
         */
        public Builder instanceIdSets(InstanceIdSets instanceIdSets) {
            this.instanceIdSets = instanceIdSets;
            return this;
        }

        /**
         * <p>The ID of the order. This parameter is returned only when <code>InstanceChargeType</code> is set to PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.165</p>
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public RunInstancesResponseBody build() {
            return new RunInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>RunInstancesResponseBody</p>
     */
    public static class InstanceIdSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIdSet")
        private java.util.List<String> instanceIdSet;

        private InstanceIdSets(Builder builder) {
            this.instanceIdSet = builder.instanceIdSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIdSets create() {
            return builder().build();
        }

        /**
         * @return instanceIdSet
         */
        public java.util.List<String> getInstanceIdSet() {
            return this.instanceIdSet;
        }

        public static final class Builder {
            private java.util.List<String> instanceIdSet; 

            private Builder() {
            } 

            private Builder(InstanceIdSets model) {
                this.instanceIdSet = model.instanceIdSet;
            } 

            /**
             * InstanceIdSet.
             */
            public Builder instanceIdSet(java.util.List<String> instanceIdSet) {
                this.instanceIdSet = instanceIdSet;
                return this;
            }

            public InstanceIdSets build() {
                return new InstanceIdSets(this);
            } 

        } 

    }
}
