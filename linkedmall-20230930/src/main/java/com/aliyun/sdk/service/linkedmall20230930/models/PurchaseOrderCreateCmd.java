// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseOrderCreateCmd} extends {@link TeaModel}
 *
 * <p>PurchaseOrderCreateCmd</p>
 */
public class PurchaseOrderCreateCmd extends TeaModel {
    @NameInMap("buyerId")
    @Validation(required = true)
    private String buyerId;

    @NameInMap("deliveryAddress")
    @Validation(required = true)
    private AddressInfo deliveryAddress;

    @NameInMap("extInfo")
    private java.util.Map < String, ? > extInfo;

    @NameInMap("outerPurchaseOrderId")
    private String outerPurchaseOrderId;

    @NameInMap("productList")
    @Validation(required = true)
    private java.util.List < ProductDTO > productList;

    private PurchaseOrderCreateCmd(Builder builder) {
        this.buyerId = builder.buyerId;
        this.deliveryAddress = builder.deliveryAddress;
        this.extInfo = builder.extInfo;
        this.outerPurchaseOrderId = builder.outerPurchaseOrderId;
        this.productList = builder.productList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseOrderCreateCmd create() {
        return builder().build();
    }

    /**
     * @return buyerId
     */
    public String getBuyerId() {
        return this.buyerId;
    }

    /**
     * @return deliveryAddress
     */
    public AddressInfo getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * @return extInfo
     */
    public java.util.Map < String, ? > getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return outerPurchaseOrderId
     */
    public String getOuterPurchaseOrderId() {
        return this.outerPurchaseOrderId;
    }

    /**
     * @return productList
     */
    public java.util.List < ProductDTO > getProductList() {
        return this.productList;
    }

    public static final class Builder {
        private String buyerId; 
        private AddressInfo deliveryAddress; 
        private java.util.Map < String, ? > extInfo; 
        private String outerPurchaseOrderId; 
        private java.util.List < ProductDTO > productList; 

        /**
         * buyerId.
         */
        public Builder buyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }

        /**
         * deliveryAddress.
         */
        public Builder deliveryAddress(AddressInfo deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
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
         * outerPurchaseOrderId.
         */
        public Builder outerPurchaseOrderId(String outerPurchaseOrderId) {
            this.outerPurchaseOrderId = outerPurchaseOrderId;
            return this;
        }

        /**
         * productList.
         */
        public Builder productList(java.util.List < ProductDTO > productList) {
            this.productList = productList;
            return this;
        }

        public PurchaseOrderCreateCmd build() {
            return new PurchaseOrderCreateCmd(this);
        } 

    } 

}
