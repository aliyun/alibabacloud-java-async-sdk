// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderResponseBody</p>
 */
public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("OrderParams")
    private OrderParams orderParams;

    @NameInMap("RelatedOrderItemSets")
    private RelatedOrderItemSets relatedOrderItemSets;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TradePrice")
    private Float tradePrice;

    private CreateOrderResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.orderParams = builder.orderParams;
        this.relatedOrderItemSets = builder.relatedOrderItemSets;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.tradePrice = builder.tradePrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderParams
     */
    public OrderParams getOrderParams() {
        return this.orderParams;
    }

    /**
     * @return relatedOrderItemSets
     */
    public RelatedOrderItemSets getRelatedOrderItemSets() {
        return this.relatedOrderItemSets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return tradePrice
     */
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public static final class Builder {
        private String orderId; 
        private OrderParams orderParams; 
        private RelatedOrderItemSets relatedOrderItemSets; 
        private String requestId; 
        private String taskId; 
        private Float tradePrice; 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * OrderParams.
         */
        public Builder orderParams(OrderParams orderParams) {
            this.orderParams = orderParams;
            return this;
        }

        /**
         * RelatedOrderItemSets.
         */
        public Builder relatedOrderItemSets(RelatedOrderItemSets relatedOrderItemSets) {
            this.relatedOrderItemSets = relatedOrderItemSets;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TradePrice.
         */
        public Builder tradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public CreateOrderResponseBody build() {
            return new CreateOrderResponseBody(this);
        } 

    } 

    public static class OrderParams extends TeaModel {
        @NameInMap("OrderParam")
        private java.util.List < String > orderParam;

        private OrderParams(Builder builder) {
            this.orderParam = builder.orderParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderParams create() {
            return builder().build();
        }

        /**
         * @return orderParam
         */
        public java.util.List < String > getOrderParam() {
            return this.orderParam;
        }

        public static final class Builder {
            private java.util.List < String > orderParam; 

            /**
             * OrderParam.
             */
            public Builder orderParam(java.util.List < String > orderParam) {
                this.orderParam = orderParam;
                return this;
            }

            public OrderParams build() {
                return new OrderParams(this);
            } 

        } 

    }
    public static class InstanceIdSet extends TeaModel {
        @NameInMap("InstanceIds")
        private java.util.List < String > instanceIds;

        private InstanceIdSet(Builder builder) {
            this.instanceIds = builder.instanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIdSet create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List < String > getInstanceIds() {
            return this.instanceIds;
        }

        public static final class Builder {
            private java.util.List < String > instanceIds; 

            /**
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List < String > instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            public InstanceIdSet build() {
                return new InstanceIdSet(this);
            } 

        } 

    }
    public static class RelatedOrderIds extends TeaModel {
        @NameInMap("RelatedOrderId")
        private java.util.List < String > relatedOrderId;

        private RelatedOrderIds(Builder builder) {
            this.relatedOrderId = builder.relatedOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedOrderIds create() {
            return builder().build();
        }

        /**
         * @return relatedOrderId
         */
        public java.util.List < String > getRelatedOrderId() {
            return this.relatedOrderId;
        }

        public static final class Builder {
            private java.util.List < String > relatedOrderId; 

            /**
             * RelatedOrderId.
             */
            public Builder relatedOrderId(java.util.List < String > relatedOrderId) {
                this.relatedOrderId = relatedOrderId;
                return this;
            }

            public RelatedOrderIds build() {
                return new RelatedOrderIds(this);
            } 

        } 

    }
    public static class RelatedOrderItemSet extends TeaModel {
        @NameInMap("InstanceIdSet")
        private InstanceIdSet instanceIdSet;

        @NameInMap("RelatedOrderIds")
        private RelatedOrderIds relatedOrderIds;

        private RelatedOrderItemSet(Builder builder) {
            this.instanceIdSet = builder.instanceIdSet;
            this.relatedOrderIds = builder.relatedOrderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedOrderItemSet create() {
            return builder().build();
        }

        /**
         * @return instanceIdSet
         */
        public InstanceIdSet getInstanceIdSet() {
            return this.instanceIdSet;
        }

        /**
         * @return relatedOrderIds
         */
        public RelatedOrderIds getRelatedOrderIds() {
            return this.relatedOrderIds;
        }

        public static final class Builder {
            private InstanceIdSet instanceIdSet; 
            private RelatedOrderIds relatedOrderIds; 

            /**
             * InstanceIdSet.
             */
            public Builder instanceIdSet(InstanceIdSet instanceIdSet) {
                this.instanceIdSet = instanceIdSet;
                return this;
            }

            /**
             * RelatedOrderIds.
             */
            public Builder relatedOrderIds(RelatedOrderIds relatedOrderIds) {
                this.relatedOrderIds = relatedOrderIds;
                return this;
            }

            public RelatedOrderItemSet build() {
                return new RelatedOrderItemSet(this);
            } 

        } 

    }
    public static class RelatedOrderItemSets extends TeaModel {
        @NameInMap("RelatedOrderItemSet")
        private java.util.List < RelatedOrderItemSet> relatedOrderItemSet;

        private RelatedOrderItemSets(Builder builder) {
            this.relatedOrderItemSet = builder.relatedOrderItemSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedOrderItemSets create() {
            return builder().build();
        }

        /**
         * @return relatedOrderItemSet
         */
        public java.util.List < RelatedOrderItemSet> getRelatedOrderItemSet() {
            return this.relatedOrderItemSet;
        }

        public static final class Builder {
            private java.util.List < RelatedOrderItemSet> relatedOrderItemSet; 

            /**
             * RelatedOrderItemSet.
             */
            public Builder relatedOrderItemSet(java.util.List < RelatedOrderItemSet> relatedOrderItemSet) {
                this.relatedOrderItemSet = relatedOrderItemSet;
                return this;
            }

            public RelatedOrderItemSets build() {
                return new RelatedOrderItemSets(this);
            } 

        } 

    }
}
