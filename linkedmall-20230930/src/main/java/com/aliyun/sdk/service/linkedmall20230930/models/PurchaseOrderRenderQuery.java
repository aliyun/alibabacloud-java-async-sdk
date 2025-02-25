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
 * {@link PurchaseOrderRenderQuery} extends {@link TeaModel}
 *
 * <p>PurchaseOrderRenderQuery</p>
 */
public class PurchaseOrderRenderQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buyerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyerId;

    @com.aliyun.core.annotation.NameInMap("deliveryAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private AddressInfo deliveryAddress;

    @com.aliyun.core.annotation.NameInMap("extInfo")
    private java.util.Map<String, ?> extInfo;

    @com.aliyun.core.annotation.NameInMap("productList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<OrderRenderProductDTO> productList;

    private PurchaseOrderRenderQuery(Builder builder) {
        this.buyerId = builder.buyerId;
        this.deliveryAddress = builder.deliveryAddress;
        this.extInfo = builder.extInfo;
        this.productList = builder.productList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseOrderRenderQuery create() {
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
     * @return productList
     */
    public java.util.List<OrderRenderProductDTO> getProductList() {
        return this.productList;
    }

    public static final class Builder {
        private String buyerId; 
        private AddressInfo deliveryAddress; 
        private java.util.Map<String, ?> extInfo; 
        private java.util.List<OrderRenderProductDTO> productList; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234567</p>
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
         */
        public Builder productList(java.util.List<OrderRenderProductDTO> productList) {
            this.productList = productList;
            return this;
        }

        public PurchaseOrderRenderQuery build() {
            return new PurchaseOrderRenderQuery(this);
        } 

    } 

}
