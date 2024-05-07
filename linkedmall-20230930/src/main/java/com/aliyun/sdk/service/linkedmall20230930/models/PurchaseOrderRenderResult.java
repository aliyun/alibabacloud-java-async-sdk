// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseOrderRenderResult} extends {@link TeaModel}
 *
 * <p>PurchaseOrderRenderResult</p>
 */
public class PurchaseOrderRenderResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addressList")
    private java.util.List < AddressInfo > addressList;

    @com.aliyun.core.annotation.NameInMap("canSell")
    private Boolean canSell;

    @com.aliyun.core.annotation.NameInMap("extInfo")
    private java.util.Map < String, ? > extInfo;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("orderList")
    private java.util.List < OrderRenderResult > orderList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("unsellableOrderList")
    private java.util.List < OrderRenderResult > unsellableOrderList;

    private PurchaseOrderRenderResult(Builder builder) {
        this.addressList = builder.addressList;
        this.canSell = builder.canSell;
        this.extInfo = builder.extInfo;
        this.message = builder.message;
        this.orderList = builder.orderList;
        this.requestId = builder.requestId;
        this.unsellableOrderList = builder.unsellableOrderList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseOrderRenderResult create() {
        return builder().build();
    }

    /**
     * @return addressList
     */
    public java.util.List < AddressInfo > getAddressList() {
        return this.addressList;
    }

    /**
     * @return canSell
     */
    public Boolean getCanSell() {
        return this.canSell;
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
     * @return orderList
     */
    public java.util.List < OrderRenderResult > getOrderList() {
        return this.orderList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unsellableOrderList
     */
    public java.util.List < OrderRenderResult > getUnsellableOrderList() {
        return this.unsellableOrderList;
    }

    public static final class Builder {
        private java.util.List < AddressInfo > addressList; 
        private Boolean canSell; 
        private java.util.Map < String, ? > extInfo; 
        private String message; 
        private java.util.List < OrderRenderResult > orderList; 
        private String requestId; 
        private java.util.List < OrderRenderResult > unsellableOrderList; 

        /**
         * addressList.
         */
        public Builder addressList(java.util.List < AddressInfo > addressList) {
            this.addressList = addressList;
            return this;
        }

        /**
         * canSell.
         */
        public Builder canSell(Boolean canSell) {
            this.canSell = canSell;
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
         * orderList.
         */
        public Builder orderList(java.util.List < OrderRenderResult > orderList) {
            this.orderList = orderList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * unsellableOrderList.
         */
        public Builder unsellableOrderList(java.util.List < OrderRenderResult > unsellableOrderList) {
            this.unsellableOrderList = unsellableOrderList;
            return this;
        }

        public PurchaseOrderRenderResult build() {
            return new PurchaseOrderRenderResult(this);
        } 

    } 

}
