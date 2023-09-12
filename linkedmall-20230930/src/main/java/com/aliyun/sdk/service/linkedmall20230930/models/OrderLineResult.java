// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderLineResult} extends {@link TeaModel}
 *
 * <p>OrderLineResult</p>
 */
public class OrderLineResult extends TeaModel {
    @NameInMap("logisticsStatus")
    private String logisticsStatus;

    @NameInMap("number")
    private String number;

    @NameInMap("orderId")
    private String orderId;

    @NameInMap("orderLineId")
    private String orderLineId;

    @NameInMap("orderLineStatus")
    private String orderLineStatus;

    @NameInMap("productId")
    private String productId;

    @NameInMap("productPic")
    private String productPic;

    @NameInMap("productPrice")
    private java.util.List < ProductPrice > productPrice;

    @NameInMap("productTitle")
    private String productTitle;

    @NameInMap("skuId")
    private String skuId;

    @NameInMap("skuTitle")
    private String skuTitle;

    private OrderLineResult(Builder builder) {
        this.logisticsStatus = builder.logisticsStatus;
        this.number = builder.number;
        this.orderId = builder.orderId;
        this.orderLineId = builder.orderLineId;
        this.orderLineStatus = builder.orderLineStatus;
        this.productId = builder.productId;
        this.productPic = builder.productPic;
        this.productPrice = builder.productPrice;
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
     * @return productPrice
     */
    public java.util.List < ProductPrice > getProductPrice() {
        return this.productPrice;
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
        private String productId; 
        private String productPic; 
        private java.util.List < ProductPrice > productPrice; 
        private String productTitle; 
        private String skuId; 
        private String skuTitle; 

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
         * productPrice.
         */
        public Builder productPrice(java.util.List < ProductPrice > productPrice) {
            this.productPrice = productPrice;
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
