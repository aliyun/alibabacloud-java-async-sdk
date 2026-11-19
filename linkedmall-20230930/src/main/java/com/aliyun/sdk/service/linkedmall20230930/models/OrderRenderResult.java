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
 * {@link OrderRenderResult} extends {@link TeaModel}
 *
 * <p>OrderRenderResult</p>
 */
public class OrderRenderResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("deliveryInfoList")
    private java.util.List<DeliveryInfo> deliveryInfoList;

    @com.aliyun.core.annotation.NameInMap("extInfo")
    private java.util.Map<String, ?> extInfo;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("productList")
    private java.util.List<OrderProductResult> productList;

    private OrderRenderResult(Builder builder) {
        this.canSell = builder.canSell;
        this.deliveryInfoList = builder.deliveryInfoList;
        this.extInfo = builder.extInfo;
        this.message = builder.message;
        this.productList = builder.productList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderRenderResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
    }

    /**
     * @return deliveryInfoList
     */
    public java.util.List<DeliveryInfo> getDeliveryInfoList() {
        return this.deliveryInfoList;
    }

    /**
     * @return extInfo
     */
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return productList
     */
    public java.util.List<OrderProductResult> getProductList() {
        return this.productList;
    }

    public static final class Builder {
        private Boolean canSell; 
        private java.util.List<DeliveryInfo> deliveryInfoList; 
        private java.util.Map<String, ?> extInfo; 
        private String message; 
        private java.util.List<OrderProductResult> productList; 

        private Builder() {
        } 

        private Builder(OrderRenderResult model) {
            this.canSell = model.canSell;
            this.deliveryInfoList = model.deliveryInfoList;
            this.extInfo = model.extInfo;
            this.message = model.message;
            this.productList = model.productList;
        } 

        /**
         * <p>Indicates whether the item is sellable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * <p>The fulfillment information.</p>
         */
        public Builder deliveryInfoList(java.util.List<DeliveryInfo> deliveryInfoList) {
            this.deliveryInfoList = deliveryInfoList;
            return this;
        }

        /**
         * <p>The extension information.</p>
         */
        public Builder extInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>The unsellable reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Inventory is 0</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The product collection.</p>
         */
        public Builder productList(java.util.List<OrderProductResult> productList) {
            this.productList = productList;
            return this;
        }

        public OrderRenderResult build() {
            return new OrderRenderResult(this);
        } 

    } 

}
