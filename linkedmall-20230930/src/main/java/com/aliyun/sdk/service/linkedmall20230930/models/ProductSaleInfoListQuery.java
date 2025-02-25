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
 * {@link ProductSaleInfoListQuery} extends {@link TeaModel}
 *
 * <p>ProductSaleInfoListQuery</p>
 */
public class ProductSaleInfoListQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    @com.aliyun.core.annotation.NameInMap("productIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> productIds;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String purchaserId;

    private ProductSaleInfoListQuery(Builder builder) {
        this.divisionCode = builder.divisionCode;
        this.productIds = builder.productIds;
        this.purchaserId = builder.purchaserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductSaleInfoListQuery create() {
        return builder().build();
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return productIds
     */
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public static final class Builder {
        private String divisionCode; 
        private java.util.List<String> productIds; 
        private String purchaserId; 

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productIds(java.util.List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22000009</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        public ProductSaleInfoListQuery build() {
            return new ProductSaleInfoListQuery(this);
        } 

    } 

}
