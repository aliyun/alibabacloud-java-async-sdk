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
 * {@link SkuSaleInfoListQuery} extends {@link TeaModel}
 *
 * <p>SkuSaleInfoListQuery</p>
 */
public class SkuSaleInfoListQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("divisionCode")
    private String divisionCode;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String purchaserId;

    @com.aliyun.core.annotation.NameInMap("skuQueryParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SkuQueryParam> skuQueryParams;

    private SkuSaleInfoListQuery(Builder builder) {
        this.divisionCode = builder.divisionCode;
        this.purchaserId = builder.purchaserId;
        this.skuQueryParams = builder.skuQueryParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkuSaleInfoListQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    /**
     * @return skuQueryParams
     */
    public java.util.List<SkuQueryParam> getSkuQueryParams() {
        return this.skuQueryParams;
    }

    public static final class Builder {
        private String divisionCode; 
        private String purchaserId; 
        private java.util.List<SkuQueryParam> skuQueryParams; 

        private Builder() {
        } 

        private Builder(SkuSaleInfoListQuery model) {
            this.divisionCode = model.divisionCode;
            this.purchaserId = model.purchaserId;
            this.skuQueryParams = model.skuQueryParams;
        } 

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21000017</p>
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder skuQueryParams(java.util.List<SkuQueryParam> skuQueryParams) {
            this.skuQueryParams = skuQueryParams;
            return this;
        }

        public SkuSaleInfoListQuery build() {
            return new SkuSaleInfoListQuery(this);
        } 

    } 

}
