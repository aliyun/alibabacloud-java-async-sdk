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
 * {@link ProductSaleInfoQuery} extends {@link TeaModel}
 *
 * <p>ProductSaleInfoQuery</p>
 */
public class ProductSaleInfoQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("distributorShopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String distributorShopId;

    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    private ProductSaleInfoQuery(Builder builder) {
        this.distributorShopId = builder.distributorShopId;
        this.divisionCode = builder.divisionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductSaleInfoQuery create() {
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

    public static final class Builder {
        private String distributorShopId; 
        private String divisionCode; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22000009</p>
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

        public ProductSaleInfoQuery build() {
            return new ProductSaleInfoQuery(this);
        } 

    } 

}
