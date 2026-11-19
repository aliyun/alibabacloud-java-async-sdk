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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PurchaseOrderRenderQuery model) {
            this.buyerId = model.buyerId;
            this.deliveryAddress = model.deliveryAddress;
            this.extInfo = model.extInfo;
            this.productList = model.productList;
        } 

        /**
         * <p>The actual buyer ID for distribution. <notice>Assign a unique ID to each buyer. Do not use the same ID for different buyers.</notice></p>
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
         * <p>The address information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder deliveryAddress(AddressInfo deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * <p>The extension information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>The product list.</p>
         * <blockquote>
         * <p>Maximum number of SKUs per purchase order: 20.</p>
         * </blockquote>
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
