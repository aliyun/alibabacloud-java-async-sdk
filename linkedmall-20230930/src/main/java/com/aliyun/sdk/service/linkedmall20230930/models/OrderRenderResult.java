// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderRenderResult} extends {@link TeaModel}
 *
 * <p>OrderRenderResult</p>
 */
public class OrderRenderResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("deliveryInfoList")
    private java.util.List < DeliveryInfo > deliveryInfoList;

    @com.aliyun.core.annotation.NameInMap("extInfo")
    private java.util.Map < String, ? > extInfo;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("productList")
    private java.util.List < OrderProductResult > productList;

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

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
    }

    /**
     * @return deliveryInfoList
     */
    public java.util.List < DeliveryInfo > getDeliveryInfoList() {
        return this.deliveryInfoList;
    }

    /**
     * @return extInfo
     */
    public java.util.Map < String, ? > getExtInfo() {
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
    public java.util.List < OrderProductResult > getProductList() {
        return this.productList;
    }

    public static final class Builder {
        private Boolean canSell; 
        private java.util.List < DeliveryInfo > deliveryInfoList; 
        private java.util.Map < String, ? > extInfo; 
        private String message; 
        private java.util.List < OrderProductResult > productList; 

        /**
         * canSell.
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }

        /**
         * deliveryInfoList.
         */
        public Builder deliveryInfoList(java.util.List < DeliveryInfo > deliveryInfoList) {
            this.deliveryInfoList = deliveryInfoList;
            return this;
        }

        /**
         * extInfo.
         */
        public Builder extInfo(java.util.Map < String, ? > extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * productList.
         */
        public Builder productList(java.util.List < OrderProductResult > productList) {
            this.productList = productList;
            return this;
        }

        public OrderRenderResult build() {
            return new OrderRenderResult(this);
        } 

    } 

}
