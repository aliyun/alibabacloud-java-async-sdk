// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderResult} extends {@link TeaModel}
 *
 * <p>OrderResult</p>
 */
public class OrderResult extends TeaModel {
    @NameInMap("createDate")
    private String createDate;

    @NameInMap("distributorId")
    private String distributorId;

    @NameInMap("logisticsStatus")
    private String logisticsStatus;

    @NameInMap("orderAmount")
    private String orderAmount;

    @NameInMap("orderId")
    private String orderId;

    @NameInMap("orderLineList")
    private java.util.List < OrderLineResult > orderLineList;

    @NameInMap("orderStatus")
    private String orderStatus;

    @NameInMap("requestId")
    private String requestId;

    private OrderResult(Builder builder) {
        this.createDate = builder.createDate;
        this.distributorId = builder.distributorId;
        this.logisticsStatus = builder.logisticsStatus;
        this.orderAmount = builder.orderAmount;
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
    public String getOrderAmount() {
        return this.orderAmount;
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
    public java.util.List < OrderLineResult > getOrderLineList() {
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
        private String orderAmount; 
        private String orderId; 
        private java.util.List < OrderLineResult > orderLineList; 
        private String orderStatus; 
        private String requestId; 

        /**
         * createDate.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * distributorId.
         */
        public Builder distributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }

        /**
         * logisticsStatus.
         */
        public Builder logisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }

        /**
         * orderAmount.
         */
        public Builder orderAmount(String orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * orderLineList.
         */
        public Builder orderLineList(java.util.List < OrderLineResult > orderLineList) {
            this.orderLineList = orderLineList;
            return this;
        }

        /**
         * orderStatus.
         */
        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * requestId.
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
