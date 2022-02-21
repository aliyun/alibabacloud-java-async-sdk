// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("TradePrice")
    private Float tradePrice;

    @NameInMap("InstanceIdSets")
    private InstanceIdSets instanceIdSets;

    private RunInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.orderId = builder.orderId;
        this.tradePrice = builder.tradePrice;
        this.instanceIdSets = builder.instanceIdSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    /**
     * @return instanceIdSets
     */
    public InstanceIdSets getInstanceIdSets() {
        return this.instanceIdSets;
    }

    public static final class Builder {
        private String requestId; 
        private String orderId; 
        private Float tradePrice; 
        private InstanceIdSets instanceIdSets; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the order. The parameter only create annual commitment monthly ECS instance (request parameters "instancechargetype = prepaid") when return value.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Order selling price.
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        /**
         * Instance ID ("instanceidset") list.
         */
        public Builder instanceIdSets(InstanceIdSets instanceIdSets) {
            this.instanceIdSets = instanceIdSets;
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
