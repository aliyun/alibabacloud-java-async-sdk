// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySupplierPriceAndPriceCentRequest} extends {@link RequestModel}
 *
 * <p>ModifySupplierPriceAndPriceCentRequest</p>
 */
public class ModifySupplierPriceAndPriceCentRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("LmItemId")
    private String lmItemId;

    @Query
    @NameInMap("LmShopId")
    private String lmShopId;

    @Query
    @NameInMap("PriceCent")
    private String priceCent;

    @Query
    @NameInMap("SkuId")
    private String skuId;

    @Query
    @NameInMap("SupplierPrice")
    private String supplierPrice;

    private ModifySupplierPriceAndPriceCentRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.lmItemId = builder.lmItemId;
        this.lmShopId = builder.lmShopId;
        this.priceCent = builder.priceCent;
        this.skuId = builder.skuId;
        this.supplierPrice = builder.supplierPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySupplierPriceAndPriceCentRequest create() {
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
    public String getLmShopId() {
        return this.lmShopId;
    }

    /**
     * @return priceCent
     */
    public String getPriceCent() {
        return this.priceCent;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return supplierPrice
     */
    public String getSupplierPrice() {
        return this.supplierPrice;
    }

    public static final class Builder extends Request.Builder<ModifySupplierPriceAndPriceCentRequest, Builder> {
        private String bizId; 
        private String lmItemId; 
        private String lmShopId; 
        private String priceCent; 
        private String skuId; 
        private String supplierPrice; 

        private Builder() {
            super();
        } 

        private Builder(ModifySupplierPriceAndPriceCentRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.lmItemId = request.lmItemId;
            this.lmShopId = request.lmShopId;
            this.priceCent = request.priceCent;
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
        public Builder lmShopId(String lmShopId) {
            this.putQueryParameter("LmShopId", lmShopId);
            this.lmShopId = lmShopId;
            return this;
        }

        /**
         * PriceCent.
         */
        public Builder priceCent(String priceCent) {
            this.putQueryParameter("PriceCent", priceCent);
            this.priceCent = priceCent;
            return this;
        }

        /**
         * SkuId.
         */
        public Builder skuId(String skuId) {
            this.putQueryParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * SupplierPrice.
         */
        public Builder supplierPrice(String supplierPrice) {
            this.putQueryParameter("SupplierPrice", supplierPrice);
            this.supplierPrice = supplierPrice;
            return this;
        }

        @Override
        public ModifySupplierPriceAndPriceCentRequest build() {
            return new ModifySupplierPriceAndPriceCentRequest(this);
        } 

    } 

}
