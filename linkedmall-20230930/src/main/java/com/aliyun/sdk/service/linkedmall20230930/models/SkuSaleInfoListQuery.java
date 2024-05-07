// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < SkuQueryParam > skuQueryParams;

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
    public java.util.List < SkuQueryParam > getSkuQueryParams() {
        return this.skuQueryParams;
    }

    public static final class Builder {
        private String divisionCode; 
        private String purchaserId; 
        private java.util.List < SkuQueryParam > skuQueryParams; 

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * skuQueryParams.
         */
        public Builder skuQueryParams(java.util.List < SkuQueryParam > skuQueryParams) {
            this.skuQueryParams = skuQueryParams;
            return this;
        }

        public SkuSaleInfoListQuery build() {
            return new SkuSaleInfoListQuery(this);
        } 

    } 

}
