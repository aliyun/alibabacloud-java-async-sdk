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
 * {@link ProductDTO} extends {@link TeaModel}
 *
 * <p>ProductDTO</p>
 */
public class ProductDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("price")
    private Long price;

    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String purchaserId;

    @com.aliyun.core.annotation.NameInMap("quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer quantity;

    @com.aliyun.core.annotation.NameInMap("skuId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skuId;

    private ProductDTO(Builder builder) {
        this.price = builder.price;
        this.productId = builder.productId;
        this.purchaserId = builder.purchaserId;
        this.quantity = builder.quantity;
        this.skuId = builder.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductDTO create() {
        return builder().build();
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    public static final class Builder {
        private Long price; 
        private String productId; 
        private String purchaserId; 
        private Integer quantity; 
        private String skuId; 

        /**
         * price.
         */
        public Builder price(Long price) {
            this.price = price;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6600****6736</p>
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>56****2304</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6600****6737</p>
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        public ProductDTO build() {
            return new ProductDTO(this);
        } 

    } 

}
