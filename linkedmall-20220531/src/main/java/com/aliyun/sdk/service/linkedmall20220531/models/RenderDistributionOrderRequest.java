// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenderDistributionOrderRequest} extends {@link RequestModel}
 *
 * <p>RenderDistributionOrderRequest</p>
 */
public class RenderDistributionOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BuyerId")
    private String buyerId;

    @Body
    @NameInMap("DeliveryAddress")
    private String deliveryAddress;

    @Body
    @NameInMap("DistributionSupplierId")
    private String distributionSupplierId;

    @Body
    @NameInMap("DistributorId")
    private String distributorId;

    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

    @Body
    @NameInMap("ItemInfoLists")
    private java.util.List < ItemInfoLists> itemInfoLists;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private RenderDistributionOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buyerId = builder.buyerId;
        this.deliveryAddress = builder.deliveryAddress;
        this.distributionSupplierId = builder.distributionSupplierId;
        this.distributorId = builder.distributorId;
        this.extInfo = builder.extInfo;
        this.itemInfoLists = builder.itemInfoLists;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderDistributionOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return buyerId
     */
    public String getBuyerId() {
        return this.buyerId;
    }

    /**
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * @return distributionSupplierId
     */
    public String getDistributionSupplierId() {
        return this.distributionSupplierId;
    }

    /**
     * @return distributorId
     */
    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return itemInfoLists
     */
    public java.util.List < ItemInfoLists> getItemInfoLists() {
        return this.itemInfoLists;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RenderDistributionOrderRequest, Builder> {
        private String regionId; 
        private String buyerId; 
        private String deliveryAddress; 
        private String distributionSupplierId; 
        private String distributorId; 
        private String extInfo; 
        private java.util.List < ItemInfoLists> itemInfoLists; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RenderDistributionOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buyerId = request.buyerId;
            this.deliveryAddress = request.deliveryAddress;
            this.distributionSupplierId = request.distributionSupplierId;
            this.distributorId = request.distributorId;
            this.extInfo = request.extInfo;
            this.itemInfoLists = request.itemInfoLists;
            this.tenantId = request.tenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BuyerId.
         */
        public Builder buyerId(String buyerId) {
            this.putBodyParameter("BuyerId", buyerId);
            this.buyerId = buyerId;
            return this;
        }

        /**
         * DeliveryAddress.
         */
        public Builder deliveryAddress(String deliveryAddress) {
            this.putBodyParameter("DeliveryAddress", deliveryAddress);
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * DistributionSupplierId.
         */
        public Builder distributionSupplierId(String distributionSupplierId) {
            this.putBodyParameter("DistributionSupplierId", distributionSupplierId);
            this.distributionSupplierId = distributionSupplierId;
            return this;
        }

        /**
         * DistributorId.
         */
        public Builder distributorId(String distributorId) {
            this.putBodyParameter("DistributorId", distributorId);
            this.distributorId = distributorId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * ItemInfoLists.
         */
        public Builder itemInfoLists(java.util.List < ItemInfoLists> itemInfoLists) {
            String itemInfoListsShrink = shrink(itemInfoLists, "ItemInfoLists", "json");
            this.putBodyParameter("ItemInfoLists", itemInfoListsShrink);
            this.itemInfoLists = itemInfoLists;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public RenderDistributionOrderRequest build() {
            return new RenderDistributionOrderRequest(this);
        } 

    } 

    public static class ItemInfoLists extends TeaModel {
        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("SkuId")
        private String skuId;

        private ItemInfoLists(Builder builder) {
            this.distributionMallId = builder.distributionMallId;
            this.lmItemId = builder.lmItemId;
            this.quantity = builder.quantity;
            this.skuId = builder.skuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemInfoLists create() {
            return builder().build();
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
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
            private String distributionMallId; 
            private String lmItemId; 
            private Integer quantity; 
            private String skuId; 

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(String skuId) {
                this.skuId = skuId;
                return this;
            }

            public ItemInfoLists build() {
                return new ItemInfoLists(this);
            } 

        } 

    }
}
