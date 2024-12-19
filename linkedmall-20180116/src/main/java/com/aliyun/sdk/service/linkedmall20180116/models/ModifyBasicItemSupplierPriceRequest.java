// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ModifyBasicItemSupplierPriceRequest} extends {@link RequestModel}
 *
 * <p>ModifyBasicItemSupplierPriceRequest</p>
 */
public class ModifyBasicItemSupplierPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmItemId")
    private String lmItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmShopId")
    private Long lmShopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkuId")
    private Long skuId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierPrice")
    private Long supplierPrice;

    private ModifyBasicItemSupplierPriceRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.lmItemId = builder.lmItemId;
        this.lmShopId = builder.lmShopId;
        this.skuId = builder.skuId;
        this.supplierPrice = builder.supplierPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBasicItemSupplierPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return lmShopId
     */
    public Long getLmShopId() {
        return this.lmShopId;
    }

    /**
     * @return skuId
     */
    public Long getSkuId() {
        return this.skuId;
    }

    /**
     * @return supplierPrice
     */
    public Long getSupplierPrice() {
        return this.supplierPrice;
    }

    public static final class Builder extends Request.Builder<ModifyBasicItemSupplierPriceRequest, Builder> {
        private String bizId; 
        private String lmItemId; 
        private Long lmShopId; 
        private Long skuId; 
        private Long supplierPrice; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBasicItemSupplierPriceRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.lmItemId = request.lmItemId;
            this.lmShopId = request.lmShopId;
            this.skuId = request.skuId;
            this.supplierPrice = request.supplierPrice;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putQueryParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * LmShopId.
         */
        public Builder lmShopId(Long lmShopId) {
            this.putQueryParameter("LmShopId", lmShopId);
            this.lmShopId = lmShopId;
            return this;
        }

        /**
         * SkuId.
         */
        public Builder skuId(Long skuId) {
            this.putQueryParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * SupplierPrice.
         */
        public Builder supplierPrice(Long supplierPrice) {
            this.putQueryParameter("SupplierPrice", supplierPrice);
            this.supplierPrice = supplierPrice;
            return this;
        }

        @Override
        public ModifyBasicItemSupplierPriceRequest build() {
            return new ModifyBasicItemSupplierPriceRequest(this);
        } 

    } 

}
