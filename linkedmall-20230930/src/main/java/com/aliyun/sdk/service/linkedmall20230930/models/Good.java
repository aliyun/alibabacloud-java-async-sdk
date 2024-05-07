// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Good} extends {@link TeaModel}
 *
 * <p>Good</p>
 */
public class Good extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("goodName")
    private String goodName;

    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Integer quantity;

    private Good(Builder builder) {
        this.goodName = builder.goodName;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Good create() {
        return builder().build();
    }

    /**
     * @return goodName
     */
    public String getGoodName() {
        return this.goodName;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    public static final class Builder {
        private String goodName; 
        private String productId; 
        private Integer quantity; 

        /**
         * goodName.
         */
        public Builder goodName(String goodName) {
            this.goodName = goodName;
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
         * quantity.
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public Good build() {
            return new Good(this);
        } 

    } 

}
