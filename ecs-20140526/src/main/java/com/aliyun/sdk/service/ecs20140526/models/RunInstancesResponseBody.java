// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RunInstancesResponseBody</p>
 */
public class RunInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceIdSets")
    private InstanceIdSets instanceIdSets;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TradePrice")
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

        /**
         * InstanceIdSets.
         */
        public Builder instanceIdSets(InstanceIdSets instanceIdSets) {
            this.instanceIdSets = instanceIdSets;
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

        /**
         * TradePrice.
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public RunInstancesResponseBody build() {
            return new RunInstancesResponseBody(this);
        } 

    } 

    public static class InstanceIdSets extends TeaModel {
        @NameInMap("InstanceIdSet")
        private java.util.List < String > instanceIdSet;

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
        public java.util.List < String > getInstanceIdSet() {
            return this.instanceIdSet;
        }

        public static final class Builder {
            private java.util.List < String > instanceIdSet; 

            /**
             * InstanceIdSet.
             */
            public Builder instanceIdSet(java.util.List < String > instanceIdSet) {
                this.instanceIdSet = instanceIdSet;
                return this;
            }

            public InstanceIdSets build() {
                return new InstanceIdSets(this);
            } 

        } 

    }
}
