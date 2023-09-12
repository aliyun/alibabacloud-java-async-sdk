// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkuSaleInfoListQuery} extends {@link TeaModel}
 *
 * <p>SkuSaleInfoListQuery</p>
 */
public class SkuSaleInfoListQuery extends TeaModel {
    @NameInMap("distributorShopId")
    @Validation(required = true)
    private String distributorShopId;

    @NameInMap("divisionCode")
    private String divisionCode;

    @NameInMap("skuQueryParams")
    @Validation(required = true)
    private java.util.List < SkuQueryParam > skuQueryParams;

    private SkuSaleInfoListQuery(Builder builder) {
        this.distributorShopId = builder.distributorShopId;
        this.divisionCode = builder.divisionCode;
        this.skuQueryParams = builder.skuQueryParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkuSaleInfoListQuery create() {
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
     * @return skuQueryParams
     */
    public java.util.List < SkuQueryParam > getSkuQueryParams() {
        return this.skuQueryParams;
    }

    public static final class Builder {
        private String distributorShopId; 
        private String divisionCode; 
        private java.util.List < SkuQueryParam > skuQueryParams; 

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
