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
 * {@link RenderOrderWithDesignatedTbUidRequest} extends {@link RequestModel}
 *
 * <p>RenderOrderWithDesignatedTbUidRequest</p>
 */
public class RenderOrderWithDesignatedTbUidRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ItemList> itemList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tbAccountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbUserId")
    private Long tbUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    private RenderOrderWithDesignatedTbUidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.deliveryAddress = builder.deliveryAddress;
        this.itemList = builder.itemList;
        this.tbAccountType = builder.tbAccountType;
        this.tbUserId = builder.tbUserId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderOrderWithDesignatedTbUidRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /**
     * @return itemList
     */
    public java.util.List<ItemList> getItemList() {
        return this.itemList;
    }

    /**
     * @return tbAccountType
     */
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    /**
     * @return tbUserId
     */
    public Long getTbUserId() {
        return this.tbUserId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static final class Builder extends Request.Builder<RenderOrderWithDesignatedTbUidRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String deliveryAddress; 
        private java.util.List<ItemList> itemList; 
        private String tbAccountType; 
        private Long tbUserId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(RenderOrderWithDesignatedTbUidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.deliveryAddress = request.deliveryAddress;
            this.itemList = request.itemList;
            this.tbAccountType = request.tbAccountType;
            this.tbUserId = request.tbUserId;
            this.thirdPartyUserId = request.thirdPartyUserId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL202***001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryAddress(String deliveryAddress) {
            this.putBodyParameter("DeliveryAddress", deliveryAddress);
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder itemList(java.util.List<ItemList> itemList) {
            String itemListShrink = shrink(itemList, "ItemList", "json");
            this.putBodyParameter("ItemList", itemListShrink);
            this.itemList = itemList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ANONY</p>
         */
        public Builder tbAccountType(String tbAccountType) {
            this.putBodyParameter("TbAccountType", tbAccountType);
            this.tbAccountType = tbAccountType;
            return this;
        }

        /**
         * TbUserId.
         */
        public Builder tbUserId(Long tbUserId) {
            this.putBodyParameter("TbUserId", tbUserId);
            this.tbUserId = tbUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>U123***23</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putBodyParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public RenderOrderWithDesignatedTbUidRequest build() {
            return new RenderOrderWithDesignatedTbUidRequest(this);
        } 

    } 

    /**
     * 
     * {@link RenderOrderWithDesignatedTbUidRequest} extends {@link TeaModel}
     *
     * <p>RenderOrderWithDesignatedTbUidRequest</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        private ItemList(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.quantity = builder.quantity;
            this.skuId = builder.skuId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
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
        public Long getSkuId() {
            return this.skuId;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private Integer quantity; 
            private Long skuId; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
