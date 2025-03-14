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
 * {@link OrderLineResult} extends {@link TeaModel}
 *
 * <p>OrderLineResult</p>
 */
public class OrderLineResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logisticsStatus")
    private String logisticsStatus;

    @com.aliyun.core.annotation.NameInMap("number")
    private String number;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("orderLineId")
    private String orderLineId;

    @com.aliyun.core.annotation.NameInMap("orderLineStatus")
    private String orderLineStatus;

    @com.aliyun.core.annotation.NameInMap("payFee")
    private Long payFee;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("productPic")
    private String productPic;

    @com.aliyun.core.annotation.NameInMap("productTitle")
    private String productTitle;

    @com.aliyun.core.annotation.NameInMap("skuId")
    private String skuId;

    @com.aliyun.core.annotation.NameInMap("skuTitle")
    private String skuTitle;

    private OrderLineResult(Builder builder) {
        this.logisticsStatus = builder.logisticsStatus;
        this.number = builder.number;
        this.orderId = builder.orderId;
        this.orderLineId = builder.orderLineId;
        this.orderLineStatus = builder.orderLineStatus;
        this.payFee = builder.payFee;
        this.productId = builder.productId;
        this.productPic = builder.productPic;
        this.productTitle = builder.productTitle;
        this.skuId = builder.skuId;
        this.skuTitle = builder.skuTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderLineResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logisticsStatus
     */
    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderLineId
     */
    public String getOrderLineId() {
        return this.orderLineId;
    }

    /**
     * @return orderLineStatus
     */
    public String getOrderLineStatus() {
        return this.orderLineStatus;
    }

    /**
     * @return payFee
     */
    public Long getPayFee() {
        return this.payFee;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return productPic
     */
    public String getProductPic() {
        return this.productPic;
    }

    /**
     * @return productTitle
     */
    public String getProductTitle() {
        return this.productTitle;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return skuTitle
     */
    public String getSkuTitle() {
        return this.skuTitle;
    }

    public static final class Builder {
        private String logisticsStatus; 
        private String number; 
        private String orderId; 
        private String orderLineId; 
        private String orderLineStatus; 
        private Long payFee; 
        private String productId; 
        private String productPic; 
        private String productTitle; 
        private String skuId; 
        private String skuTitle; 

        private Builder() {
        } 

        private Builder(OrderLineResult model) {
            this.logisticsStatus = model.logisticsStatus;
            this.number = model.number;
            this.orderId = model.orderId;
            this.orderLineId = model.orderLineId;
            this.orderLineStatus = model.orderLineStatus;
            this.payFee = model.payFee;
            this.productId = model.productId;
            this.productPic = model.productPic;
            this.productTitle = model.productTitle;
            this.skuId = model.skuId;
            this.skuTitle = model.skuTitle;
        } 

        /**
         * logisticsStatus.
         */
        public Builder logisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }

        /**
         * number.
         */
        public Builder number(String number) {
            this.number = number;
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
         * orderLineId.
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /**
         * orderLineStatus.
         */
        public Builder orderLineStatus(String orderLineStatus) {
            this.orderLineStatus = orderLineStatus;
            return this;
        }

        /**
         * payFee.
         */
        public Builder payFee(Long payFee) {
            this.payFee = payFee;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * productPic.
         */
        public Builder productPic(String productPic) {
            this.productPic = productPic;
            return this;
        }

        /**
         * productTitle.
         */
        public Builder productTitle(String productTitle) {
            this.productTitle = productTitle;
            return this;
        }

        /**
         * skuId.
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        /**
         * skuTitle.
         */
        public Builder skuTitle(String skuTitle) {
            this.skuTitle = skuTitle;
            return this;
        }

        public OrderLineResult build() {
            return new OrderLineResult(this);
        } 

    } 

}
