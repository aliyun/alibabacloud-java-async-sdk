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
 * {@link PurchaseOrderCreateCmd} extends {@link TeaModel}
 *
 * <p>PurchaseOrderCreateCmd</p>
 */
public class PurchaseOrderCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buyerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyerId;

    @com.aliyun.core.annotation.NameInMap("deliveryAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private AddressInfo deliveryAddress;

    @com.aliyun.core.annotation.NameInMap("extInfo")
    private java.util.Map<String, ?> extInfo;

    @com.aliyun.core.annotation.NameInMap("outerPurchaseOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerPurchaseOrderId;

    @com.aliyun.core.annotation.NameInMap("productList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ProductDTO> productList;

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
    public java.util.Map<String, ?> getExtInfo() {
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
    public java.util.List<ProductDTO> getProductList() {
        return this.productList;
    }

    public static final class Builder {
        private String buyerId; 
        private AddressInfo deliveryAddress; 
        private java.util.Map<String, ?> extInfo; 
        private String outerPurchaseOrderId; 
        private java.util.List<ProductDTO> productList; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>buyer2138237</p>
         */
        public Builder buyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryAddress(AddressInfo deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * extInfo.
         */
        public Builder extInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>outer123456</p>
         */
        public Builder outerPurchaseOrderId(String outerPurchaseOrderId) {
            this.outerPurchaseOrderId = outerPurchaseOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productList(java.util.List<ProductDTO> productList) {
            this.productList = productList;
            return this;
        }

        public PurchaseOrderCreateCmd build() {
            return new PurchaseOrderCreateCmd(this);
        } 

    } 

}
