// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProductSaleInfoListQuery} extends {@link TeaModel}
 *
 * <p>ProductSaleInfoListQuery</p>
 */
public class ProductSaleInfoListQuery extends TeaModel {
    @NameInMap("distributorShopId")
    @Validation(required = true)
    private String distributorShopId;

    @NameInMap("divisionCode")
    private String divisionCode;

    @NameInMap("productIds")
    @Validation(required = true)
    private java.util.List < String > productIds;

    private ProductSaleInfoListQuery(Builder builder) {
        this.distributorShopId = builder.distributorShopId;
        this.divisionCode = builder.divisionCode;
        this.productIds = builder.productIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductSaleInfoListQuery create() {
        return builder().build();
    }

    /**
     * @return distributorShopId
     */
    public String getDistributorShopId() {
        return this.distributorShopId;
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
    public java.util.List < String > getProductIds() {
        return this.productIds;
    }

    public static final class Builder {
        private String distributorShopId; 
        private String divisionCode; 
        private java.util.List < String > productIds; 

        /**
         * distributorShopId.
         */
        public Builder distributorShopId(String distributorShopId) {
            this.distributorShopId = distributorShopId;
            return this;
        }

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * productIds.
         */
        public Builder productIds(java.util.List < String > productIds) {
            this.productIds = productIds;
            return this;
        }

        public ProductSaleInfoListQuery build() {
            return new ProductSaleInfoListQuery(this);
        } 

    } 

}
