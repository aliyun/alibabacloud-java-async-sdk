// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link OrderResult} extends {@link TeaModel}
 *
 * <p>OrderResult</p>
 */
public class OrderResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("distributorId")
    private String distributorId;

    @com.aliyun.core.annotation.NameInMap("logisticsStatus")
    private String logisticsStatus;

    @com.aliyun.core.annotation.NameInMap("orderAmount")
    private Long orderAmount;

    @com.aliyun.core.annotation.NameInMap("orderClosedReason")
    private String orderClosedReason;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("orderLineList")
    private java.util.List<OrderLineResult> orderLineList;

    @com.aliyun.core.annotation.NameInMap("orderStatus")
    private String orderStatus;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private OrderResult(Builder builder) {
        this.createDate = builder.createDate;
        this.distributorId = builder.distributorId;
        this.logisticsStatus = builder.logisticsStatus;
        this.orderAmount = builder.orderAmount;
        this.orderClosedReason = builder.orderClosedReason;
        this.orderId = builder.orderId;
        this.orderLineList = builder.orderLineList;
        this.orderStatus = builder.orderStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return logisticsStatus
     */
    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    /**
     * @return orderAmount
     */
    public Long getOrderAmount() {
        return this.orderAmount;
    }

    /**
     * @return orderClosedReason
     */
    public String getOrderClosedReason() {
        return this.orderClosedReason;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderLineList
     */
    public java.util.List<OrderLineResult> getOrderLineList() {
        return this.orderLineList;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createDate; 
        private String distributorId; 
        private String logisticsStatus; 
        private Long orderAmount; 
        private String orderClosedReason; 
        private String orderId; 
        private java.util.List<OrderLineResult> orderLineList; 
        private String orderStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(OrderResult model) {
            this.createDate = model.createDate;
            this.distributorId = model.distributorId;
            this.logisticsStatus = model.logisticsStatus;
            this.orderAmount = model.orderAmount;
            this.orderClosedReason = model.orderClosedReason;
            this.orderId = model.orderId;
            this.orderLineList = model.orderLineList;
            this.orderStatus = model.orderStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The order creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-01T12:00:00.000Z</p>
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * <p>The distributor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12****01</p>
         */
        public Builder distributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }

        /**
         * <p>The logistics status. Valid values: 1 (Awaiting Seller\&quot;s Shipment), 2 (Awaiting Buyer\&quot;s Confirmation), 3 (Received), 4 (Returned), 5 (Partially Received), 6 (Partially Shipped), and 8 (Logistics Order Not Created).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }

        /**
         * <p>The order amount, in cents.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder orderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }

        /**
         * <p>The reason the order was closed.</p>
         * 
         * <strong>example:</strong>
         * <p>系统关单</p>
         */
        public Builder orderClosedReason(String orderClosedReason) {
            this.orderClosedReason = orderClosedReason;
            return this;
        }

        /**
         * <p>The ID of the main order.</p>
         * 
         * <strong>example:</strong>
         * <p>6692****5457</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The list of sub-orders.</p>
         */
        public Builder orderLineList(java.util.List<OrderLineResult> orderLineList) {
            this.orderLineList = orderLineList;
            return this;
        }

        /**
         * <p>The order status. Valid values: 1 (Pending Payment), 2 (Paid), 4 (Closed with Refund), 6 (Transaction Successful), and 8 (Closed).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * <p>The unique identifier for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D12***111</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OrderResult build() {
            return new OrderResult(this);
        } 

    } 

}
